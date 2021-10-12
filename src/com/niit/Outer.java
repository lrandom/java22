package com.niit;

public class Outer {
    private String name = "Outer Class";

    public void demo() {
        class MethodLocalInner{
            public void demo() {
                System.out.println("Im local inner");
            }
        }

        MethodLocalInner methodLocalInner = new MethodLocalInner();
        methodLocalInner.demo();

    }

    class Inner{
        public void sayMyOuterClass() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        //Regular Inner Class
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.sayMyOuterClass();

    }
}
