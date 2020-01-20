package com.PropertyAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@PropertySources({
        @PropertySource("classpath:employee.properties"),
        @PropertySource("classpath:employeeadditional.properties")
})
@Component("employee")
public class Employee {
    @Value("${empid}")
    private String empid;
    @Value("${empname}")
    private String empname;
    @Value("${salary}")
    private String salary;
    @Value("${profile}")
    private String profile;
    public void display(){
        System.out.println("Employee ID  "+empid+"  Employee name  "+empname);
    }
}
