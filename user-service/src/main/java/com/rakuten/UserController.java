package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	List<User> users = new ArrayList<>();
	
	@PostMapping
	void saveUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		users.add(user);
	}
	
//	@PostMapping("/all")
//	void saveUsers(@RequestBody User[] users) {
//		for(User user: users) {
//			this.users.add(user);
//		}
//	}
	
	@GetMapping
	List<User> getUsers() {
		System.out.println("Get request done");
		return users;
	}
	
	@GetMapping("/{name}")
	List<User> getUsersByName(@PathVariable String name) {
		if(name.isBlank()) {
			throw new IllegalArgumentException("Name cannot be blank");
		}
		System.out.println(name);
		List<User> filteredUsers = users.stream().filter((user) -> user.getName().equals(name)).collect(Collectors.toList());
		return filteredUsers;
	}
	
	@GetMapping("/age/{age}")
	List<User> getUsersByAge(@PathVariable int age) {
		if(age <= 0) {
			throw new IllegalArgumentException("age cannot be less than or equal to 0, age : " + age);
		}
		System.out.println("get users by age request");
		List<User> filteredUsers = users.stream().filter((user) -> user.getAge() == age).collect(Collectors.toList());
		return filteredUsers;
	}
}
