
import java.sql.*;
public class create_table {
    public static void main(String[] args) {
        try
        {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create the connection.
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "12006011";
            Connection con = DriverManager.getConnection(url, username, password);

            //create a queary 
            String q = "create table tb1(Id int(20) primary key auto_update, Name varchar(200) not null, cityName varchar(600))";

            //create statement
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);

            System.out.println("Table is created: .....");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
