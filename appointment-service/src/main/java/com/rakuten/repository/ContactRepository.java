package com.rakuten.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakuten.model.ContactMessage;

public interface ContactRepository extends JpaRepository<ContactMessage, Integer> {

}
