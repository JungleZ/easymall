package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@EnableZuulProxy
public class StarterZuul1 {
    public static void main(String[] args) {
        SpringApplication.run(StarterZuul1.class,args);
    }
}
