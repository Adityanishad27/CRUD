package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete_from_table {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "root");
            java.sql.Statement stmt = con.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter emplyee ID to delete");
            int empid = sc.nextInt();

           String  sql=("delete from employee  where id ="+empid);

            System.out.println("Deleted Successfully");


          stmt.executeUpdate(sql);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
