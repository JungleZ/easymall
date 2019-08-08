package cn.tedu.service;

import cn.tedu.mapper.OrderGoodsMapper;
import cn.tedu.mapper.OrderMapper;
import cn.tedu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderGoodsMapper orderGoodsMapper;

}
