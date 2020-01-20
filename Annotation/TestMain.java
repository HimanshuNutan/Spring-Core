package com.Annotation;

import com.Annotation1.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.scan("com.Annotation");
    context.register(Employee.class);
    context.refresh();
    Organisation organisation = context.getBean("org",Organisation.class);
    organisation.display();

}}
