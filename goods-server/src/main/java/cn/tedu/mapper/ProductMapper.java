package cn.tedu.mapper;


import cn.tedu.pojo.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductMapper {

    int insert(Product record);

    int insertSelective(Product record);

}
