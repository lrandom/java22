package com.niit;

public class B2 {
    public static void main(String[] args) {
        String name = "Luan";
        String token = "X";
        token = token.replace("X", "XXXXXXXXXX"); //"XXXXXXXXX"
        token = token.replace("X","XXXXXXXXXX");
        token = token.replace("X", "XXXXXXXXXX");
        token = token.replace("X", name);
        System.out.println(token);
    }
}
