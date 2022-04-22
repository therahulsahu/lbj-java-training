package com.rakuten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.model.ContactMessage;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository repository;
	
	void send(ContactMessage message) {
		repository.save(message);
		System.out.println("Message has been saved!");
	}
}
