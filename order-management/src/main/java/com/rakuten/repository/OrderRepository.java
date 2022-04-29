package com.rakuten.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakuten.models.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
