package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicrosDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrosDemoApplication.class, args);
	}
	
	@Bean
//	@LoadBalanced
	public RestTemplate restTemplate() {
		
		return new RestTemplate();
	}


}