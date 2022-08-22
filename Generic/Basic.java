package com.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic<T extends Number> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T Element) {
        list.add(Element);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    //Upper Bound Wildcard
  /*  private static double sum(List<? extends Number> List1) {
        double sum =0.0;
        for (Number i : List1) {
            sum += i.doubleValue();
        }
        return sum;
    }*/

}



