package com.CollectionsPractice;

import java.util.*;

public class Anagram {
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
                    count++;
                }
            }
        }
        System.out.println(count);

    }

        public static boolean isAnagram(String str1,String str2){
            boolean isAnag = true;

            if(str1.length()==str2.length()) {
                for (int i = 0; i < str1.length(); i++) {boolean charpresent = false,charpresent1=false;
                    for (int j = 0; j < str2.length(); j++) {
                        if(str1.charAt(i)==str2.charAt(j)){
                            charpresent = true;
                        }
                        if(str2.charAt(i)==str1.charAt(j)){
                           charpresent1 = true;
                        }
                    }
                    if(charpresent == false||charpresent1==false){isAnag = false;}
                }
            }
            else{isAnag=false;}
            if(isAnag == true){
                System.out.println(str1 + " "+str2 );
            }
            return isAnag;
          }
}
