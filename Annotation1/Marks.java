package com.Annotation1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("marks")
public class Marks {
    @Value("80")
    private int marks1;
    @Value("85")
    private int marks2;

    public void display(){
        System.out.println("Maths:"+marks1+"  English:"+marks2);
    }
}
