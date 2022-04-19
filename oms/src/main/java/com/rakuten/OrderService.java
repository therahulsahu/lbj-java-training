package com.rakuten;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	OrderRepository repository;

	void saveOrder(Order order) {

		if (order.getPrice() <= 0) {
			throw new IllegalArgumentException("Price cannot be less than or equal to 0, Price : " + order.getPrice());
		}
		repository.save(order);
		System.out.println("Save method called");
	}

	public List<Order> getOrders() {
		return repository.findAll();
	}
}
