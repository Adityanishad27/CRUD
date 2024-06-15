package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Update_in_table {
    public static <preparedStatemnt> void main(String[] args) {
        // update name by id


           try {
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "root");

             //  PreparedStatement st = connection.prepareStatement("DELETE FROM Table WHERE na = " + name + ";");
                 Scanner sc = new Scanner(System.in);
               System.out.println("Enter Your New Name ");
                 String empname = sc.next();
               System.out.println("Enter Your id Where Set ");
                 int empid= sc.nextInt();
               PreparedStatement st = connection.prepareStatement("UPDATE EMPLOYEE SET name=? WHERE id =?");
            //   PreparedStatement st = connection.prepareStatement("update  employee  set name="+ empname +"where id= "+empid);


                    st.setString(1,empname);
                    st.setInt(2,empid);

               System.out.println("update Successfully");

               st.executeUpdate();
           } catch(Exception e) {
               System.out.println(e);

           }

    }
}
