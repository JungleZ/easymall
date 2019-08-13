package cn.tedu.service;

import cn.tedu.pojo.User;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface UserService {
    List<User> selectAll();

    String registerUser(User user, String sms,HttpServletResponse resp);


    String loginUser(User user, HttpServletResponse resp, String token);

    void updatePassword(Long userId, String oldPassword, String newPassword);

    void updateNickName(Long userId, String nickname);

    User updatePhone(Long userId, String oldPhone, String sms,String newPhone);
}
