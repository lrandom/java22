package com.niit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //đối tượng là một thể hiện (instance) duy nhất của lớp
        Human luan = new Human();
        Human nam = new Human();
        luan.setName("Luan");
        nam.setName("Nam");

        //. dot nation
        luan.hairColor = "Đen";//truy cập trực tiếp đến thuộc tính //sai rule lập trình
        luan.setHairColor("Đen");

        System.out.printf(luan.hairColor);
        System.out.printf(luan.getHairColor());


        luan.eat();
        nam.eat();
    }
}
