package com.thread;

import com.sun.source.tree.SynchronizedTree;

class MyThread extends Thread {
    @Override
    synchronized public void run() {
        try {
            int i = 0;
            while (i < 10) {
                Thread.sleep(2000);
                System.out.println("Good Morning");
                Thread.sleep(200);
                System.out.println("Welcome");

                i++;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    }


















