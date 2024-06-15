package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateDatabase {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");

            Statement stmt = con.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Database Name :");
            String  dbname =sc.next();
             stmt.executeUpdate("create database if not exists "+ dbname);

            System.out.println("Database created Succefully");
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}
