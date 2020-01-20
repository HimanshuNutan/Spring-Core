package com.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("databaseconnection.xml");
        contactDAO contact = context.getBean("contactDAO",contactDAO.class);
       // contact.insert("Karan","def@gmail.com","Bengaluru","8888");
        List<Contact> list = contact.getAllContacts();
        ListIterator<Contact> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
        System.out.println(contact.getContactByContactId(2).getName());

    }
}
