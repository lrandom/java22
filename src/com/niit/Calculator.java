package com.niit;

public class Calculator {
    public int total(int a, int b) {
        return a + b;
    }

    public int total(int a, int b, int c) {
        return a + b + c;
    }

    public int total(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int total(int a, float b) {
        return (int)(a + b);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.total(1, 2);
        calc.total(3, 4, 5);
        calc.total(3, 4, 5, 6);
        calc.total(1, new Float(1).floatValue());
    }
}
