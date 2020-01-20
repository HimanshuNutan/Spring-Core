package com.JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;

@Configuration("student")
public class Student {

    @Description("Bean for Marks Class")
    @Scope("singleton")
    @Bean(name = "marks",initMethod = "initial", destroyMethod = "destruction")
    public Marks getmarks(){
        Marks marks = new Marks(89,79,90);
        return marks;
    }
    public void showMessage(){
        System.out.println("Hello");
    }
}
