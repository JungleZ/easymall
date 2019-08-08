package cn.tedu.controller;

import cn.tedu.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouponController {
    @Autowired
    private CouponService couponService;

}
