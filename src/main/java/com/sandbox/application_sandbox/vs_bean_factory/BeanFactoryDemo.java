package com.sandbox.application_sandbox.vs_bean_factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;

public class BeanFactoryDemo {

    public static void main(String[] args) {

        BeanFactory beanFactory = createBeanFactory();

        System.out.println("BeanFactory created");

        System.out.println("Getting bean...");

        UserService service =
                beanFactory.getBean(UserService.class);

        service.hello();
    }

    private static BeanFactory createBeanFactory() {

        DefaultListableBeanFactory factory =
                new DefaultListableBeanFactory();

        AnnotatedBeanDefinitionReader reader =
                new AnnotatedBeanDefinitionReader(factory);

        reader.register(AppConfig.class);

        return factory;
    }
}
