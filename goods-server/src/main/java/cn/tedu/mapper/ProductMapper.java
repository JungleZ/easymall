package cn.tedu.mapper;


import cn.tedu.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductMapper {

    int insert(Product product);

    List<Product> queryAll();

    Integer queryCount();

    List<Product> pageQuery(@Param("start") int start, @Param("pageSize") Integer pageSize);
}
