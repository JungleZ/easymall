package cn.tedu.mapper;

import cn.tedu.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ReceiverMapper {

    int insert(User record);

    int insertSelective(User record);

}
