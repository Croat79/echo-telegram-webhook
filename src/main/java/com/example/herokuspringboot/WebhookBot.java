package com.example.herokuspringboot;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Slf4j
@Component
public class WebhookBot extends TelegramLongPollingBot {

    private final TelegramProperties telegramProperties;

    public WebhookBot(TelegramProperties telegramProperties) {
        this.telegramProperties = telegramProperties;
    }

    @Override
    public String getBotUsername() {
        return "Phishing webhook";
    }

    @Override
    public String getBotToken() {
        return telegramProperties.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        log.debug("{}", update);
    }

    @SneakyThrows
    public void sendMessage(String text) {
        SendMessage message = new SendMessage();
        message.setChatId(telegramProperties.getChatId());
        message.setText(text);
        execute(message);
    }

}
