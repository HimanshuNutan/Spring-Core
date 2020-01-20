package com.ConfigurationFiles;

public class Employee {
    private int empid;
    private String empname;
    private String salary;
    private String profile;

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void display(){
        System.out.println(empid + "  "+ empname+ " "+salary+" "+profile);
    }
}
