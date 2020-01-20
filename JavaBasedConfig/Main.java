package com.JavaBasedConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.JavaBasedConfig");
        context.refresh();
        Student student = context.getBean("student",Student.class);
        student.showMessage();
        Marks marks = context.getBean("marks",Marks.class);
        System.out.println("Marks 1 "+ marks.getMarks1());
        System.out.println("Marks 2 " + marks.getMarks2());
        System.out.println("Marks 3 "+ marks.getMarks3());
        context.close();
    }
}
