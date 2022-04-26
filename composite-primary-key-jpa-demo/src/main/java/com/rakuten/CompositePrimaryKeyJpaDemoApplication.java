package com.rakuten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositePrimaryKeyJpaDemoApplication implements CommandLineRunner{
	
	@Autowired
	EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CompositePrimaryKeyJpaDemoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee(new EmployeeIdentity("E-23", "C-32"), "Rahul Sahu", "rahul@gmail.com", "9876543210");
		
		repository.save(employee);
		
	}
	

}
