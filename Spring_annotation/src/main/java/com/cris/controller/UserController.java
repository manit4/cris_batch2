package com.cris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cris.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	public UserController() {
		System.out.println("inside UserController constr....");
	}
	
	

}
