package com.rakuten.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.model.ContactMessage;
import com.rakuten.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository repository;
	
	public void send(ContactMessage message) {
		repository.save(message);
		System.out.println("Message has been saved!");
	}
}
