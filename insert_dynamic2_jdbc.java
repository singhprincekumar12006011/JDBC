package jdbc;

import java.sql.*;
import java.io.*;
public class insert_dynamic2_jdbc {
	public static void main(String[] args)
	{
		try
		{
			//load the driver class;
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating the connection
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="12006011";
			Connection con=DriverManager.getConnection(url, username, password);
			
			//create query
			String q="insert into table1(tName, tCity) value(?,?)";
			//praparedstatement 
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//take input from user
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name :");
			String name = br.readLine();
			System.out.println("Ente city name");
			String city = br.readLine();
			
			//set the input
			pstmt.setString(1,name);
			pstmt.setString(2, city);
			
			System.out.println("Value is inserted....");
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
