package com.example.demo.Configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic kafkaExperiment(){
        return TopicBuilder.name("justForFun")
                .build();
    }
    @Bean
    public NewTopic kafkaJsonExperiment(){
        return TopicBuilder.name("javaPractice_json")
                .build();
    }
}
