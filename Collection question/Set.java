package com.assignment;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> m = new HashSet<>();
        m.add(10);
        m.add(20);
        m.add(30);
        m.add(40);
        System.out.println("Hashset:" + m);

        Integer arr[] = new Integer[m.size()];
        m.toArray(arr);
        for(Integer i : arr)
            System.out.println("Array:" + i);
    }
}








