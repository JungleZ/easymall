package cn.tedu.mapper;

import cn.tedu.pojo.Goods;
import cn.tedu.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GoodsMapper {

    int insert(Goods record);

    int insertSelective(Goods record);



}
