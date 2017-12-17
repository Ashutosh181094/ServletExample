import java.sql.*;
public class DDL_PreparedStatement 
{
	public static void main(String[]args) throws Exception
	{
		Connection con = Provider.getOracleConnection();
		String sql = null;
		boolean result = false;

		Thread.sleep(4000);
		//HERE LOGIC TO CREATE TABLE
		
		sql="create table student(Roll Number(4),sName varchar2(20),CGPA number(3,1))";
		PreparedStatement pst = con.prepareStatement(sql);
		result = pst.execute();
		System.out.println(result);
		System.out.println("Table created.........");
		
 		Thread.sleep(4000);
		//Here modify the name of coloumn from sName to Name

		sql="alter table student rename column sName to Name ";
		pst = con.prepareStatement(sql);
		result = pst.execute();
		System.out.println(result);
		System.out.println("Column renamed.........");
		
		Thread.sleep(4000);
		//Here truncate the table (Delete the records);
		sql="truncate table student ";
		pst = con.prepareStatement(sql);
		result = pst.execute();
		System.out.println(result);
		System.out.println("table trucated.........");
		
		Thread.sleep(4000);
		//here rename the table from student to advjava
		sql="rename student to advjava";
		pst = con.prepareStatement(sql);
		result = pst.execute();
		System.out.println(result);
		System.out.println("table renamed.........");
		
		Thread.sleep(4000);
		//here drop the table advjava
		sql="drop table advjava";
		pst = con.prepareStatement(sql);
		result = pst.execute();
		System.out.println(result);
		System.out.println("table droped.........");
	}

}

