package com.AOP;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopemployee.xml");
        Employee emp = context.getBean("aopemployee",Employee.class);
        Employee emp1;
        emp1=emp.showById(10);
        //emp1.showById(20);
    }
}
