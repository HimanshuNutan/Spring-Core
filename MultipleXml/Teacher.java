package com.MultipleXml;

public class Teacher {
private int tid;
private String tname;

    public void setTid(int tid) {
        this.tid = tid;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
    public void display(){
        System.out.println(tid+"  "+tname);
    }
}
