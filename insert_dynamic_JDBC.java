import java.sql.*;
import java.io.*;
public class insert_dynamic_JDBC {
    public static void main(String[] args)
    {
        try
        {
            //load the driver class 
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating the connection
            String url="jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "12006011";
            Connection con = DriverManager.getConnection(url, username, password);

            //create a query
            String q = "insert into table1(tName, tCity) value(?,?)";

            //get the preparedstatement 
            PreparedStatement pstmt = con.prepareStatement(q);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name :");
            String name = br.readLine();
            
            System.out.println("Enter city name :");
            String city = br.readLine();

            pstmt.setString(1, name);
            pstmt.setString(2, city);

            pstmt.executeUpdate();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
