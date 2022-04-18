package com.rakuten;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducerService {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(OrderProducerService.class);
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	public void sendMessage(String message) {
		logger.info(String.format("Message sent -> %s", message));
		this.kafkaTemplate.send(AppConstants.TOPIC_NAME_TEST, message);
	}
	
	public void saveCreateOrderLog(Order order) {
		logger.info(String.format("Order created -> %s", order));
		if(order.getPrice() > 5000) {
			this.kafkaTemplate.send(AppConstants.TOPIC_NAME_FAST_SHIPMENT_ORDER, order);
		}else {
			this.kafkaTemplate.send(AppConstants.TOPIC_NAME_ORDER_LOG, order);
		}
	}
}
