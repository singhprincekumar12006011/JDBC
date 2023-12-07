package jdbc;

//wap to create a connection of java application to the database

import java.sql.*;
public class practise1{
 public static void main(String[] args) {
     try
     {

         //load the driver class
         Class.forName("com.mysql.cj.jdbc.Driver");

         //create connetion

         String url = "jdbc:mysql://localhost:3306/jdbc";
         String username = "root";
         String password = "12006011";
         Connection con = DriverManager.getConnection(url, username, password);

         if(con.isClosed())
         {
             System.out.println("connection is not created...");
         }
         else
         {
             System.out.println("Connection is created.........");
         }
         
         String q = "create table table3(ID int(20) primary key auto_increment, Name varchar(200) not null, RegistrationNumar int(50) not null)";
         
         Statement stmt = con.createStatement();
         stmt.executeUpdate(q);
        
         System.out.println("Table is created.....");
         
        con.close();
     }catch(Exception e)
     {
         e.printStackTrace();
     }
 }
}