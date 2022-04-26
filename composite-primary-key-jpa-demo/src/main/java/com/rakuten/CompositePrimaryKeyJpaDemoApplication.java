package com.rakuten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositePrimaryKeyJpaDemoApplication implements CommandLineRunner{
	
	@Autowired
	BookRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CompositePrimaryKeyJpaDemoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Book book = new Book(new BookIdentity("B-23", "A-32"), "Theory of computation", "Rahul sahu");
		repository.save(book);
	}
	

}
