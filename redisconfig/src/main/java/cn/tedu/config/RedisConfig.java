package cn.tedu.config;


import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Configuration
@ConditionalOnClass(RedisProperties.class)
public class RedisConfig {
    @Autowired
    private RedisProperties redisProperties;
//    private String sentinelsname;
//    @Bean
//    public Jedis jedis(){
//        return new Jedis(host,port);
//    }

    @Bean
    public ShardedJedisPool shardedJedisPool(){
        List<JedisShardInfo> list=new ArrayList<>();
        String[] split = redisProperties.getNodes().split(",");

        for (String s:split){
            String[] split1 = s.split(":");
            JedisShardInfo jedisShardInfo = new JedisShardInfo(split1[0], Integer.parseInt(split1[1]));
            list.add(jedisShardInfo);
        }
        //配置连接池
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        config.setMaxTotal(redisProperties.getMaxTotal());
        config.setMinIdle(redisProperties.getMinIdle());
        config.setMaxIdle(redisProperties.getMaxIdle());

        return new ShardedJedisPool(config,list);
    }
    @Bean
    public JedisCluster jedisCluster(){
        Set<HostAndPort> list=new HashSet<>();
        String[] split = redisProperties.getNodes().split(",");

        for (String s:split){
            list.add(new HostAndPort(s.split(":")[0], Integer.parseInt(s.split(":")[1])));
        }
        //配置连接池
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(redisProperties.getMaxTotal());
        config.setMaxIdle(redisProperties.getMaxIdle());
        config.setMinIdle(redisProperties.getMinIdle());

        return new JedisCluster(list,config);


    }


}
