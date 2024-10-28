package com.newust.Car_Eureka_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CarEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarEurekaServiceApplication.class, args);
	}

}
