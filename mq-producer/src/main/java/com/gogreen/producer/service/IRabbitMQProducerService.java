package com.gogreen.producer.service;

import com.gogreen.producer.dto.MessageDto;

public interface IRabbitMQProducerService {

	void publish(MessageDto messageDto);

}
