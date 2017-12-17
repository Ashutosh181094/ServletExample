import org.apache.commons.dbcp.BasicDataSource;
import java.sql.*;
public class BDS_FASTER
{
	
	public static void main(String [] args) throws Exception
	{
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("system");
		bds.setPassword("ashu1234");
		long start =System.currentTimeMillis();
		for(int i=1;i<=50;i++)
		{
			Connection con=bds.getConnection();
			//System.out.println(con.hashCode());
			con.close();
		}
		System.out.println("Completed ....");
		long stop=System.currentTimeMillis();
		System.out.println(stop-start);
		System.out.println("Connected");
		System.out.println("--------------------");
		start =System.currentTimeMillis();
		for(int i=1;i<=50;i++)
		{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ashu1234");
		con.close();
		}
		stop=System.currentTimeMillis();
		System.out.println(stop-start);
		System.out.println("Donee");
		System.out.println("--------------------");
	}
	
}