package com.notification.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.JsonMessageConverter;

@Configuration
public class ConvertMessage {

	@Bean
	public JsonMessageConverter convert() {
		return new JsonMessageConverter();
	}
}
