//this is the first program of the java
import java.sql.*;

class jdbc1 {
    public static void main(String[] args) {
        try {
            // Load the driver
            Class.forName("com.mysql.jdbc.Driver");

            // Creating a connection
            String url ="jdbc:mysql://localhost:3306/jdbc";
            String username="root";
            String password="12006011";
            Connection con = DriverManager.getConnection(url,username,password);

            if(con.isClosed()) {
                System.out.println("Connection is closed");
            } else {
                System.out.println("Connection created...");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}


