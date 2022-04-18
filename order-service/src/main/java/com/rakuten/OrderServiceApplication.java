package com.rakuten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		System.out.println("Application started");
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
