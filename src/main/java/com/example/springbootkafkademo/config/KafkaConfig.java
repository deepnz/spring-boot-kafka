package com.example.springbootkafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic kafkaTopic() {
        return TopicBuilder.name("java_in_use_topic")
                .build();
    }
}
