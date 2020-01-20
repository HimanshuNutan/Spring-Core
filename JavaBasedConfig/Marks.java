package com.JavaBasedConfig;

public class Marks {
    private int marks1;
    private int marks2;
    private int marks3;

    public Marks(int m1,int m2,int m3){
     marks1 = m1;
     marks2 = m2;
     marks3 = m3;
    }
    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }
    public void initial(){
        System.out.println("Initialising data");
    }
    public void destruction(){
        System.out.println("Destroying everything");
    }
}
