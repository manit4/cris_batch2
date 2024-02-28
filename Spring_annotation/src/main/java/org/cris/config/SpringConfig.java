package org.cris.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cris.service.UserService;

@Configuration
@ComponentScan("org.cris, com.cris")
public class SpringConfig {
	
	@Bean
	public UserService getUserService1() {
		System.out.println("inside getUserService1()");
		return new UserService();
	}
	
	@Bean
	public UserService getUserService2() {
		System.out.println("inside getUserService2()");
		return new UserService();
	}

}
