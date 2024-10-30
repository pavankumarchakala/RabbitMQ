package com.gogreen.producer.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.gogreen.producer.dto.MessageDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RabbitMQProducerService implements IRabbitMQProducerService {

	@Value("${rabbitmq.exchange.name}")
	private String exchange;

	@Value("${rabbitmq.routing.key}")
	private String routingKey;

	private final RabbitTemplate rabbitTemplate;

	@Override
	public void publish(MessageDto messageDto) {
		System.out.println("Message Produced: " + messageDto);
		rabbitTemplate.convertAndSend(exchange, routingKey, messageDto);
	}

}
