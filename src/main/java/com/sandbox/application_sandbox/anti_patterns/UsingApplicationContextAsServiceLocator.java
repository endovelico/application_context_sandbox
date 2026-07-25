package com.sandbox.application_sandbox.anti_patterns;

import com.sandbox.application_sandbox.anti_patterns.aux.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//Why it's bad
//Violates Dependency Injection.
//Hides dependencies.
//Harder to test.
//Couples business logic to Spring.


@Component
public class UsingApplicationContextAsServiceLocator {

    @Autowired
    private ApplicationContext context;

    public void placeOrder() {
        PaymentService paymentService =
                context.getBean(PaymentService.class);

        paymentService.processPayment();
    }

}
