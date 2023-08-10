package com.khaliullov.hello_kafka_consumer.service;

import com.khaliullov.hello_kafka_consumer.config.KafkaConsumerConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = KafkaConsumerConfiguration.TOPIC_NAME_1)
    public void consume(String message){
        log.info("Consume new message: {}", message);
    }

    @KafkaListener(topics = KafkaConsumerConfiguration.TOPIC_NAME_2)
    public void consume1(String message){
        log.info("Consume new message: {}", message);
    }
}
