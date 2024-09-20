package JDBCmethods;
import java.sql.*;

public class PrintResult {
    public  static void PrintResult(Connection con){
        try{
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM employees;");
            while(result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                String jobTitle = result.getString("job_title");
                double salary = result.getDouble("salary");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Job Title: " + jobTitle);
                System.out.println("Salary: " + salary);
                System.out.println("=========================");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
