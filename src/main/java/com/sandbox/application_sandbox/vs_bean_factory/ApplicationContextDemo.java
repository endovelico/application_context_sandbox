package com.sandbox.application_sandbox.vs_bean_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextDemo {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("ApplicationContext created");

        UserService service =
                context.getBean(UserService.class);

        service.hello();
    }
}
