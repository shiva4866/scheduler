package com.example.scheduler;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "custom_topic", groupId = "my-consumer-group") // Change to your topic and consumer group
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
    }
}

