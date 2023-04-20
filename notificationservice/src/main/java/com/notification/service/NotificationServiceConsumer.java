package com.notification.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.notification.dto.MessageDTO;

@Service
public class NotificationServiceConsumer {

	private static final Logger log = LoggerFactory.getLogger(NotificationServiceConsumer.class);

	@KafkaListener(groupId = "notificationGroup", topics = "notification")
	public void sendMessage(MessageDTO messageDTO) {
		log.info("Received: " + messageDTO.getTo());
	}
}
