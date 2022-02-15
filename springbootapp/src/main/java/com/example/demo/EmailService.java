package com.example.demo;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailService {

    @Async
    @SneakyThrows // tohle nepouzivat :-) jenom na skoleni :-))
    // POZOR! Tato metoda nesmi byt: private anebo static
    public void sendEmail(int i) {
        log.info("sending email {}", i);
        Thread.sleep(100);
    }

}
