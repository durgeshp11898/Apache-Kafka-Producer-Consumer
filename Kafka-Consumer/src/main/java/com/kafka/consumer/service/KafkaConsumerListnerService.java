package com.kafka.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListnerService {


	Logger logger = LoggerFactory.getLogger(KafkaConsumerListnerService.class);



	@KafkaListener(topics = "producerconfig",groupId = "jt-group")
	public void consumeEvents1(String  customer) {
		logger.info("consumer consume the events {} ", customer.toString());
	}

	@KafkaListener(topics = "producerconfig",groupId = "jt-group")
	public void consumeEvents2(String  customer) {
		logger.info("consumer consume the events {} ", customer.toString());
	}

	@KafkaListener(topics = "producerconfig",groupId = "jt-group")
	public void consumeEvents3(String  customer) {
		logger.info("consumer consume the events {} ", customer.toString());
	}

	@KafkaListener(topics = "producerconfig",groupId = "jt-group")
	public void consumeEvents4(String  customer) {
		logger.info("consumer consume the events {} ", customer.toString());
	}
}
