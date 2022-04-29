package com.rakuten;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.models.Order;
import com.rakuten.repository.OrderRepository;

@Service
public class OrderManagementService {
	
	@Autowired
	OrderRepository repository;
	
	public void save(Order order) {
		repository.save(order);
		System.out.println("order saved");
	}
	
	public List<Order> getAllOrders() {
		return repository.findAll();
	}
}
