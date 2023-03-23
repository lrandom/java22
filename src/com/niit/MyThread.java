package com.niit;

public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                sleep(1000);
            }
        } catch (Exception e) {
        }
    }
}
