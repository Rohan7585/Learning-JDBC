package JDBCmethods;

import java.sql.*;
import java.util.Scanner;

public class DeleteData {
    public static void DeleteData(Connection con){
        try{
            Statement stmt = con.createStatement();
            System.out.print("Enter the ID number to delete the row: ");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            String query = "DELETE FROM employees WHERE id = " + id + ";";
            int affectedRow = stmt.executeUpdate(query);
            if(affectedRow>0)   System.out.println(affectedRow+" row(s) deleted successfully...");
            else System.out.println("Deletion failed...");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
