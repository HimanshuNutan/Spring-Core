package com.Collcns;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collections.xml");
        Employee employee = context.getBean("collection",Employee.class);
        employee.displayDetails();
      //  System.out.println(employee.getEmpid());
     //   System.out.println(employee.getEmpname());
       // System.out.println(employee.getStaffname());

    }
}
