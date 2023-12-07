package jdbc;

import java.sql.*;

public class insert_data_into_table1 {
	public static void main(String[] args)
	{
		try
		{
			//load the drive class 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			String url="jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="12006011";
			Connection con = DriverManager.getConnection(url, username, password);
			
			//create a query
			String q = "insert into table1(tName, tCity) values(?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, "Bir Bahadur");
			pstmt.setString(2, "Tenduni");
			
			pstmt.executeUpdate();
			System.out.println("Value is inserted....");
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
