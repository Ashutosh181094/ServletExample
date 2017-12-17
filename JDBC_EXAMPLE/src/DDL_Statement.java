import java.sql.*;
public class DDL_Statement 
{
    public static void main(String[] args) throws Exception
	 
    {
		Connection con =Provider.getOracleConnection();
		Statement st =con.createStatement();
		String sql = null;
		boolean result = false;
		//HERE LOGIC TO CREATE TABLE
		Thread.sleep(4000);
		sql="create table student12(Roll Number(4),Name varchar2(20),CGPA number(3,1))";
		result = st.execute(sql);
		System.out.println(result);
		System.out.println("Table created.........");
		Thread.sleep(4000);
		//Here modify the name of coloumn from name to sanme
		
		sql="alter table student12 rename column name to sname ";
		result = st.execute(sql);
		System.out.println(result);
		System.out.println("Column renamed.........");
		
		/*Thread.sleep(4000);
		//Here truncate the table (Delete the records);
		sql="truncate table student12";
		result = st.execute(sql);
		System.out.println(result);
		System.out.println("table trucated.........");

		//Here we rename the table
		sql="rename student12 to student1";
		result =st.execute(sql);
		System.out.println(result);
		System.out.println("table renamed.........");
		
		Thread.sleep(4000);
		//here drop the table advjava
		sql="drop table student1";
		result =st.execute(sql);
		System.out.println(result);
		System.out.println("table droped.........");*/
	}
}
