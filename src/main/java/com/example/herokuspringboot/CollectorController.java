package com.example.herokuspringboot;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollectorController {

    private final Sender sender;

    public CollectorController(Sender sender) {
        this.sender = sender;
    }

    @GetMapping("/c")
    void ping(@RequestParam("t") String text,
              HttpServletRequest httpServletRequest) {
        sender.send(text + " " + httpServletRequest.getRemoteAddr());
    }

}
