package org.cris;

import org.cris.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
		
		restaurant.prepareTea();
		
		context.close();
	}

}
