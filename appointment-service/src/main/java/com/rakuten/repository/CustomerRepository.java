package com.rakuten.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakuten.model.Appointment;
import com.rakuten.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	List<Customer> findByEmailId(String emailId);
}
