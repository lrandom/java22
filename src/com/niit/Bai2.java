package com.niit;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int num = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Đây là số NT");
        } else {
            System.out.println("Đây ko phải số NT");
        }

        int sum = 1;
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                sum += j;
            }
        }

        if (sum == num) {
            System.out.println("Đây là số hoàn hảo");
        } else {
            System.out.println("Đây ko phải là số hoàn hảo");
        }
    }




}
