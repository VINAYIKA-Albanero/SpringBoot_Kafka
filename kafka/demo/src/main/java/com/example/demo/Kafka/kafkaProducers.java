package com.example.demo.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class kafkaProducers {
    private static final Logger LOGGER= LoggerFactory.getLogger(kafkaProducers.class);
    private KafkaTemplate<String,String> kafkaTemplate;

    public kafkaProducers(KafkaTemplate<String, String> kafkaTemplate) {

        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(String message){
        LOGGER.info(String.format("message sent "),message);

        kafkaTemplate.send("justForFun",message);
    }
}
