package JDBCmethods;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class ConnectionCloser{
    public static void ConnectionCloser(ResultSet rs, Statement stmt, Connection con) throws SQLException{
        rs.close();
        stmt.close();
        con.close();
        System.out.println("Connection closed successfully...");
    }
    public static void ConnectionCloser(Statement stmt, Connection con) throws SQLException{
        stmt.close();
        con.close();
        System.out.println("Connection closed successfully...");
    }
    public static void ConnectionCloser(ResultSet rs, Connection con) throws SQLException{
        rs.close();
        con.close();
        System.out.println("Connection closed successfully...");
    }
    public static void ConnectionCloser(Connection con) throws SQLException{
        con.close();
        System.out.println("Connection closed successfully...");
    }
}
