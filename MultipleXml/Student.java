package com.MultipleXml;

public class Student {
    private int sno;
    private String sname;

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    public void display(){
        System.out.println(sno+"  "+sname);
    }
}

