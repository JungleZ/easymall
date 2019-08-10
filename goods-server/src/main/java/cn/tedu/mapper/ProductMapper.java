package cn.tedu.mapper;


import cn.tedu.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductMapper {

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> queryAll();

}
