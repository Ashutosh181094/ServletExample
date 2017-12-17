import java.sql.*;


public class Transaction_EX 
{
	public static void main(String[] args) throws Exception
	{
		Connection con=Provider.getOracleConnection();
		String query1="Insert into student values(1,'x',9)";
		String query2="Insert into student values(2,'y',8)";
		String query3="Insert into student values(3,'z',7)";
		String query4="delete from student where roll=111";
		Statement st=con.createStatement();
		con.setAutoCommit(false);
		int st1=st.executeUpdate(query1);
		int st2=st.executeUpdate(query2);
		int st3=st.executeUpdate(query3);
		int st4=st.executeUpdate(query4);
		if(st1>0 && st2>0 && st3>0 && st4>0)
		{
			con.commit();
			System.out.println("All query executed successfully so transaction commited ");
		}
		else
		{
			con.rollback();
			System.out.println("All query not executed sucessfully, so transaction rollback");
		}
		

}

}
/*
   TRANSACTION PROCESSING
---------------------------
DML operation is known as transaction transaction.Transaction cannot be saved untill and unless TCL statement is issued
By default java supports autocommit.So to manage the transaction we have to disable autoCommit mode.Execute more than
one sql statement on the basis of Nothing or Everything principle is known as Transaction Management.
For example if we transfer money from our account to another account.Suppose if the money is deducted from our account
but not added to the other account than this is incorrect transaction and needs to be roolBacked.This is managed by
Transaction Processing.If at any point the query is not executed then the entire transaction rollbacks
*/