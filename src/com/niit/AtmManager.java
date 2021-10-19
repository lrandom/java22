package com.niit;

import java.util.Scanner;

public class AtmManager {
    private User users[] = new User[2];

    public AtmManager() {
        User user = new User("001", "Luan", "123456", new Double(1000000).doubleValue());
        User user2 = new User("002", "Nam", "123456", new Double(2000000).doubleValue());
        users[0] = user;
        users[1] = user2;
    }

    public User login(String accountNo, String password) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAccountNo().equalsIgnoreCase(accountNo) && users[i].getPassword().equals(password)) {
                return users[i];
            }
        }
        return null;
    }

    public void depositMoney(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap vao so tien muon rut");
        boolean inputOk = false;
        double amount = 0;
         do {
            try {
                //amount = scanner.nextDouble();
                amount = Double.parseDouble(scanner.nextLine());
                inputOk = true;
            } catch (Exception e) {
               System.out.println("Vui long khong nhap chu, hay nhap so");
               //scanner.nextLine();
            }
        } while (inputOk == false);

        double userAmount = user.getAmount();
        userAmount -= amount;
        user.setAmount(userAmount);
    }

    public void userInfo(User user) {
        System.out.println("Ten tai khoan " + user.getName());
        System.out.println("So tien trong TK " + user.getAmount());
    }

}
