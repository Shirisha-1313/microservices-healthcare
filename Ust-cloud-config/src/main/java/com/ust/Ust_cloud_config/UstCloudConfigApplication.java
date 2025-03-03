package com.ust.Ust_cloud_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableConfigServer
@Configuration
public class UstCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(UstCloudConfigApplication.class, args);
	}

}