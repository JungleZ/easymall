package cn.tedu.config;

import cn.tedu.pojo.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInterceptor implements HandlerInterceptor {
    private static ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    private Jedis jedis;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String token = request.getHeader("token");
        System.out.println(token);
        if (StringUtils.isEmpty(token)) {
            response.setStatus(201);
            return false;
        }
        String userJson = jedis.get(token);

        if (StringUtils.isEmpty(userJson)) {
            response.setStatus(201);
            return false;
        }
        User user = objectMapper.readValue(userJson, User.class);

        UserTheadLocal.set(user);

        return true; // 继续访问controller
    }
}
