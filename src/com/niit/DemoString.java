package com.niit;

public class DemoString {
    public static void main(String[] args) {
        String name = "Luan";//cách 1
        String name2 = "Luan";//cùng trỏ đến 1 ô nhớ

       // System.out.println(name.hashCode());
        // System.out.println(name2.hashCode());

        String address = new String("Quang Ninh"); // cách 2
        String address2 = new String("Quang Ninh");

        System.out.println(name==name2);
        System.out.println(address==address2);

    }
}
