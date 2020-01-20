package com.SpringJDBC1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("databaseconnection1.xml");

        contactDAO1 c1 = context.getBean("contactDAO1", contactDAO1.class);
        int response = c1.insert("Kislay","kkr@gmail.com","ECITY","999");
        System.out.println(response);
    }
}
