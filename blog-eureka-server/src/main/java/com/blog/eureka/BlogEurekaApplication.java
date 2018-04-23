package com.blog.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication //启动类必须加上这个注解
@EnableEurekaServer //表明这是服务注册中心
public class BlogEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogEurekaApplication.class, args);
	}
}
