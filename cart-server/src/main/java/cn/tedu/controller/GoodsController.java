package cn.tedu.controller;

import cn.tedu.service.CartService;
import cn.tedu.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class GoodsController {
    @Autowired
    private CartService cartService;

    @RequestMapping("/update/{userId}")
    public SysResult update(@PathVariable Long userId, String json) {
        try {
            cartService.update(userId, json);
            return SysResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return SysResult.build(201, e.getMessage(), null);
        }
    }
}
