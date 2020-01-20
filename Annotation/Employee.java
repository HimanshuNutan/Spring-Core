package com.Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("employee")
public class Employee {
    @Value("Himanshu")
    private String empname;
    @Value("HPE1234")
    private String eid;
    public void display(){
        System.out.println("Name:"+empname+" ,id: "+eid);
    }
}
