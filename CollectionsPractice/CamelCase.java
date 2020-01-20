package com.CollectionsPractice;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int count=0;

        for(int i=0;i<str.length()-1;i++){
            if(isUpperCase(str.charAt(i))){
                count++;
            }
        }
        System.out.println("Number of Words = "+(count+1));

    }
}
