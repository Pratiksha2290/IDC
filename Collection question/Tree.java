package com.assignment;

import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet<String> TreeClone = new TreeSet<String>();
        TreeClone.add("A");
        TreeClone.add("B");
        TreeClone.add("C");
        System.out.println("TreeSet:" +TreeClone);
        TreeSet clone_set = new TreeSet();
        clone_set = (TreeSet)TreeClone.clone();
        System.out.println("Cloned TreeSet:"  + clone_set);


        //Normal form of treeset
       // List<String> list = List.of("A","B","C","D");
        TreeSet<String> m = new TreeSet<String>();
        m.add("sai");
        m.add("ketu");
        m.add("Riyu");
        m.add("sai");
        System.out.println("TreeSet:" + m);

    }
}
