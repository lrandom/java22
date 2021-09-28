package com.niit;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Vui long nhap so a");
        a = scanner.nextInt();

        System.out.println("Vui long nhap so b");
        b = scanner.nextInt();

        System.out.println("Vui long nhap so c");
        c = scanner.nextInt();

        System.out.println("Tong cua ba so a,b,c la " + (a + b + c));

        int max = a;
        if (max < b) {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        System.out.printf("So lon nhat la %d",max);
    }
}
