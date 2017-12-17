import java.sql.*;
public class DML_Statement
{
	public static void main(String[]args) throws Exception
	{
		Connection con = Provider.getOracleConnection();
		Statement st=con.createStatement();
		String sql=null;
		int status=0;
		//Here logic to insert records
		sql="Insert into studentt values(10,'Raja',9)";
		status =st.executeUpdate(sql);
		System.out.println(status);
		
		sql="Insert into studentt values(11,'Rani',9.1)";
		status =st.executeUpdate(sql);
		System.out.println(status);
		
		sql="update studentt set sname='Rajesh', cgpa=7.8 where roll=11";
		status =st.executeUpdate(sql);
		System.out.println(status);
		
		sql="delete from studentt where roll=10";
		status =st.executeUpdate(sql);
		System.out.println(status);
	}
}

