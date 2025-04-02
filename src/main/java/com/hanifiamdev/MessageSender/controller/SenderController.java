package com.hanifiamdev.MessageSender.controller;

import com.hanifiamdev.MessageSender.service.SendMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {

    @Autowired
    SendMessageService sendMsgService;

    @GetMapping(value = "/queue/sendMessage")
    public void sendMessage(@RequestParam("message") String message) {
        System.out.println("Message: " + message);
        sendMsgService.sendMsg(message);
    }

}
