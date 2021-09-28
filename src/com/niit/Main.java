package com.niit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*String weather = "Weather";
        if (weather.equals("Sunny")) {
            System.out.println("Đi chơi thôi");
        }*/

/*
        int age = 10;
        if (age <= 10) {
            System.out.println("Bạn là nhi đồng");
        } else if (age >= 14 && age <= 16) {
            System.out.println("Bạn là thanh thiếu niên");
        } else if (age >= 18) {
            System.out.println("Bạn là thanh niên");
        }

        age = 50;
        switch (age) {
            case 10:
                System.out.println("Bạn là nhi đồng");
                break;
            case 14:
                System.out.println("Bạn là thanh thiếu niên");
                break;
            case 18:
                System.out.println("Bạn là thanh niên");
                break;

            default:
                System.out.println("Tuổi không khớp với dữ liệu của chúng tôi");
        }
*/

        //if lồng nhau - nested if
/*        if (age == 50) {
            if (age > 50) {
                System.out.println("Bạn lớn hơn 50 tuổi");
            }
        }*/

        //for - vòng lặp biết trước số lần lặp
        //while / do-while - vòng lặp ko biết trước số lần lặp
        // for-each -  vòng lặp được sử dụng để duyệt danh sách

/*        for (int i = 0; i < 10; i++) {

        }*/

        /*int index = 100;
        while (index < 10) {
            //statement
            System.out.println("Hello");
            index++;
        } //so sánh đk trước và thực hiện lệnh sau // có 0 lần chạy lệnh/chạy vô hạn*/

/*        int a = 100;
        do {
            System.out.println("Hello");
            a++;
        } while (a < 10);*/
        //thực hiện lệnh trc và kiểm tra điều kiện sau // ít nhất 1 lần chạy lệnh


        int numbers[] = {
                1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (numbers[i] == 2) {
                continue;
            }
        }
        //4 5
        //1 2 3 4 5

/*        for (int num: numbers
             ) {
            System.out.println(num);
        }*/

    }/**/
}
