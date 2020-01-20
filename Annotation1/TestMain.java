package com.Annotation1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.Annotation1");
        context.refresh();

        Student student = context.getBean("student",Student.class);
        student.display();
    }
}

