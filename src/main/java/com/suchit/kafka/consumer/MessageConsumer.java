package com.suchit.kafka.consumer;

import com.suchit.kafka.config.KafkaTopicConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {


    @KafkaListener(topics = KafkaTopicConfig.TOPIC, groupId = "${spring.kafka.consumer.group-id}")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
