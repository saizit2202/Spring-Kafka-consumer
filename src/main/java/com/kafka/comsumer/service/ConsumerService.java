package com.kafka.comsumer.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ConsumerService {

    Logger logger = Logger.getLogger(ConsumerService.class.getName());

    @KafkaListener(topics = "Notification",groupId = "Sathish")
    public void receive(String message){
        System.out.println(message);
    }

}
