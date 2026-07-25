package com.sandbox.application_sandbox.anti_patterns;

import com.sandbox.application_sandbox.anti_patterns.aux.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CreatingBeansManually {

    @Autowired
    private ApplicationContext context;

    public void register() {

        EmailService service =
                context.getBean(EmailService.class);

        service.registerUser();
    }
}
