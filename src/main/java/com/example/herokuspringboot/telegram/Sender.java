package com.example.herokuspringboot.telegram;

import com.example.herokuspringboot.telegram.WebhookBot;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Sender {

    private final WebhookBot webhookBot;

    public Sender(WebhookBot webhookBot) {
        this.webhookBot = webhookBot;
    }

    @Async
    public void send(String text) {
        webhookBot.sendMessage(text);
    }

}
