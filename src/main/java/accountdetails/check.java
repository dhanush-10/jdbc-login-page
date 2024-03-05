package accountdetails;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
public class check 
{
	    static String dbUrl = "jdbc:mysql://localhost:3306/accountdb";
	    static String dbUname = "root";
	    static String dbPassword = "";
	    static String dbDriver = "com.mysql.cj.jdbc.Driver";
  public  boolean checkdata(String em,String pass)
  {
	  System.out.println("hii");
	  Connection con=null;
	  try
	  { 
		  Class.forName(dbDriver);
  		  con=DriverManager.getConnection(dbUrl,dbUname,dbPassword);
  		  String q="select * from bank where email='"+em+"' and password='"+pass+"'"; 
  		  Statement st = con.createStatement();
  		  ResultSet rs=st.executeQuery(q);
  		  if(rs.next())
  		  {
  			  con.close();
  			  return true;
  		  }
  		  else
  		  {
  			 return false; 
  		  }
  		 
	  }
	  catch (Exception e)
	  {
		  e.printStackTrace();
	  }
	  return false;
  }
}