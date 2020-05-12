package com.fuwu.fileService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FileServiceApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(FileServiceApplication.class, args);
	}


}
