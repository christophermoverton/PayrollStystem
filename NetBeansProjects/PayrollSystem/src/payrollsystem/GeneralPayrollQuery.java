/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;
import java.sql.*;
import static payrollsystem.PayrollSystem.DB_URL;
/**
 *
 * @author strangequark
 */
public class GeneralPayrollQuery {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/PayrollSystem";
      //  Database credentials
   static final String USER = "Christopher";
   static final String PASS = "ringlesp";
   private String Query;
   GeneralPayrollQuery(String query){
       Query = query;
   }
   public String runQuery(){
        // TODO code application logic here
   Connection conn = null;
   Statement stmt = null;
   String outstring = "";
       try{
          //STEP 2: Register JDBC driver
          Class.forName("com.mysql.jdbc.Driver");
                //STEP 3: Open a connection
          System.out.println("Connecting to database...");
          conn = DriverManager.getConnection(DB_URL,USER,PASS);

          //STEP 4: Execute a query
          System.out.println("Creating statement...");
          DatabaseMetaData metadata = conn.getMetaData();
          ResultSet resultSet;
          stmt = conn.createStatement();
          return stmt.executeUpdate(Query);
       }
   }
}
