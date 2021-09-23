package com.niit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*int myAge = 20;
        String name = "Nam";

        System.out.println("My age is "+myAge); //My age is 20
        System.out.printf("My age is %d %n",myAge);//My age is 20
        System.out.printf("The float is %.3f %n", 0.003);
        System.out.printf("The float is %s",name);*/

        /*Scanner myScanner = new Scanner(System.in);
        System.out.println("Vui long cho biet so tuoi cua ban");
        int myAge = myScanner.nextInt();
        System.out.println("So tuoi cua ban la " + myAge);*/

        int i = 0;
        System.out.println(i++);//0
        System.out.println(i);//1

        int ii = 0;
        System.out.println(++ii);//1
        System.out.println(!true);//false

        int age = 19;
        if (age > 18) {
            System.out.println("Bạn đã đủ tuổi");
        }else{
            System.out.println("Bạn chưa đủ tuổi");
        }

        //ba ngôi trinary
        String msg = (age > 18) ? "Bạn đã đủ tuổi" : "Bạn chưa đủ tuổi";
        System.out.println(msg);

        //ép kiểu ngầm định
        short number = 20;
        int number2 = number;

        //ép kiểu tường mình
        int number3 = 50;
        short number4 = (short) number3;
    }
}
