package com.niit;

import java.sql.*;
import java.util.Scanner;

public class Signup {
    private static String MD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java30", "root", "koodinh@");
            PreparedStatement preparedStatement  = conn.prepareStatement("INSERT INTO users(email, password) VALUES(?,?)");
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, MD5(MD5(password+"abc")));
            preparedStatement.execute();
        } catch (Exception e) {

        }
    }
}
