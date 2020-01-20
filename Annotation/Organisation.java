package com.Annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("org")
public class Organisation {
    private String orgname="HPE";
    private int orgid=11;


    @Autowired
    private com.Annotation.Employee employee;

@Qualifier("emp")
    @Autowired
    private com.Annotation1.Employee emp;

    @Autowired
    private Address address;
    public void display(){
        System.out.println(orgname + " ,id:"+ orgid);
        emp.display();
        address.display();
    }
}
