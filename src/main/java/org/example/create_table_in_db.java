package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class create_table_in_db {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "root");
            java.sql.Statement stmt = con.createStatement();

            String sqlquery ="CREATE TABLE employee " +
                    "(id INTEGER not NULL, " +
                    " Name  VARCHAR(255), " +
                    " City  VARCHAR(255), " +
                    " Age INTEGER, " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sqlquery);
            System.out.println("table created succesfully");
        }
        catch (SQLException e){
           e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
