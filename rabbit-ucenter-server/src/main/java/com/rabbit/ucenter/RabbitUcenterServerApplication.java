package com.rabbit.ucenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


@EnableDiscoveryClient //开启Eureka服务注册和发现功能
@EnableAsync //异步执行，就是开启多线程
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.rabbit.ucenter.mapper")
@ComponentScan(basePackages = {"com.rabbit.common","com.rabbit.ucenter"})
@SpringBootApplication
public class RabbitUcenterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitUcenterServerApplication.class, args);
	}

	@Bean
	@Order(2147483647)
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(Boolean.valueOf(true));
		corsConfiguration.addAllowedOrigin("*");
		corsConfiguration.addAllowedHeader("*");
		corsConfiguration.addAllowedMethod("*");
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}
}

