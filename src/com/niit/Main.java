package com.niit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  int num = 10;
        int arr[] = new int[]{1, 3, 4};

        try {
            num = arr[5];
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            //indexOutOfBoundsException.printStackTrace();
            System.out.println("Lỗi truy cập phần tử vuợt quá độ dài mảng");
        } catch (Exception exception) {
            System.out.println("Lỗi " + exception.getMessage());
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Hello");*/

/*        Employee employee = new Employee();
        try {
            employee.setAge(-1);
        } catch (RuntimeException e) {
            System.out.println("Tuoi khong the nho hon 0");
        } catch (Exception e) {
            System.out.println("Tuoi khong the lon hon 120");
            System.out.println("Vui long nhap lai tuoi");
        }*/

        //try with resources
/*        try (FileInputStream fis = new FileInputStream("note.txt")) {
            //doc file o cho nay
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Vui long dua vao dung duong dan file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("note.txt");
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Vui long dua vao dung duong dan file");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        System.out.println("Vui long nhap so tien ban muon rut");
        float amount = scanner.nextFloat();
        try {
            atm.withdraw(amount);
        } catch (AmountLessThanTotalException amountLessThanTotalException) {
            System.out.println("Vui long nhap lai so tin nho hon trong tk");
        }


    }
}
