package com.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Double.sum;

public class BasicRunner {
    public static void main(String[] args) {

        Basic<Integer> l1 = new Basic<Integer>();
        l1.addElement(5);
        l1.addElement(2);

        System.out.println("Interger value: " + l1);

        Basic<Double> l2 = new Basic<>();
        l2.addElement(12.3);
        l2.addElement(23.8);

        System.out.println("Double value: " + l2);

        //Upper Bound WildCard
        List<Integer> List1 =  Arrays.asList(1,2,3,4);
        System.out.println("Total Sum : " + sum(List1));
    }

    private static double sum(List<Integer> list1) {
        double sum =0.0;
        for (Number i :list1) {
            sum += i.doubleValue();
        }
        return sum;
    }

}



