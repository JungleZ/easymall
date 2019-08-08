package cn.tedu.service;

import cn.tedu.mapper.UserMapper;
import cn.tedu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
