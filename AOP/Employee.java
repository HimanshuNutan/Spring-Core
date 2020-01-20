package com.AOP;


import org.springframework.stereotype.Component;

@Component
public class Employee {
    private  int eid;
    private String ename;

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
    public Employee showById(int eid){

        System.out.println(eid+"   "+ename);
        //throw new RuntimeException("User not found");
        return this;

    }

}
