package com.Annotation1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("student")
public class Student {
    @Value("Himanshu")
    private String sname;
    @Value("2912012")
    private int rollno;
    @Autowired
    private Marks marks;
    public void display(){
        System.out.println("Name: "+sname+" Roll no:"+rollno);
        marks.display();
    }
}
