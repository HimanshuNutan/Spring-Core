package com.ScopeOfBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("scopeofbean.xml");
        ScopeCheck scope1 = context.getBean("scope",ScopeCheck.class);
        System.out.println(scope1);
        ScopeCheck scope2 = context.getBean("scope",ScopeCheck.class);
        System.out.println(scope2);
    }
}
