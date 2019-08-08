package cn.tedu.service;

import cn.tedu.mapper.CouponMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl implements CouponService {
    @Autowired
    private CouponMapper couponMapper;


}
