package com.MultipleXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
     //   ApplicationContext context = new ClassPathXmlApplicationContext(new String[]
         //       {"student.xml","teacher.xml"})
        ApplicationContext context = new ClassPathXmlApplicationContext("teacher.xml");
        Student student = context.getBean("studentbean",Student.class);
        Teacher teacher = context.getBean("teacherbean",Teacher.class);
        student.display();
        teacher.display();
    }
}
