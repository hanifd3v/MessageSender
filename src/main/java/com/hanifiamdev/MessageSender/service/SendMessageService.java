package com.hanifiamdev.MessageSender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendMessageService {

    @Autowired
    JmsTemplate jmsTemplate;

    public static String destination = "learning";

    public void sendMsg(String message) {
        jmsTemplate.convertAndSend(destination, message);
        System.out.println("Message sent in queue");
    }
}
