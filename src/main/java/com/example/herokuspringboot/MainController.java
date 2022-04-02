package com.example.herokuspringboot;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {

    private static final AtomicInteger COUNTER = new AtomicInteger(0);

    @GetMapping("/ping")
    Map<String, Integer> ping() {
        return Map.of("counter", COUNTER.getAndIncrement());
    }

}
