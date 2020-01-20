package com.Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("address")
public class Address {
    @Value("10")
    private int laneno;
    @Value("E-city")
    private String area;
    public void display(){
        System.out.println("Lane no "+laneno+" ,"+area);
    }
}
