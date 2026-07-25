package com.sandbox.application_sandbox.anti_patterns;

import com.sandbox.application_sandbox.anti_patterns.aux.EmailService;
import com.sandbox.application_sandbox.anti_patterns.aux.PushService;
import com.sandbox.application_sandbox.anti_patterns.aux.SmsService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ExposingApplicationContextAsBean {

    private final ApplicationContext context;

    public ExposingApplicationContextAsBean(ApplicationContext context) {
        this.context = context;
    }

    public void registerUser() {

        EmailService email =
                context.getBean(EmailService.class);

        SmsService sms =
                context.getBean(SmsService.class);

        PushService push =
                context.getBean(PushService.class);

        // ...
    }
}
