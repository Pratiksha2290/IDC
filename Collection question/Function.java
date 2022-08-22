package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class Function {
    public static void main(String[] args) {
       // List<String> list=List.Of(1,2,3,4,5,6,7,8,9,10);
         ArrayList<Integer> l1 = new ArrayList<>();
        l1.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
        extracted(l1);
    }
    private static void extracted(ArrayList<Integer> l1) {
        int i = 0;
        for( int number : l1){
            i++;
            System.out.println(i + " * " + 10 + " = " + i*10);


       // for (int i =1;i<=10;i++) {
            //System.out.println(i + " * " + 10 + " = " + i*10);
        }
    }


/*
        int i ;
        System.out.print("Multiplication Table : ");

        for(i=10;i>=1;i--){
           // System.out.print("Multiplication Table : ");
            System.out.println(  10 + " * " + i  + " = " + i*10 );
        }*/


}


