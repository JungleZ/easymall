package cn.tedu.mapper;

import cn.tedu.pojo.Goods;

public interface CartMapper {

    int insert(Goods record);

    int insertSelective(Goods record);



}
