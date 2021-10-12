package com.niit;

public class StaticOuter {
    public static String outerName = "StaticOuter";
    public String innerName = "InnerName";

    static class Inner{
        public void sayMyOuterClass() {
            System.out.println(outerName);
        }
    }

    public static void main(String[] args) {
        StaticOuter.Inner inner = new StaticOuter.Inner();
        inner.sayMyOuterClass();
    }
}
