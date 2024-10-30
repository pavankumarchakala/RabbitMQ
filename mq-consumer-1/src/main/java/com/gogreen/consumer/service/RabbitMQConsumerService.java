package com.gogreen.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.gogreen.consumer.dto.MessageDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RabbitMQConsumerService {

	@RabbitListener(queues = { "${rabbitmq.queue.name}" })
	public void consume(MessageDto messageDto) {
		System.out.println("Message Received: " + messageDto);
	}

}
