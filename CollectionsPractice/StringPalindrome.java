package com.CollectionsPractice;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        String str;
        boolean p = true;
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();

        for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                p=false;
            }
        }
        if(p==true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }





        /*for(int i =str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }*/
       /* if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }*/
    }
}
