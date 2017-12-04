package com.cy.study.config.kafka;

import java.util.Optional;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author cy
 *
 * 
 */
public class Listener {
	@KafkaListener(topics = { "test-topic" })
	public void listen(ConsumerRecord<?, ?> record) {
		Optional<?> kafkaMessage = Optional.ofNullable(record.value());
		if (kafkaMessage.isPresent()) {
			Object message = kafkaMessage.get();
			System.out.println("listen============================================================= " + message);
		}
	}
}
