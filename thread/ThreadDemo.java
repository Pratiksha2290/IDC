package com.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2= new MyThread();
        MyThread t3= new MyThread();
        t2.start();
        t2.setPriority(2);
        t3.setPriority(1);
        System.out.println( "t2 thread priority is :"+ t2.getPriority());
        System.out.println( "t3 thread priority is :"+ t3.getPriority());


    }
}
