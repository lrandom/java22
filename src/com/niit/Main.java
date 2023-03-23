package com.niit;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            //open connect to database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java30", "root", "koodinh@");
            System.out.println("Connected to database");
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //stm.execute("create table if not exists brands(id int primary key auto_increment, name varchar(50))");
            /*int affectRow = stm.executeUpdate("insert into brands(name) values('Nike')");
            System.out.println(affectRow);
            stm.executeUpdate("insert into brands(name) values('Adidas')");
            stm.executeUpdate("insert into brands(name) values('Puma')");*/
            ResultSet resultSet = stm.executeQuery("SELECT * FROM brands");
            resultSet.next();//1
            resultSet.absolute(2);//3
            while (resultSet.next()) {
                resultSet.updateString("name", "Rebook");
                resultSet.updateRow();//commit data vao CSDL
                //System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name"));
            }
            resultSet.moveToInsertRow();
            resultSet.updateString("name", "Vans");
            resultSet.insertRow();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
