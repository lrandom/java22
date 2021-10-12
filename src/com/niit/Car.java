package com.niit;

public class Car implements Furniture, Exterior {
    @Override
    public void openDoor() {
        System.out.println("Open Door");
    }

    @Override
    public void turnOnAirCondition() {
        System.out.println("turnOn Condition");
    }
}
