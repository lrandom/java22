package com.niit;

import java.util.Scanner;

public class AtmMain {

    public static void main(String[] args) {
        AtmManager atmManager = new AtmManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui long nhap so TK");
        String accountNo = scanner.nextLine();
        System.out.println("Vui long nhap mat khau");
        String password = scanner.nextLine();

        User user = atmManager.login(accountNo, password);

        //flow b
        if (user != null) {
            int choose = 0;
            do {
                choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        atmManager.depositMoney(user);
                        break;

                    case 2:
                        atmManager.userInfo(user);
                        break;
                }
            } while (choose < 3);
        } else {
            System.out.println("Thong tin dang nhap khong chinh xác");
        }

    }
}
