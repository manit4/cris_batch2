package org.cris;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Restaurant {
	
	public Restaurant() {
		System.out.println("inside Rest constr....");
	}
	
	void prepareTea() {
		
		System.out.println("I am preparing Tea...");
	}

}
