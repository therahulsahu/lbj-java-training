package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

	List<Order> orders = new ArrayList<>();

	void saveOrder(Order order) {

		if (order.getPrice() <= 0) {
			throw new IllegalArgumentException("Price cannot be less than or equal to 0, Price : " + order.getPrice());
		}
		orders.add(order);
	}

	public List<Order> getOrders() {
		return orders;
	}
}
