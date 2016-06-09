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
public class PayrollSystem {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/PayrollSystem";

   //  Database credentials
   static final String USER = "Christopher";
   static final String PASS = "ringlesp";
   static final String[] dTables = {"Employee","Messages","Locks","Payroll",
                                     "Salary","Jobtitle","Emppicture",
                                    "EmpCategory","EmployeeType", "IpTable", 
                                    "Department", "DeptEvents", "Bonus",
                                    "Project", "Timesheet", "Hourly", 
                                    "Deductions", "Holidays", "Sickday"};
   static final String[][] dTablesdata = {new String[]{"Employee", "empid", 
                           "INTEGER not NULL", 
                           "deptid", "INTEGER not NULL", "jobid", "INTEGER not NULL", 
                           "typeid","INTEGER not NULL", "catid", "INTEGER not NULL", 
			   "lastname","VARCHAR(255)", "firstname",
			   "VARCHAR(255)","minit","VARCHAR(1)",
			   "ssn","SMALLINT", "dob","DATE", "gender",
			   "VARCHAR(1)", "marital","BOOLEAN",
                           "address1","VARCHAR(255)",
			   "address2","VARCHAR(255)",
			   "city","VARCHAR(255)", "state","VARCHAR(2)",
			   "zipcode","SMALLINT", //"country","VARCHAR(255)",
                           "email","VARCHAR(255)", "webpage","VARCHAR(255)",
			   "homephone","SMALLINT", "officephone","SMALLINT",
			   "cellphone","SMALLINT", "regularhours","SMALLINT",
			   "login","VARCHAR(255)", "password","VARCHAR(255)",
			   "admin","BOOLEAN", "superadmin","BOOLEAN",
			   "numlogins","INTEGER", "lastlogindate", "DATE",
			   "loginip", "VARCHAR(255)", "datesignup","DATE",
			   "dateupdated","DATE", "active", "BOOLEAN"}, 
	      new String[]{"Messages","Imid","INTEGER not NULL", "empid","INTEGER",
			   "message", "MEDIUMTEXT", "postedby", "VARCHAR(255)",
			   "dateposted", "DATE", "numviews", "SMALLINT", 
			   "active", "BOOLEAN"}, 
              new String[]{"Locks","lockid", "INTEGER not NULL", "empid", "INTEGER", 
			   "datelock", "DATE", "reasonlock", "VARCHAR(2)",
			   "active", "BOOLEAN"},
	      new String[]{"Payroll", "payrollid", "INTEGER not NULL", 
			   "empid", "INTEGER", "date", "DATE", "startday", 
			   "DATE", "endday", "DATE", "hoursworked", "FLOAT", 
			   "grosspay", "DECIMAL(19,4)", "deductions", 
			   "DECIMAL(19,4)", "netpay", "DECIMAL(19,4)"},
              new String[]{"Salary","salaryid", "INTEGER not NULL", 
			   "empid", "INTEGER", "hourlyrate", "DECIMAL(19,4)",
			   "note" , "VARCHAR(255)"}, 
	      new String[]{"Jobtitle", "jobid", "INTEGER not NULL", "jobtitle", 
			   "VARCHAR(255)", "jobdesc", "VARCHAR(255)"}, 
	      new String[]{"Emppicture", "picid", "INTEGER not NULL", "linkid", 
			   "INTEGER", "type", "VARCHAR(10)", "filename", 
			   "VARCHAR(255)", "filesize", "INTEGER", 
			   "picture", "VARCHAR(255)"},
	      new String[]{"EmpCategory", "empid", "INTEGER", "catname", 
			   "VARCHAR(255)", "catdesc", "VARCHAR(255)", 
			   "miscnote", "VARCHAR(255)"},
              new String[]{"EmployeeType", "typeid", "INTEGER", "typename", 
			   "VARCHAR(255)", "typedesc", "VARCHAR(255)",
			   "miscnote", "VARCHAR(255)"},
	      new String[]{"IpTable","ipid", "INTEGER", "type", 
			   "VARCHAR(6)", "linkid", "INTEGER", "ipaddress", 
			   "VARCHAR(40)", "note", "VARCHAR(255)"},
              new String[]{"Department", "deptid", "INTEGER", "managerid", 
			   "INTEGER", "deptparentid", "INTEGER", "deptname",
			   "VARCHAR(255)", "location", "VARCHAR(255)",
			   "deptdesc", "VARCHAR(255)", "mandaworkdesc", 
			   "VARCHAR(255)", "messaging", "VARCHAR(255)"},
	      new String[]{"DeptEvents", "eventid", "INTEGER", "deptid", 
			   "INTEGER", "eventdate", "DATE", "eventtime", 
			   "TIME", "eventbody", "VARCHAR(255)", "postedby", 
			   "VARCHAR(255)", "dateposted", "DATE", "expirydate", 
			   "DATE", "active", "BOOLEAN"},
              new String[]{"Bonus", "bonusid", "INTEGER", "empid", "INTEGER", 
			   "datebonus", "DATE", "bonuspayment", "DECIMAL(19,4)",
			   "note", "VARCHAR(255)"}, 
	      new String[]{"Project","projectid", "INTEGER", "deptid", "INTEGER", 
			   "projecttitle", "VARCHAR(255)", "projectdesc", 
			   "VARCHAR(255)", "hoursworked", "FLOAT", "active", 
			   "BOOLEAN"}, 
	      new String[]{"Timesheet","timeid", "INTEGER", "empid", "INTEGER",
			   "projectid", "INTEGER", "checkin", 
                           "TIMESTAMP DEFAULT '1970-01-01 00:00:01'", 
			   "checkout", 
                           "TIMESTAMP DEFAULT '1970-01-01 00:00:01'", 
                           "rawtime", "FLOAT",
			   "roundedtime", "DECIMAL(19,4)", "workdesc", 
			   "VARCHAR(255)", "ipcheckin", 
                           "TIMESTAMP DEFAULT '1970-01-01 00:00:01'", 
			   "ipcheckout", 
                           "TIMESTAMP DEFAULT '1970-01-01 00:00:01'", 
                           "checked", "BOOLEAN"}, 
	      new String[]{"Hourly","hourid", "INTEGER", "empid", "INTEGER",
			   "hourlyrate", "DECIMAL(19,4)", "note", "VARCHAR(255)"},
              new String[]{"Deductions","deducid", "INTEGER", "empid", "INTEGER", 
			   "deductype", "VARCHAR(2)", "amount", "DECIMAL(19,4)",
			   "note", "VARCHAR(255)"},
	      new String[]{"Holidays", "holid", "INTEGER", "empid", "INTEGER",
			   "datehols", "DATE", "payment", "DECIMAL(19,4)"}, 
	      new String[]{"Sickday", "sickid", "INTEGER", "empid", "INTEGER",
                           "datesick", 
                           "TIMESTAMP DEFAULT '1970-01-01 00:00:01'", 
                           "payment", "DECIMAL(19,4)"}
   };
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Connection conn = null;
   Statement stmt = null;
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
      int count = 0;
      for (String table: dTables){
        resultSet = metadata.getTables(null, null, table, null);
        String sql = "";
        if(resultSet.next()){
            stmt = conn.createStatement();
            sql = "DROP TABLE " + table + ";";
            System.out.println("Dropping Table..." + sql);
            stmt.executeUpdate(sql);
        }
        sql = "CREATE TABLE ";
        sql += dTablesdata[count][0] + " (";
        int mV = dTablesdata[count].length-1;
        for(int i = 1; i < mV; i+=2){
            sql += dTablesdata[count][i] + " " + dTablesdata[count][i+1];
            if (i != (mV-1)){
                sql += ", ";
            }
            else{
                sql += ", PRIMARY KEY ( " + dTablesdata[count][1]+ " ));";
            }
        }
        System.out.println("Creating table..."+ sql);
        stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Created table...");
        resultSet.close();
        count++;
      }
//      stmt = conn.createStatement();
//      String sql;
//      
//      ResultSet rs = stmt.executeQuery(sql);
//      System.out.println(rs);
      //STEP 5: Extract data from result set
//      while(rs.next()){
//         //Retrieve by column name
//         int id  = rs.getInt("id");
//         int age = rs.getInt("age");
//         String first = rs.getString("first");
//         String last = rs.getString("last");
//
//         //Display values
//         System.out.print("ID: " + id);
//         System.out.print(", Age: " + age);
//         System.out.print(", First: " + first);
//         System.out.println(", Last: " + last);
//      }
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
    }
    
}
