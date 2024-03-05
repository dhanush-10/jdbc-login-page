package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class del
{
	  static String dbUrl = "jdbc:mysql://localhost:3306/accountdb";
	    static String dbUname = "root";
	    static String dbPassword = "";
	    static String dbDriver = "com.mysql.cj.jdbc.Driver";
	    public  void deletedata(String em)
	    {
	  	  System.out.println("hii");
	  	  Connection con=null;
	  	  try
	  	  { 
	  		  Class.forName(dbDriver);
	    		  con=DriverManager.getConnection(dbUrl,dbUname,dbPassword);
	    		  String q="delete from bank where email='"+em+"'"; 
	    		  Statement st = con.createStatement();
	    		  st.execute(q);
	    		  System.out.println("Row Deleted");
	    		  con.close();
	    		  
	    		 
	  	  }
	  	  catch (Exception e)
	  	  {
	  		  e.printStackTrace();
	  	  }
	    }	
}
