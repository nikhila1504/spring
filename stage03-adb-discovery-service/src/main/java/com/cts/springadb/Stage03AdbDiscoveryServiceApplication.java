package com.cts.springadb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class Stage03AdbDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Stage03AdbDiscoveryServiceApplication.class, args);
	}

}
