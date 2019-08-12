package cn.tedu.mapper;

import cn.tedu.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    int insert(User record);

    int insertSelective(User record);

    @Select("select * from tb_user")
    List<User> selectAll();

    @Select("select * from tb_user where username=#{username}")
    User selectName(@Param("username")String username);

    @Select("select * from tb_user where phone=#{phone}")
    User selectphone(@Param("phone")String username);

    User selectOne(Long userId);

    void update(User user);

}
