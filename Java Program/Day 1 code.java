package com.basic;


public class trial {
    int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    int nCr(int n, int r){
        return factorial(n)/(factorial(n-r)*factorial(r));
    }

    public static void main(String[] args) {
        trial hj=new trial();

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" "+hj.nCr(i,j));
            }
            System.out.println("");
        }


        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            for (int j = 0; j <= i; j++) {
                System.out.print(" "+j);
            }
            System.out.println("");
        }
    }
}
