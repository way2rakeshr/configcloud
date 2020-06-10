package com.example.configcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigcloudApplication.class, args);
	}

}
