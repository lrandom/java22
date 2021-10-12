package com.niit;

public class Children extends Parent {
    public Children() {
        super();
    }

    @Override
    public void getName() {
        super.getName();
        System.out.println("Im child");
    }

    public static void main(String[] args) {
        Children child = new Children();//Construct Parent
        child.getName();//Im child
    }
}
