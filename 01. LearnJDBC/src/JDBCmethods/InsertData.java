package JDBCmethods;

import java.sql.*;
import java.util.Scanner;

public class InsertData {
    public static void InsertData(Connection con){
        try{
            Statement stmt = con.createStatement();
            System.out.print("Enter how many fields: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            while(n>0){
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter Job title: ");
                String job_title = sc.nextLine();
                System.out.print("Enter salary: ");
                double salary = sc.nextDouble();
                n--;
                String query = "INSERT INTO employees(id, name, job_title, salary) VALUES("+id+", '"+name+"', '"+job_title+"', "+salary+");";
                int rowEffect = stmt.executeUpdate(query);
                if(rowEffect>0) System.out.println("Insertion successful, " + rowEffect +" row(s) effected.");
                else System.out.println("Insertion failed...");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
