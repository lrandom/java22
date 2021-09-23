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

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Vui long cho biet so tuoi cua ban");
        int myAge =  myScanner.nextInt();
        System.out.println("So tuoi cua ban la " + myAge);
    }
}
