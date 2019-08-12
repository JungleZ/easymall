package cn.tedu.service;

import cn.tedu.exception.ServiceException;
import cn.tedu.mapper.UserMapper;
import cn.tedu.pojo.User;
import cn.tedu.utils.MD5Util;
import cn.tedu.utils.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private Jedis jedis;


    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public String loginUser(User user, HttpServletResponse resp, String token) {

        String password = user.getPassword();
        if(StringUtils.isEmpty(user.getUsername())||StringUtils.isEmpty(user.getPassword())){
            throw new ServiceException("用户名或密码不能为空！！！");
        }
        //1.将密码进行加密
        String md5Pass = MD5Util.md5(password);
        user.setPassword(md5Pass);
        //查询redis
        String userByRedis = null;
        if(!StringUtils.isEmpty(token)){
            userByRedis = loginUserByRedis(user,token);
            System.out.println("redis查询！");
        }
        if(userByRedis==null){//如果reids没有，则查数据库
            String userByDB = loginUserByDB(user,resp);
            System.out.println("数据库查询！");
            return userByDB;
        }
        return userByRedis;

    }

    private String loginUserByDB(User user,HttpServletResponse resp) {
        String password = user.getPassword();
        User  selectUserResult = userMapper.selectName(user.getUsername());
        try{
            if(selectUserResult==null){
                selectUserResult = userMapper.selectphone(user.getUsername());
            }
            if(selectUserResult==null||!selectUserResult.getPassword().equals(password)){
                throw  new ServiceException("用户名或密码不正确！！！");
            }
            //从数据库中查询的数据写入redis
            String token="RT_TICKET"+System.currentTimeMillis()+user.getPhone();//登入key
            resp.setHeader("token",token);//发送token给web
            resp.setHeader("Access-Control-Expose-Headers", "token");
            String userJson = MapperUtil.MP.writeValueAsString(selectUserResult);
            jedis.setex(token,60*60*24*2,userJson);
            selectUserResult.setPassword("xxxxx");
            String userJsontoWeb = MapperUtil.MP.writeValueAsString(selectUserResult);

            return userJsontoWeb;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    private String loginUserByRedis(User user,String token) {
        try{
//            String ticket="RT_TICKET"+System.currentTimeMillis()+user.getPhone();//登入key
            String userJsonByRedis = jedis.get(token);
            if(StringUtils.isEmpty(userJsonByRedis)){
                return null;
            }
            User readRedisUser = MapperUtil.MP.readValue(userJsonByRedis,user.getClass());
            if(user.getUsername().equals(readRedisUser.getName())||user.getUsername().equals(readRedisUser.getPhone())&&user.getPassword().equals(readRedisUser.getPassword())){
                readRedisUser.setPassword("xxxxxx");
                String userJsontoWeb = MapperUtil.MP.writeValueAsString(readRedisUser);
                return userJsontoWeb;
            }else{
                throw new ServiceException("账号或密码错误！！");
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    @Transactional
    public String registerUser(User user, String sms, HttpServletResponse resp) {
        if(StringUtils.isEmpty(user.getPhone())||StringUtils.isEmpty(user.getPassword())||StringUtils.isEmpty(sms)){
            throw new ServiceException("注册电话、密码或验证码不能为空！！");
        }
        User userByPhone = userMapper.selectphone(user.getPhone());

        if(userByPhone != null){
            throw new ServiceException("电话号码已经注册！");
        }

        String redisSms = jedis.get("sms"+user.getPhone());
        if (!sms.equals(redisSms)){
            throw new ServiceException("密码不正确！");
        }

        user.setPassword(MD5Util.md5(user.getPassword()));
        userMapper.insert(user);
//        String userJson= MapperUtil.MP.writeValueAsString(user);
//        try {
//            String token="RT_TICKET"+System.currentTimeMillis()+user.getPhone();//登入key
//            resp.setHeader("token",token);
//            String userJson = MapperUtil.MP.writeValueAsString(user);
//            jedis.setex(token,60*60*24*2,userJson);
//        }catch (Exception e){
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
        try{
            String userJsontoWeb = MapperUtil.MP.writeValueAsString(user);
            return userJsontoWeb;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    //修改密码
    @Override
    public void updatePassword(Long userId,String oldPassword,String newPassword) {
        User user=userMapper.selectOne(userId);
        if(user==null){
            throw new ServiceException("该用户不存在");
        }
        if(!user.getPassword().equals(MD5Util.md5(oldPassword))){
            throw new ServiceException("旧密码错误");
        }
        if(user.getPassword().equals(MD5Util.md5(newPassword))){
            throw new ServiceException("新密码与旧密码不能相同");
        }
//        user.setId(userId);
        user.setPassword(MD5Util.md5(newPassword));
        user.setUpdated(new Date());
        userMapper.update(user);
    }

    //修改昵称
    @Override
    public void updateNickName(Long userId, String Nickname){
        User user=userMapper.selectOne(userId);
        if(user==null){
            throw new ServiceException("该用户不存在");
        }
        if(user.getNickname().equals(Nickname)){
            throw new ServiceException("新昵称与旧昵称不能相同");
        }

        user.setNickname(Nickname);
        user.setUpdated(new Date());
        userMapper.update(user);
    }

    //校对验证码
    @Override
    @Transactional
    public void updatePhone(Long userId,String oldPhone,String sms,String newPhone){
        User user=userMapper.selectOne(userId);
        String VerificationCode=jedis.get("sms"+oldPhone);
        if (user==null){
            throw new ServiceException("该用户不存在！！");
        }
        if(oldPhone.equals(newPhone)){
            throw new ServiceException("新号码与旧号码不能相同！！");
        }

        User selectphone = userMapper.selectphone(newPhone);
        if(selectphone != null){
            throw new ServiceException("更改号码已经注册！！");
        }
        if(!VerificationCode.equals(sms)){
            throw new ServiceException("验证码不正确！！");
        }
//        user.setId(userId);
        user.setPhone(newPhone);
        user.setUpdated(new Date());
        userMapper.update(user);

    }

}
