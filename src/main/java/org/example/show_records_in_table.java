package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class show_records_in_table {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "root");
            java.sql.Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employee");  // resultset store data


            // ++++++++++++++ First Method +++++++++++++++++++++
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+" " + rs.getInt(4));
               // con.close();  if con.close   print only first row of table
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
