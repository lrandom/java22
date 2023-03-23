package com.niit;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            //open connect to database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java30", "root", "koodinh@");
            System.out.println("Connected to database");
            float price = 1000;
            String title = "Nike Air Max 90";
            String content = "Nike Air Max 90 ben dep";
            int categoryId = 1;

            /*Statement stm = conn.createStatement();
            String sql = "INSERT INTO products(price,title,content,category_id) VALUES("+price+",'"+title+"','"+content+"',"+categoryId+")";\
            stm.executeUpdate(sql);*/
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO products(price,title,content,category_id) " +
                    "VALUES(?,?,?,?)");
            preparedStatement.setFloat(1, price);
            preparedStatement.setString(2, title);
            preparedStatement.setString(3, content);
            preparedStatement.setInt(4, categoryId);
            preparedStatement.execute();

            preparedStatement.setFloat(1, 2000);
            preparedStatement.setString(2, "Nike Air Max 95");
            preparedStatement.setString(3, "Nike Air Max 95 ben dep");
            preparedStatement.setInt(4, 1);
            preparedStatement.execute();

            preparedStatement.setFloat(1, 3000);
            preparedStatement.setString(2, "Nike Jordan");
            preparedStatement.setString(3, "Nike Jordan ben dep");
            preparedStatement.setInt(4, 1);
            preparedStatement.execute();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
