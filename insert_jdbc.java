import java.sql.*;
public class insert_jdbc {
    public static void main(String[] args) {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "12006011";
            Connection con = DriverManager.getConnection(url, username, password);

            // create a query
            String q = "create table table1(itd int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

            // create a statement
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);

            System.out.println("Table is created...");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
