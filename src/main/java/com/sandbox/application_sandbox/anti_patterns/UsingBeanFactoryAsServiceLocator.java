package com.sandbox.application_sandbox.anti_patterns;

import com.sandbox.application_sandbox.anti_patterns.aux.EmailService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Component;

@Component
public class UsingBeanFactoryAsServiceLocator {

    private final BeanFactory beanFactory;

    public UsingBeanFactoryAsServiceLocator(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public void placeOrder() {

        EmailService email =
                beanFactory.getBean(EmailService.class);

        email.send();
    }
}
