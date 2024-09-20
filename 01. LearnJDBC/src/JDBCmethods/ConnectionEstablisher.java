package JDBCmethods;
import java.sql.*;

public class ConnectionEstablisher {
    public static Connection ConnectionEstablishers(){
        String url = "jdbc:mysql://localhost:3306/learning_jdbc";
        String username = "root";
        String password = "1234";
        Connection con = null;
        try{
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection establish successful...");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}
