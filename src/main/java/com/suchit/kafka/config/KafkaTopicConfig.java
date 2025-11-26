package com.suchit.kafka.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    public static final String TOPIC = "test-topic";

    @Bean
    public NewTopic createTopic() {
        return new NewTopic(TOPIC, 3, (short) 3);
    }
}
