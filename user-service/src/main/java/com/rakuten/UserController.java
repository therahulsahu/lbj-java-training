package com.rakuten;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	
	
	@PostMapping
	void saveUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		
		service.save(user);
	}
	
	
	@GetMapping
	List<User> getUsers() {
		System.out.println("Get request done");
		return service.getAllUsers();
	}
	
	
	@GetMapping("/{name}")
	List<User> getUsersByName(@PathVariable String name) {
		if(name.isBlank()) {
			throw new IllegalArgumentException("Name cannot be blank");
		}
		return service.getUserByName(name);
	}
	
	@GetMapping("/age/{age}")
	List<User> getUsersByAge(@PathVariable int age) {
		if(age <= 0) {
			throw new IllegalArgumentException("age cannot be less than or equal to 0, age : " + age);
		}
		return service.getUserByAge(age);
	}
}
