package com.suchit.kafka.producer;

import com.suchit.kafka.config.KafkaTopicConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send(KafkaTopicConfig.TOPIC, message);
        System.out.println("Sent message: " + message);
    }
}
