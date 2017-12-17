import java.sql.*;
public class Provider 
{
public static Connection getOracleConnection()
{
	Connection con=null;
	try
	{
	Class.forName("oracle.jdbc.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ashu1234");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return con;
	}
public static Connection getMysqlConnection()
{
	Connection con=null;
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lit","root","ashu1234");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return con;
}
}

