package com.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(4);
        l1.add(7);
        l1.add(9);
        l1.add(8);
        l1.add(2);
        System.out.print(" Before updating values: ");
        Iterator itr = l1.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
            System.out.println();
          // System.out.print(" After updating values: ");
        }
        System.out.print(" After updating values: ");
        l1.add(56);
        l1.add(43);
        l1.add(87);
        for(int i = 0;i<=l1.size();i++){
            System.out.println(l1.get(i));
        }



    }
}
