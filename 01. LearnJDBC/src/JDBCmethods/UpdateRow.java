package JDBCmethods;

import java.sql.*;
import java.util.Scanner;

public class UpdateRow {
    public static void UpdateRow(Connection con){
        try{
            Statement stmt = con.createStatement();
            System.out.print("Enter the ID number to update the row: ");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            String query = "UPDATE employees SET job_title = 'Full Stack Developer', salary = 90000.0 WHERE id = " + id + ";";
            int affectedRow = stmt.executeUpdate(query);
            if(affectedRow>0)   System.out.println(affectedRow+" row(s) updated successfully...");
            else System.out.println("Update failed...");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
