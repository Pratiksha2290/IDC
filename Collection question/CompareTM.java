package com.assignment;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;

public class CompareTM {
    public static void main(String[] args) {
        TreeMap<String, Integer> Employee = new TreeMap<>();{
            Employee.put("Pratiksha",10);
            Employee.put("Govind", 20);
            Employee.put("Sunita", 30);

            System.out.println("TreeMap:" + Employee);
        }
        class Employee implements Comparator<String>{

            @Override
            public int compare(String Emp1, String Emp2) {
                return Emp1.compareTo(Emp2);
                // return Integer.compare(Emp1,Emp2);
            }
        }
    }
}