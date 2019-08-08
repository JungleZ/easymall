package cn.tedu.mapper;

import cn.tedu.pojo.Goods;
import cn.tedu.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsMapper {

    int insert(Goods record);

    int insertSelective(Goods record);



}
