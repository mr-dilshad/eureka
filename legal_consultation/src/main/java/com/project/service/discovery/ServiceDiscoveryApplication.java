package com.project.legal.consultation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LegalConsulationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegalConsulationApplication.class, args);
	}

}
