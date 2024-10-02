package com.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.producer.service.ProducerService;

@RestController
@RequestMapping("/producer-app")
public class ProducerController {

	@Autowired
	private ProducerService producerService;

	@GetMapping("/publish/{message}")
	public ResponseEntity<?> publishMessage(@PathVariable String message) {
		try {
			for (int i = 0; i <= 100000; i++) {
			producerService.sendmessagetoTopic(message + " : " + i);
			}
			return ResponseEntity.ok("message published successfully ..");
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.build();
		}
	}

}
