package com.fuwu.articleService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ArticleServiceApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ArticleServiceApplication.class, args);
	}


}
