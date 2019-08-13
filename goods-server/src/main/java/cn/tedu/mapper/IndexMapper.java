package cn.tedu.mapper;

import cn.tedu.pojo.Product;
import cn.tedu.pojo.SeckillGoods;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IndexMapper {


    List<Product> hotList();

    List<SeckillGoods> seckillList();

    List<Product> shoesList();

    List<Product> pantsList();

    List<Product> clothesList();

    List<Product> groupbuyList();
}
