package com.niit;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Connection conn;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javaweb_22";
            conn = DriverManager.getConnection(url, "root", "koodinh@");

            //tạo ra một statement để thực thi câu lệnh SQL
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                System.out.print(rs.getInt("id"));
                System.out.print(rs.getString("fullname"));
                System.out.print(rs.getString("username"));
                System.out.print(rs.getString("address"));
                System.out.printf("%n");
            }
        } catch (Exception e) {
            System.out.println("Khong ket noi duoc den CSDL");
        }


    }
}
