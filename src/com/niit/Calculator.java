package com.niit;

public class Calculator<T, K> {
    public void printNum(T num1, K num2) {
        System.out.println(num1);
        System.out.println(num2);
    }

    public<E> void sayHi(E a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator<String, String>();
        calculator.printNum("1", "2");

        Calculator calculator1 = new Calculator<Integer, Integer>();
        calculator1.printNum(1, 2);

        Calculator calculator2 = new Calculator<Float, Float>();
        calculator2.printNum(new Float(1).floatValue(),new Float(2).floatValue());

        //generic methods
        calculator.sayHi(new String("Hello"));
        calculator.sayHi(new Float(1));
        calculator.sayHi(new Integer(2));

    }
}
