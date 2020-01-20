package com.AnnotationInject;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;


@Service
public class Customer {
    @Value("Himanshu")
    private String name;
    @Value("E-city")
    private String address;

    @Inject
    private Contact contactnumber;

    @PostConstruct
    public void init(){
        System.out.println("POSTCONSTRUCT");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("PREDESTROY");
    }
    public void display(){
        System.out.println(name+" "+address);
        contactnumber.display();
    }
}
