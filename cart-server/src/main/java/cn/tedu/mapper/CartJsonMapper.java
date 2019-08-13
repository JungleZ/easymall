package cn.tedu.mapper;


import cn.tedu.pojo.CartJson;
import cn.tedu.pojo.GoodsCat;

public interface CartJsonMapper {

    int insert(GoodsCat record);

    int insertSelective(GoodsCat record);

    void update(CartJson cartJson);
}
