/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;


import java.sql.*;

/**
 *
 * @author strangequark
 */
public class GeneralQuery {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/PayrollSystem";
      //  Database credentials
   static final String USER = "Christopher";
   static final String PASS = "ringlesp";
   private String Query;
   private ResultSet resultset;
   private Object[][] tabledat;
   public GeneralQuery(String query){
       Query = query;
   }
  public Object[][] getResultSet(){
      return tabledat;
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
          System.out.println(Query);
          stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(Query);
          resultset = rs;
          // Loop through the ResultSet and transfer in the Model
          ResultSetMetaData rsmd = rs.getMetaData();
          int colNo = rsmd.getColumnCount();
          rs.last();
          int rowNo = rs.getRow();
          rs.beforeFirst();
          tabledat = new Object[rowNo][colNo];
          //ArrayList<Object[]> records=new ArrayList<Object[]>();
          int j = 0;
          while(rs.next()){
                //int cols = rs.getMetaData().getColumnCount();
                Object[] arr = new Object[colNo];
                for(int i=0; i<colNo; i++){
                  arr[i] = rs.getObject(i+1);
                }
                tabledat[j] = arr;
                j++;
          }
          //STEP 6: Clean-up environment
      
          stmt.close();
          conn.close();
       }catch(SQLException se){
      //Handle errors for JDBC
          se.printStackTrace();
       }catch(Exception e){
      //Handle errors for Class.forName
          e.printStackTrace();
       }finally{
          //finally block used to close resources
          try{
             if(stmt!=null)
                stmt.close();
          }catch(SQLException se2){
          }// nothing we can do
          try{
             if(conn!=null)
                conn.close();
          }catch(SQLException se){
             se.printStackTrace();
          }//end finally try
       }//end try
       System.out.println("Goodbye!");
       return outstring;
    }    
}
