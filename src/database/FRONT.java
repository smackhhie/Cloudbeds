package database;
import java.sql.*;

public class FRONT {

     public static Connection dbConnect(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system","root","pavilion1!");
            System.out.println("Connected");
            return conn;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
