package cn.tedu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Service
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    private Jedis jedis;

    @Override
    public void saveHistory(String history, Long userId) {

        String historyKey = "history_" + userId;
        jedis.sadd(historyKey, history);
    }

    @Override
    public List<String> queryMyHistory(Long userId) {
        String historyKey = "history_" + userId;
        List<String> strings = new ArrayList<>();
        //判断是否存在
        if (jedis.exists(historyKey)) {
            //获取set中所有member
            Set<String> smembers = jedis.smembers(historyKey);
            //准备返回的List
            for (String s : smembers) {
                strings.add(s);
            }
        }
        return strings;
    }

    @Override
    public void deleteHistory(Long userId) {
        String historyKey = "history_" + userId;
        //删除set中商品id
        jedis.srem(historyKey);

    }
}

