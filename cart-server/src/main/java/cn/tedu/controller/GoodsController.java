package cn.tedu.controller;

import cn.tedu.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {
    @Autowired
    private CartService cartService;

}
