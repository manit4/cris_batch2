package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dto.User;

@Service
public class UserService {
	
	List<User> users;
	
	public UserService() {
	
		User user1 = new User("100", "Vijay", "11111", null);
		User user2 = new User("101", "Munish", "22222", null);
		User user3 = new User("102", "Shubham", "33333", null);
		
		users = new ArrayList<User>();
		users.add(user1);   users.add(user2);   users.add(user3);
	}

	public User getUserById(String id) {
		
		User returnedUser = null;
		
		for( User user : users) {
			
			if(user.getId().equals(id)) {
				returnedUser = user;
			}
		}
		return returnedUser;
	}
}
