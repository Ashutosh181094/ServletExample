import java.sql.*;
public class RSMD_EX 
{
public static void main(String[] args) throws Exception
{
	Connection con=Provider.getOracleConnection();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from student");
	ResultSetMetaData rsmd=rs.getMetaData();
	int no_col=rsmd.getColumnCount();
	System.out.println("No of cols in student table :"+no_col);
	for(int i=1;i<=no_col;i++)
	{
		System.out.println(rsmd.getColumnName(i));
		System.out.println(rsmd.getColumnTypeName(i));
		System.out.println(rsmd.getColumnClassName(i));
		System.out.println("--------------------------------------");
	}
}
}
