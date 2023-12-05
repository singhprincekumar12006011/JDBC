import java.sql.*;

class JDBC2 {
    public static void main(String[] args) {
        try {
            // Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "12006011";
            Connection con = DriverManager.getConnection(url, username, password);

            // Test if the connection is closed or not.
            if (con.isClosed()) {
                System.out.println("Connection is closed");
            } else {
                System.out.println("Connection is created.......");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
