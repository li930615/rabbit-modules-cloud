package com.rabbit.ucenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient //开启Eureka服务注册和发现功能
@EnableSwagger2
@EnableAsync //异步执行，就是开启多线程
@SpringBootApplication
public class RabbitUcenterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitUcenterServerApplication.class, args);
	}

}

