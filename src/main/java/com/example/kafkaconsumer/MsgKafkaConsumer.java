package com.example.kafkaconsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MsgKafkaConsumer {
    @KafkaListener(topics = "out")
    public void msgListener(ConsumerRecord<Long, String> record) {
        System.out.println(record.key());
        System.out.println(record.value());
    }
}
