package com.example.demo;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class EmailController {

    @Async
    @GetMapping("/sendEmails")
    public void sendEmails() {
        for (int i = 0; i < 100; i++) {
            sendEmail(i);
        }
    }

    @SneakyThrows // tohle nepouzivat :-)
    public void sendEmail(int i) {
        log.info("sending email {}", i);
        Thread.sleep(100);
    }

}
