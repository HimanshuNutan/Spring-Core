package com.CollectionsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListofList {


    public static void main(String[] args) {
         List l2 = new ArrayList<PracticeArrayList>();
        List list1 = new ArrayList<Student>();

        for(int i=0;i<100;i++){
            list1.add(new Student(" Kaalu "+i));
        }

        l2.add(list1);

      for(int i =0;i<l2.size();i++){
          PracticeArrayList innerList = (PracticeArrayList)l2.get(i);
          ListIterator iterator = innerList.getL1().listIterator();

      }

    }
}
