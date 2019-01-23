package com.rabbit.ucenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@EnableDiscoveryClient //开启Eureka服务注册和发现功能
@EnableAsync //异步执行，就是开启多线程
@SpringBootApplication
public class RabbitUcenterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitUcenterServerApplication.class, args);
	}

}

