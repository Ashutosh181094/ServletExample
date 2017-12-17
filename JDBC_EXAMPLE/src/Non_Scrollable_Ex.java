import java.sql.*;
public class Non_Scrollable_Ex 
{
	
public static void main(String[] args) throws Exception
{
	Connection con=Provider.getOracleConnection();
	Statement st=con.createStatement();
	String sql="select cgpa,roll,name from student";
	ResultSet rs=st.executeQuery(sql); 
	/*
	 Now the result set object has the table in which the cursor points to the 0th column of the table.
	 if we do not use next statement then it will not display any record.
	 */
	System.out.println("Cgpa\tRoll\tName\n");
	while(rs.next())
	{
		System.out.println(rs.getDouble(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3));
		System.out.println(rs.getDouble("cgpa")+"\t"+rs.getInt("roll")+"\t"+rs.getString("name"));
		//either give column number or column name to access the column
	}
	
}
}
