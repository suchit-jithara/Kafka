package com.suchit.kafka.consumer;

import com.suchit.kafka.config.KafkaTopicConfig;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @KafkaListener(topics = KafkaTopicConfig.TOPIC, groupId = "group-1")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
