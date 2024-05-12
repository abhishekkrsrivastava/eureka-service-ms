package com.example.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceMsApplication.class, args);
	}

}
