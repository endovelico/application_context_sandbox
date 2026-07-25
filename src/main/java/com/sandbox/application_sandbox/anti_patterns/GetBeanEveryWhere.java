package com.sandbox.application_sandbox.anti_patterns;

import com.sandbox.application_sandbox.anti_patterns.aux.EmailService;
import com.sandbox.application_sandbox.anti_patterns.aux.PushService;
import com.sandbox.application_sandbox.anti_patterns.aux.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//Problem
//
//The class becomes a mini-container instead of letting Spring manage dependencies.

@Component
public class GetBeanEveryWhere {

    @Autowired
    private ApplicationContext context;

    public void send() {

        EmailService email =
                context.getBean(EmailService.class);

        SmsService sms =
                context.getBean(SmsService.class);

        PushService push =
                context.getBean(PushService.class);

        email.send();
        sms.send();
        push.send();
    }
}
