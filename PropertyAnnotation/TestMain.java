package com.PropertyAnnotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.scan("com.PropertyAnnotation");
        context.refresh();
        Organisation organisation = context.getBean("org",Organisation.class);
        organisation.display();

    }
}
