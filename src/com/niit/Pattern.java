package com.niit;

public class Pattern {
    public String shape; //hình vuông

    public static String material;

    public static void getName() {
        System.out.println("HI Im Chung Cake");
    }

    public static void main(String[] args) {
        Pattern chungCake = new Pattern();
        chungCake.shape = "Hinh vuong";

        Pattern.material = "Chất liệu";
        Pattern.shape = "Hinh vuong";
        Pattern.getName();


    }
}
