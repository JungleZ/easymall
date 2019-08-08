package cn.tedu.controller;

import cn.tedu.pojo.User;
import cn.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public List<User> userServicetest(){
        return userService.selectAll();
    }
}
