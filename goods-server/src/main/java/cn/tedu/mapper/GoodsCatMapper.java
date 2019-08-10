package cn.tedu.mapper;


import cn.tedu.pojo.GoodsCat;
import org.springframework.stereotype.Component;

@Component
public interface GoodsCatMapper {

    int insert(GoodsCat record);

    int insertSelective(GoodsCat record);

}
