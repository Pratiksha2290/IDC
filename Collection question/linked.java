package com.assignment;

import java.util.Iterator;
import java.util.LinkedList;

public class linked {
    public static void main(String[] args) {
        LinkedList<Integer> n = new LinkedList<>();
        n.add(34);
        n.add(78);
        n.add(55);
        n.add(0,12);
        n.addLast(65);

        Iterator<Integer> itr = n.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

            //Add 1st element
           // n.addFirst(12);
            //n.addLast(65);

        }
    }
}
