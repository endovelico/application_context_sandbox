package com.sandbox.application_sandbox.vs_bean_factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
