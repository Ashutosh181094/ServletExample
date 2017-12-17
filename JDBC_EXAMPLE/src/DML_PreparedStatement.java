import java.sql.*;
import java.util.Scanner;
public class DML_PreparedStatement
{
	public static void main(String[]args) throws Exception
	{
		Connection con = Provider.getOracleConnection();
		String sql=null;
		int status=0;
		//Here logic to insert records
		
		sql="Insert into student values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		
		System.out.println("Enter roll, name, cgpa");
		Scanner sc = new Scanner(System.in);
		int roll = sc.nextInt();
		String name = sc.next();
		double cgpa = sc.nextDouble();
		
		
		pst.setInt(1, roll);
		pst.setString(2, name);
		pst.setDouble(3, cgpa);
		
		status =pst.executeUpdate();
		
		if(status>0)
			System.out.println("Record Inserted...."+status);
		else
			System.out.println("Not Done....");
		
		System.out.println("Enter updated cgpa for given roll ");
		cgpa = sc.nextDouble();
		sql="update student set cgpa=? where roll=888";
		pst=con.prepareStatement(sql);
		pst.setDouble(1, cgpa);
		status =pst.executeUpdate();
		if(status>0)
			System.out.println("Record updated........"+status);
		else
			System.out.println("Not Done....");
		
		
		sql="delete from student where roll=?";
		System.out.println("Enter roll for whose row is deleted");
		pst=con.prepareStatement(sql);
		pst.setInt(1, sc.nextInt());
		status =pst.executeUpdate();
		if(status>0)
			System.out.println("Record deleted ......."+status);
		else
			System.out.println("Not Done....");
		
	
		sc.close();
	}
}
