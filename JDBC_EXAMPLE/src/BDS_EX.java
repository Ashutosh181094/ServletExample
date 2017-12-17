import org.apache.commons.dbcp.BasicDataSource;
import java.sql.*;
public class BDS_EX 
{
	public static void name(String[] args) throws Exception
	{
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("system");
		bds.setPassword("ashu1234");
		Connection con=bds.getConnection();
		System.out.println(con);
		if(con!=null)
			System.out.println("Yes connected by basic datasource");
		
	}
}
