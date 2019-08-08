package cn.tedu.service;

import cn.tedu.mapper.GoodsCatMapper;
import cn.tedu.mapper.GoodsMapper;
import cn.tedu.mapper.ProductMapper;
import cn.tedu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsCatMapper goodsCatMapper;
    @Autowired
    private ProductMapper productMapper;

}
