package com.PropertyAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service("org")
public class Organisation {
    @Value("111")
    private int orgid;
    @Inject
    private Employee employee;
    public void display(){
        System.out.println(orgid);
        employee.display();
    }
}
