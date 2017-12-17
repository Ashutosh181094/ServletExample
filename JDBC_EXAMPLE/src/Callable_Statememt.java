import java.sql.*;
import java.util.*;
public class Callable_Statememt 
{
	public static void main(String[] args) throws Exception
	{
		Connection con=Provider.getOracleConnection();
		CallableStatement cst=con.prepareCall("{?=call fun_insert(?,?,?)}");
		cst.registerOutParameter(1, Types.INTEGER);
		cst.setInt(2, 222);
		cst.setString(3,"qqqq");
		cst.setDouble(4,8.8);
		cst.execute();
		System.out.println("No of students is :"+cst.getInt(1));
		System.out.println("function executed successfully");
		}

}
/*
Create or replace Function fun_insert
(roll number,name varchar2,cgpa number)
return number
is
c number(4);
begin
insert into student values(roll,name,cgpa);
select count(*) into c from student;
return c;
end fun_insert;
/
*/