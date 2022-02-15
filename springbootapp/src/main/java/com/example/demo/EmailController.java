package com.example.demo;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class EmailController {

    @Autowired
    private EmailService emailService; // tady je proxy

    // tohle moc nepouzivat:
//    @Lazy
//    @Autowired
//    private EmailController self;

//    @Async
    @GetMapping("/sendEmails") // GET operace by mely byt "idempotent" tzn. ze by nemely mit zadne "side-effects"
    public void sendEmails() {
        for (int i = 0; i < 100; i++) {
//            sendEmail(i);
            // MUSI SE PRISTUPOVAT PRES PROXY!!!
            emailService.sendEmail(i);
//            self.sendEmail(i);
        }
    }

//    @Async
//    @SneakyThrows // tohle nepouzivat :-) jenom na skoleni :-))
//    public void sendEmail(int i) {
//        log.info("sending email {}", i);
//        Thread.sleep(100);
//    }

}
