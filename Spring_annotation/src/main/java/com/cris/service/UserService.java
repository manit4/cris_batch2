package com.cris.service;

import org.springframework.stereotype.Service;

//@Service
public class UserService {
	
	public UserService() {
		System.out.println("inside UserService constr....");
	}
	
	public String getUser() {
		
		return "I am returning User to you....";
	}

}
