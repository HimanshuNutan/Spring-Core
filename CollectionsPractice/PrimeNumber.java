package com.CollectionsPractice;

import static java.lang.StrictMath.sqrt;

public class PrimeNumber {
    public static void main(String[] args) {

    /*int j=0;int prime=1;
    for(int i=1;i<100;i++){
        prime=1;
        if(i>2){
        for(j=2;j<sqrt(i);j++){
            if(i%j==0)
            {
                prime = 0;
            }
        }}
        if(i==1 || i==2){
            prime = 1;
        }

       if (prime == 0){
           System.out.println(i+ "  Not Prime");
       }
       else{
           System.out.println(i+ "  Prime");
       }*/

    boolean a[] = new boolean[101];
    for(int i=2;i<=100;i++){a[i]=true;}


    for(int i=2;i<=sqrt(100);i++) {
        for(int j=i;j<=(100/i);j++) {
            a[j * i] = false;

        }
    }
    for(int i=1;i<100;i++){
        if(a[i]==true){
            System.out.println(i);
        }
    }



    }



}
