package com.sandbox.application_sandbox.anti_patterns.aux;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ApplicationContext applicationContext(ApplicationContext context) {
        return context;
    }
}
