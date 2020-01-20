package com.Collcns;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private int empid[] = new int[10];
    private Set<String> empname;
    private List<String> staffname;
    private Map<String,String> lockers;
    private Properties city;

    public void setCity(Properties city) {
        this.city = city;
    }

    public void setLockers(Map<String, String> lockers) {
        this.lockers = lockers;
    }

    public Map<String, String> getLockers() {
        return lockers;
    }

    public void setStaffname(List<String> staffname) {
        this.staffname = staffname;
    }

    public List<String> getStaffname() {
        return staffname;
    }

    public Set<String> getEmpname() {
        return empname;
    }

    public void setEmpname(Set<String> empname) {
        this.empname = empname;
    }

    public void setEmpid(int[] empid) {
        this.empid = empid;
    }

    public int[] getEmpid() {
        return empid;
    }
    public void displayDetails(){ int i=0,len;
       len=empid.length;
        while(len>0){
        System.out.println("Eid"+empid[i]);i++;len--;}

        System.out.println(empname);
        System.out.println(staffname);
        System.out.println(lockers);
        System.out.println(city);
    }
}
