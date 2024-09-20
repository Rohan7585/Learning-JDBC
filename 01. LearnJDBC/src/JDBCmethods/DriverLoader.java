package JDBCmethods;
import java.sql.*;

public class DriverLoader {
    public static void DriversLoaders(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers Loaded successfully...");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
