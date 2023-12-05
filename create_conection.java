import java.sql.*;

public class create_connection{
    public static void main(String[] args) {
        try{

            // load a driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connection

            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);

            if(con.isClosed())
            {
                System.out.println("Connection is not created");
            }else
            {
                System.out.println("Connection is created........");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
