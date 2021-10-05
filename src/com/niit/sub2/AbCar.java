package com.niit.sub2;

public abstract class AbCar {
    //non abstract method
    public void start() {
        System.out.println("Starting");
    }

    //abstract method
    public abstract void stop();
}
