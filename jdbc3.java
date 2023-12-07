package jdbc;

import java.sql.*;

public class jdbc3{
	public static void main(String[] args)
	{
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "12006011";
			Connection con = DriverManager.getConnection(url, username, password);
			if (con.isClosed()) {
                System.out.println("Connection is closed");
            } else {
                System.out.println("Connection is created.......");
            }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
