package cn.tedu.controller;

import cn.tedu.pojo.User;
import cn.tedu.service.ManberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenberController {
    @Autowired
    private ManberService manberService;
}


