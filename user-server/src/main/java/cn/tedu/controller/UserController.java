package cn.tedu.controller;

import cn.tedu.pojo.User;
import cn.tedu.service.UserService;
import cn.tedu.utils.RandomUtils;
import cn.tedu.utils.SmsUtil;
import cn.tedu.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private Jedis jedis;

    @RequestMapping("/test")
    public List<User> userServicetest(){
        return userService.selectAll();
    }

    @RequestMapping("/login")
    public SysResult doLogin(User user, HttpServletRequest req, HttpServletResponse resp){
//        try{
        String token = req.getHeader("token");
        String returnUser = userService.loginUser(user,resp,token );
        return SysResult.build(200,"ok",returnUser);
//        }catch (Exception e){
//            e.printStackTrace();
//            return SysResult.build(201,"fail",null);
//        }
    }

    @RequestMapping("/register")
    public SysResult doRegister(User user, String sms,HttpServletResponse resp){
//        try{
        String returnUser = userService.registerUser(user,sms,resp);
        return  SysResult.build(200,"ok",returnUser);
//        }catch (Exception e){
//            e.printStackTrace();
//            return SysResult.build(201,"fail",null);
//        }
    }

    @RequestMapping("/updatePassword")
    public SysResult updatePassword(Long userId, String oldPassword, String newPassword,HttpServletRequest request) {

        userService.updatePassword(userId,oldPassword,newPassword);
        String token = request.getHeader("token");
        if (jedis.get(token)!=null){
            jedis.del(token);
        }
        return SysResult.ok();

    }
    @RequestMapping("/updateNickName")
    public SysResult updateNickName(Long userId, String nickname, HttpServletRequest request){
        userService.updateNickName(userId,nickname);
        String token = request.getHeader("token");
        if (jedis.get(token)!=null){
            jedis.del(token);
        }

        return SysResult.ok();
    }

    @RequestMapping("/sms")
    public SysResult sendSms(String phone) {
        String code = RandomUtils.Ramdom();
        try{
            SmsUtil.sendSms(code,phone);
            jedis.setex("sms"+phone,60*5,code);
            return SysResult.ok();
        }catch(Exception e){
            e.printStackTrace();
            return SysResult.build(201,"发送验证码失败，请重新发送",null);
        }

    }

    @RequestMapping("/updatePhone")
    public SysResult updatePhone(Long userId,String oldPhone,String sms,String newPhone,HttpServletRequest request){
        try{
            User user = userService.updatePhone(userId,oldPhone,sms,newPhone);
            String token = request.getHeader("token");
            if (jedis.get(token)!=null){
                jedis.del(token);
            }
            return SysResult.ok();
        }catch (Exception e){
            e.printStackTrace();
            return SysResult.build(201,"更改号码失败",null);
        }
    }

    @RequestMapping("/test3")
    public String kb(){
        jedis.set("name","ziheng");
        System.out.println(jedis.get("name"));
        jedis.flushAll();
        System.out.println(jedis.get("name"));
        return jedis.get("name");
    }

}