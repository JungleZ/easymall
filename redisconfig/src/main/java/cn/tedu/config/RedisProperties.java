package cn.tedu.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ConfigurationProperties("redis.cluster")
@PropertySource("classpath:jedis/jedis.properties")
public class RedisProperties {
    @Value("${jedis.redis.cluster.nodes}")
//    @Value("${redis.cluster.nodes}")
    private String nodes;
//    @Value("${redis.cluster.maxTotal}")
    @Value("${jedis.redis.maxTotal}")
    private Integer maxTotal;
//    @Value("${redis.cluster.maxIdle}")
@Value("${jedis.redis.maxIdle}")
    private Integer maxIdle;
//    @Value("${redis.cluster.minIdle}")
@Value("${jedis.redis.minIdle}")
    private Integer minIdle;

    public Integer getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(Integer maxTotal) {
        this.maxTotal = maxTotal;
    }

    public Integer getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(Integer maxIdle) {
        this.maxIdle = maxIdle;
    }

    public Integer getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(Integer minIdle) {
        this.minIdle = minIdle;
    }

    public String getNodes() {
        return nodes;
    }

    public void setNodes(String nodes) {
        this.nodes = nodes;
    }
}