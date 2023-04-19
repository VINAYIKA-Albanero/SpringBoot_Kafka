package com.example.demo.Kafka;

import com.example.demo.Payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service

public class JsonConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonConsumer.class);
    @KafkaListener(topics = "javaPractice_json", groupId = "my Group")
    public void consume(User user){
        LOGGER.info(String.format("Json message recieved", user.toString()));
    }
}
