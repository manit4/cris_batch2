package com.example.exceptions;

import lombok.Data;

@Data
public class MyCustomException extends RuntimeException {

	String id;

	public MyCustomException(String id) {
		
		this.id = id;

	}
}
