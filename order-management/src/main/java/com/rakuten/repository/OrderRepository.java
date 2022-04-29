package com.rakuten.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakuten.models.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	Order findFirstByOrderByIdDesc();
	
	List<Order> findByCustomerId(int customerId);
}
