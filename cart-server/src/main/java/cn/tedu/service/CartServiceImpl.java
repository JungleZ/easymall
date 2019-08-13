package cn.tedu.service;

import cn.tedu.mapper.CartJsonMapper;
import cn.tedu.mapper.CartMapper;
import cn.tedu.pojo.CartJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartJsonMapper cartJsonMapper;


    @Override
    public void update(Long userId, String json) {
        CartJson cartJson = new CartJson();
        cartJson.setUserId(userId);
        cartJson.setJson(json);
        cartJson.setUpdated(new Date());
        cartJsonMapper.update(cartJson);
    }
}
