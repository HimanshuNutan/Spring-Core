package com.Annotation1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("emp")
public class Employee {
    @Value("Kunal")
    private String empname;
    @Value("HPE4567")
    private String eid;
    public void display(){
        System.out.println("Name:"+empname+" ,id: "+eid);
    }
}
