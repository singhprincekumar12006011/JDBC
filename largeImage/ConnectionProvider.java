package com.jdbc.largeImage;


import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider {
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
		if(con == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12006011");
			
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	
}
