package cn.tedu.mapper;


import cn.tedu.pojo.GoodsCat;

public interface CartJsonMapper {

    int insert(GoodsCat record);

    int insertSelective(GoodsCat record);

}
