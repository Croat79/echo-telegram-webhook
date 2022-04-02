package com.example.herokuspringboot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "tg")
public class TelegramProperties {

    private String token;
    private String chatId;

}
