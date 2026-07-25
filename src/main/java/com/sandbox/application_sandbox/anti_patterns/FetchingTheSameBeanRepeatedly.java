package com.sandbox.application_sandbox.anti_patterns;

import com.sandbox.application_sandbox.anti_patterns.aux.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/*
* Why it's bad
Unnecessary lookups.
Makes code harder to read.
Singleton beans should simply be injected once.
* */
@Component
public class FetchingTheSameBeanRepeatedly {

    @Autowired
    private ApplicationContext context;

    public void generate() {

        for (int i = 0; i < 1000; i++) {

            EmailService report =
                    context.getBean(EmailService.class);

            report.send();
        }
    }
}
