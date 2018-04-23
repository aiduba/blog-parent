package com.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication //启动类上必须加入这个注解
@EnableEurekaClient //表明只是服务提供者
public class BlogUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogUserServiceApplication.class, args);
	}
}
