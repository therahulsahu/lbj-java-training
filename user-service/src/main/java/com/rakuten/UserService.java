package com.rakuten;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;

	Integer save(User user) {
		
		repository.save(user);
		System.out.println("Save method called");
		return user.getId();
	}

	List<User> getAllUsers() {
		return repository.findAll();
	}

	public List<User> getUserByName(String name) {
		if (name.isBlank()) {
			throw new IllegalArgumentException("Name cannot be blank");
		}
		List<User> filteredUsers = getAllUsers().stream().filter((user) -> user.getName().equals(name))
				.collect(Collectors.toList());
		return filteredUsers;
	}

	public List<User> getUserByAge(int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("age cannot be less than or equal to 0, age : " + age);
		}
		List<User> filteredUsers = getAllUsers().stream().filter((user) -> user.getAge() == age).collect(Collectors.toList());
		return filteredUsers;
	}

}
