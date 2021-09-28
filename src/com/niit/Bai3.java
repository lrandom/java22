package com.niit;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, choose = 0;

        while (choose <= 4) {
            System.out.println("Vui long nhap vao hai so a va b");
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println("Vui long chon");
            System.out.println("1. Tinh tong hai so");
            System.out.println("2. Tinh hieu hai so");
            System.out.println("3. Tinh tich hai so");
            System.out.println("4. Tinh thuong hai so");
            System.out.println("Any key. Thoát ctrinh");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Tổng hai số là " + (a + b));
                    break;

                case 2:
                    System.out.println("Hiệu hai số là " + (a - b));
                    break;

                case 3:
                    System.out.println("Tích hai số là " + (a * b));
                    break;

                case 4:
                    System.out.println("Thương hai số là " + (a / b));
                    break;

                default:
                    System.exit(1);
            }
        }
    }
}
