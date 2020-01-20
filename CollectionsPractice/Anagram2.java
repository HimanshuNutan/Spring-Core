package com.CollectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Anagram2 {
    public static void main(String[] args) {

        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = i + 1; j <= str.length()&&(j-i)<str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(isAnagram(list.get(i),list.get(j))){
                    System.out.println(list.get(i)+list.get(j));
                    count++;
                }
            }
        }
        System.out.println(count);


    }
    public static boolean isAnagram(String str1,String str2){
        boolean isAna = true;
        char []stri1 = str1.toCharArray();
        char []stri2 = str2.toCharArray();
        Arrays.sort(stri1);
        Arrays.sort(stri2);
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                if(stri1[i]==stri2[i]){}
                else{isAna = false;}
            }
        }else{isAna = false;}
        return isAna;
    }
}
