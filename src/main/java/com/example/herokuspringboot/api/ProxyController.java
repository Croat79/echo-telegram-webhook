package com.example.herokuspringboot.api;

import com.example.herokuspringboot.telegram.Sender;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProxyController {

    private final Sender sender;

    public ProxyController(Sender sender) {
        this.sender = sender;
    }

    @GetMapping("/c")
    void proxyToSender(@RequestParam("t") String text, HttpServletRequest httpServletRequest) {
        sender.send(text + " " + httpServletRequest.getRemoteAddr());
    }

}
