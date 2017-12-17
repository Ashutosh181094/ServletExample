import java.sql.*;
public class Scrollable_Ex {
	public static void main(String[] args) throws Exception
	{
		Connection con=Provider.getOracleConnection();
		Statement st=con.createStatement(1005,1007);//sensitive but readonly
		String sql="select roll,name,cgpa from student";
		ResultSet rs=st.executeQuery(sql); 
		System.out.println("Roll\tName\tCgpa\n");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));

			System.out.println(rs.getInt("roll")+"\t"+rs.getString("name")+"\t"+rs.getDouble("cgpa"));
			//either give column number or column name to acess the column
		}
		System.out.println(rs.isAfterLast());
		System.out.println(rs.getRow());
		System.out.println(rs.isBeforeFirst());
		rs.beforeFirst();
		System.out.println(rs.isBeforeFirst());
		System.out.println(rs.getRow());
		rs.absolute(2);
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
		System.out.println("------------------------");
		rs.afterLast();
		while(rs.previous())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
		}
		
		System.out.println("------------------------");
		rs.first();
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
		rs.absolute(2);
		rs.deleteRow();
		System.out.println("Yes Deleted................................");
		rs.absolute(2);
		rs.updateInt(1,222);
		rs.updateString(2,"Y");
		rs.updateDouble(3,9.7);
		rs.insertRow();
		System.out.println("YES INSERTED");
	}
}
//in read Only mode we cannot delete the record from the result set.Only DQL commands can be used for readOnly mode. 