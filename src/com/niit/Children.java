package com.niit;

public class Children extends Parent {
    public Children() {
        //super();
        System.out.println("Children");
    }

    public Children(String a, String b) {

    }

    @Override
    public void getName() {
        //super.getName();
        System.out.println("Im child");
    }

    public static void main(String[] args) {
        Children child = new Children("A","B");//Construct Parent
        child.getName();//Im child
    }
}
