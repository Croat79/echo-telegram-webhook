package com.example.herokuspringboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CollectorController {

    @GetMapping("/c")
    void ping(@RequestParam("t") String text) {
        log.info("Input: {}", text);
    }

}
