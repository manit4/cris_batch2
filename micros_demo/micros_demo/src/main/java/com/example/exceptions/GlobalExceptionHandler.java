package com.example.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MyCustomException.class)
	public String userNotAvailable(MyCustomException ex) {
		
		String id = ex.getId();
		
		return "User is not available with the user id "+id;
	}

}
