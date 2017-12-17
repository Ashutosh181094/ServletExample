import java.sql.CallableStatement;
import java.sql.Connection;

public class Callable_Stmt {
	public static void main(String args[]) throws Exception
	{
		Connection con=Provider.getOracleConnection();
		CallableStatement cst=con.prepareCall("{call proc_insert(?,?,?)}");
		cst.setInt(1, 111);
		cst.setString(2,"Akshay");
		cst.setDouble(3, 7.8);
		cst.execute();
		System.out.println("Procedure Executed sucessfully");
	}

}




//Create a procedure to insert values into the database
/*Create or replace procedure proc_insert
(roll number,name varchar2,cgpa number)
is
begin
insert into student values(roll,name,cgpa);
end proc_insert;
/

*/