import JDBCmethods.*;
import java.sql.*;

public class Main {
    public static void main(String[] args){
        DriverLoader.DriversLoaders();      //1. Load Drivers
        Connection con = ConnectionEstablisher.ConnectionEstablishers();        //2. Setup Connection
        try {       //3. CRUD operations

            System.out.println("\n Printing results:-");
            PrintResult.PrintResult(con);

            System.out.println("\n Insert data:-");
            InsertData.InsertData(con);

            System.out.println("\n Delete data:-");
            DeleteData.DeleteData(con);

            System.out.println("\n Update row:-");
            UpdateRow.UpdateRow(con);

            System.out.println("\n Closing the Connection...");
            ConnectionCloser.ConnectionCloser(con);         //4. close the Connection
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
