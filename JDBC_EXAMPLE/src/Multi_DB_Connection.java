import java.sql.*;
public class Multi_DB_Connection 
{
public static void main(String[] args)
{
	Connection con_ora=Provider.getOracleConnection();
	Connection con_mysql=Provider.getMysqlConnection();
	System.out.println(con_ora);
	System.out.println(con_mysql);
	
}
}
