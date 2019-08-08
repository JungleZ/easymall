package cn.tedu.mapper;

import cn.tedu.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MenberMapper {

    int insert(User record);

    int insertSelective(User record);

    @Select("select * from tb_user")
    List<User> selectAll();

}
