package com.niit;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();

        t1.start();
        t1.setPriority(1);
        try {
            t1.join();
        } catch (Exception e) {

        }

        t2.start();
        t2.setPriority(7);
        t3.start();
        t3.setPriority(8);

        Thread t4 = new Thread(new MyThread2());
        t4.start();
        t4.setPriority(10);

    }
}
