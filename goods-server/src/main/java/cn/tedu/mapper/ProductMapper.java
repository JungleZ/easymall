package cn.tedu.mapper;


import cn.tedu.pojo.Product;

public interface ProductMapper {

    int insert(Product record);

    int insertSelective(Product record);

}
