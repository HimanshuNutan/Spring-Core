package com.AnnotationInject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Contact {
    @Value("91")
    private int countrycode;
    @Value("9999999999")
    private long mobilenumber;
    public void display(){
        System.out.println(countrycode+" "+mobilenumber);
    }
}
