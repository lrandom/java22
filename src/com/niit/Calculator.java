package com.niit;

public class Calculator<T, K> {
    T object;
    public void printNum(T num1, K num2) {
        System.out.println(num1);
        System.out.println(num2);
    }

    public<E,T,F> void sayHi(E a, T b, F c) {
        System.out.println(a);
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator<Integer, String>();
        calculator.setObject(new Integer("Luan"));
        System.out.println(calculator.getObject());
        calculator.printNum("1", "2");

        Calculator calculator1 = new Calculator<Integer, Integer>();
        calculator1.printNum(1, 2);

        Calculator calculator2 = new Calculator<Float, Float>();
        calculator2.printNum(new Float(1).floatValue(),new Float(2).floatValue());

        //generic methods
        /*calculator.sayHi(new String("Hello"));
        calculator.sayHi(new Float(1));
        calculator.sayHi(new Integer(2));*/

    }
}
