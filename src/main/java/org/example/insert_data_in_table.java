package org.example;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert_data_in_table {
    public static void main(String[] args) {

        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "root");
                PreparedStatement psmt = con.prepareStatement("insert into employee value(?,?,?,?)");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                while(true) {
                    System.out.print("Enter Your  ID:");

                    int id = Integer.parseInt(br.readLine());

                    System.out.print("Enter Your Name:");
                    String Name = br.readLine();

                    System.out.println("Enter Your city ");
                    String City = br.readLine();

                    System.out.println("Enter Your Age ");
                    int age = Integer.parseInt(br.readLine());


                    psmt.setInt(1, id);
                    psmt.setString(2, Name);
                    psmt.setString(3, City);
                    psmt.setInt(4, age);
                    int count = psmt.executeUpdate();
                    if (count > 0)
                        System.out.print(count + " record Inserted ");
                    else
                        System.out.print("No record Inserted");

                    System.out.print("Do You want to Insert more record[yes/No] ");

                    String ch = br.readLine();

                    if (ch.equalsIgnoreCase("no")) {
                        System.out.print(" Thank You ");
                        break;
                    }

                }



            } catch (Exception e) {
                e.printStackTrace();

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


