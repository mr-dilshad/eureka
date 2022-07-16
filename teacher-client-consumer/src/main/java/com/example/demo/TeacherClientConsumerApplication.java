package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class TeacherClientConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherClientConsumerApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate getWebClient(){
		return new RestTemplate();
	}

}
