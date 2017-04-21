package car_dealership;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

	private static Connection connection = null;
	
	
	public static void connectToDB(){
		try {
	 	      Class.forName("org.sqlite.JDBC");
	 	      connection = DriverManager.getConnection("jdbc:sqlite:CarDealership.db");
	 	      connection.setAutoCommit(false);
	 	      System.out.println("Opened database successfully");
		}
		catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
	}
	
	//creates new department in DB
	 public void insertNewDepartment(Department dept) {
 	    
		 connectToDB();
		 
 	     try{
 	    	 PreparedStatement statement = connection.prepareStatement(
 	    			 "INSERT INTO Department (DepartmentID, DeptName) VALUES ("+dept.getId()+", '"+dept.getName()+"')");
         
 	    	 statement.executeUpdate();

 	    	 connection.commit();
 	    	 statement.close();
 	    	 connection.close();
 	     }
 	     catch( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		 }
 
 System.out.println("Records created successfully");
 
}
	 
	 public void insertNewEmployee(Employee e) {
	   	  
		 connectToDB();
		 //, DOB, SSN, Address, State, Zip, DeptID, DeptName
 	     try{
 	    	 PreparedStatement statement = connection.prepareStatement(
 	    			"INSERT INTO Employee (EmpID, FirstName, LastName, SSN, Address, State, Zip, DOB) "
 	    			+ "VALUES ("+e.getId()+", '"+e.getFirstName()+"', '"+e.getLastName()+"', "+e.getSsn()+", '"+e.getAddress()+"', '"+e.getState()+"', "+e.getZip()+", '"+e.getDob()+"')");
         
 	    	 statement.executeUpdate();

 	    	 connection.commit();
 	    	 statement.close();
 	    	 connection.close();
 	     }
 	     catch( Exception ex ) {
		      System.err.println( ex.getClass().getName() + ": " + ex.getMessage() );
		      System.exit(0);
		 }
 
 	     System.out.println("Records created successfully");
 
	 }
	 public void findEmployee() {
	   	  
		 connectToDB();
		 //, DOB, SSN, Address, State, Zip, DeptID, DeptName
 	     try{
 	    	Statement statement = connection.createStatement();
 	    	ResultSet res = statement.executeQuery("SELECT * FROM Employee WHERE FirstName = 'Brian'");

            /**
             * Iterate over the result set from the above query
             */
            while (res.next())
            {
                System.out.println("Name: " + res.getString("FirstName") + " " + res.getString("LastName"));
            }
            System.out.println("----------------------------");
 	    	 

 	    	 connection.commit();
 	    	 statement.close();
 	    	 connection.close();
 	     }
 	     catch( Exception ex ) {
		      System.err.println( ex.getClass().getName() + ": " + ex.getMessage() );
		      System.exit(0);
		 }
 
 	     System.out.println("Records created successfully");
 
	 }
	 
}