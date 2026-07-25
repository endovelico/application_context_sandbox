package com.sandbox.application_sandbox.anti_patterns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/*
* Why it's bad
Global state.
Difficult to test.
Tight coupling to Spring.
Makes dependencies invisible.
* */

@Component
public class StoringApplicationContextInStaticVariable {

    private static ApplicationContext context;

    @Autowired
    public StoringApplicationContextInStaticVariable(ApplicationContext context) {
        StoringApplicationContextInStaticVariable.context = context;
    }

    public static ApplicationContext getContext() {
        return context;
    }

    //NOTE: THEN Everywhere we are using UserService service =
    //        SpringContext.getContext().getBean(UserService.class);
}
