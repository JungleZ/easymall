package cn.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("cn.tedu.mapper")
@EnableEurekaClient
public class SpringReceiverServiceRun {
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringReceiverServiceRun.class,args);
	}
}
