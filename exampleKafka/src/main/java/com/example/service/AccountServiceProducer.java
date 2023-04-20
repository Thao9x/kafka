package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.dto.AccountDTO;
import com.example.dto.MessageDTO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountServiceProducer {

	private static final Logger log = LoggerFactory.getLogger(AccountServiceProducer.class);
	private KafkaTemplate<String, Object> template;
	
	public AccountDTO create(@RequestBody AccountDTO accountDTO) {
//		StatisticDTO dto = new StatisticDTO("Account " + accountDTO.getEmail() + " is created ", new Date());
		
		// send notificaiton
		MessageDTO messageDTO = new MessageDTO();
		messageDTO.setTo(accountDTO.getEmail());
		messageDTO.setToName(accountDTO.getAccountName());
		messageDTO.setSubject("Welcome to kafka");
		messageDTO.setContent("Hello, welcome to kafka");
		log.info("Send message");
		template.send("notification", messageDTO);
		return accountDTO;
	}

}
