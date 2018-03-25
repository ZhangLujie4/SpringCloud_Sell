package com.zlj.order.controller;

import com.zlj.order.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by 张璐杰
 * 2018/3/25 10:33
 */
@RestController
public class SendMessageController {

    @Autowired
    private StreamClient streamClient;

    @GetMapping("/sendMessage")
    public void process() {
        String message = "now" + new Date();
        streamClient.output().send(MessageBuilder.withPayload(message).build());
    }
}
