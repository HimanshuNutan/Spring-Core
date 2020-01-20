package com.AnnotationInject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.AnnotationInject");
        context.refresh();
        Customer customer = context.getBean("customer",Customer.class);
        customer.display();
        context.close();
    }
}
