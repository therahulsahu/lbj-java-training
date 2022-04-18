package com.rakuten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@Autowired
	OrderProducerService producerService;

	@PostMapping("/order")
	void createOrder(
			@RequestParam("orderId") int orderId, 
			@RequestParam("item") String item,
			@RequestParam("price") float price) {
		
		Order order = new Order();
		order.setId(orderId);
		order.setItem(item);
		order.setPrice(price);
		
		System.out.println("Order created");
		
		this.producerService.saveCreateOrderLog(order);
	}
	
	@GetMapping("/order")
	void getOrders() {
		System.out.println("GET orders");
	}
}
