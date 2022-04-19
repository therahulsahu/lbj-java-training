package com.rakuten;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService service;

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void saveOrder(@RequestBody Order order) {
		System.out.println(order.getItem());
		System.out.println(order.getPrice());

		service.saveOrder(order);
	}

	@GetMapping
	List<Order> fetchOrder() {
		return service.getOrders();
	}

}
