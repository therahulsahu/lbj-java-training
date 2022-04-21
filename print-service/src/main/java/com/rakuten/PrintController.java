package com.rakuten;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/print")
public class PrintController {
	@GetMapping
	void print() {
		System.out.println("printed");
	}
	
	@PostMapping
	String request() {
		return "Request Received";
	}
}
