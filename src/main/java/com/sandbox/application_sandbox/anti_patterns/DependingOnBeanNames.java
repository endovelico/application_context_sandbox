package com.sandbox.application_sandbox.anti_patterns;

import com.sandbox.application_sandbox.anti_patterns.aux.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/*
* Why it's bad
String literals aren't type-safe.
Renaming the bean can break the application.
Refactoring tools can't help.
* */
public class DependingOnBeanNames {

    @Autowired
    private ApplicationContext context;

    public void pay() {

        EmailService payment =
                (EmailService) context.getBean("EmailService");

        payment.send();
    }
}
