package accountdetails;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
public class accountinfo 
{
	    static String dbUrl = "jdbc:mysql://localhost:3306/accountdb";
	    static String dbUname = "root";
	    static String dbPassword = "";
	    static String dbDriver = "com.mysql.cj.jdbc.Driver";
  public  void insert(String fn,String un,String em,String pass,String cpass)
  {
	  Connection con=null;
	  try
	  {
		  
		  Class.forName(dbDriver);
  		  con=DriverManager.getConnection(dbUrl,dbUname,dbPassword);
  		  String q="insert into bank(fullname,username,email,password,confirmpass)"+"values('"+fn+"','"+un+"','"+em+"','"+pass+"','"+cpass+"')"; 
  		  Statement st = con.createStatement();
  		  st.execute(q);
  		  System.out.println("Inserted Successfully");
  		  con.close();
	  }
	  catch (Exception e)
	  {
		  e.getStackTrace();
	  }
  }
}
