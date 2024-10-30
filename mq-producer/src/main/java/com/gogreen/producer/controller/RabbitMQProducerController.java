package com.gogreen.producer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gogreen.producer.dto.MessageDto;
import com.gogreen.producer.service.IRabbitMQProducerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mq/producer")
public class RabbitMQProducerController {

	private final IRabbitMQProducerService rabbitMQProducerService;

	@PostMapping("/publish")
	public void publishMessage(@RequestBody MessageDto messageDto) {
		rabbitMQProducerService.publish(messageDto);
	}
}
