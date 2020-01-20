package com.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("wiring.xml");
        Organisation organisation = context.getBean("org",Organisation.class);
        organisation.display();
    }
}
