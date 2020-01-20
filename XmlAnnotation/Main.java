package com.XmlAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("xmlannotation.xml");
        Customer customer = context.getBean("customer",Customer.class);
        System.out.println(customer.getName());
        System.out.println(customer.getAmountpaid());
        Contact contact = context.getBean("contact",Contact.class);
        System.out.println(contact.getContactno());
        System.out.println(contact.getMailid());
    }
}
