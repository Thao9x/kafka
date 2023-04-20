package com.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {
	@Bean
	public NewTopic notification() {
		// topic name, partition numbers, replication number
		return new NewTopic("notification", 1, (short) 1);
	}

//	@Bean
//	public NewTopic statistic() {
//		// topic name, partition numbers, replication number
//		return new NewTopic("statistic", 1, (short) 1);
//	}
}
