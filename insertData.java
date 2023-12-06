
import java.sql.*;
public class insertData {
    public static void main(String[] args) {
        try
        {

            //load the driver class 
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connecction
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "12006011";
            Connection con = DriverManager.getConnection(url, username, password);

            //create a query
            
            String q = "insert into table1(tName, tCity) values(?,?)";

            PreparedStatement pstmt = con.prepareStatement(q);

            //set query value 
            pstmt.setString(1, "Prince Kumar");
            pstmt.setString(2, "Bikramganj");

            pstmt.executeUpdate();

            System.out.println("value is inserted....");

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
