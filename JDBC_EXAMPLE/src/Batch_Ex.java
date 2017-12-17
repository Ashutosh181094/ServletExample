import java.sql.*;
public class Batch_Ex 
{
public static void main(String[] args) throws Exception
{
	Connection con=Provider.getOracleConnection();
	String query1="Insert into student values(1,'x',9)";
	String query2="Insert into student values(2,'y',8)";
	String query3="Insert into student values(3,'z',7)";
	String query4="delete from student where roll=111";
	Statement st=con.createStatement();
	st.addBatch(query1);
	st.addBatch(query2);
	st.addBatch(query3);
	st.addBatch(query4);
	int status[]=st.executeBatch();//execute Batch returns an array with value 0s or any value greater than 0. Value greater than 0 means that query has been successfully 
	//executed and 0 means that batch has not been executed successfully
	for(int i=0;i<status.length;i++)
	{
		System.out.println(status[i]);
	}
}
}
/*
Instead of sending the query one by one to database server.It is better to create a group of related query which is technically
known as batch and batch will be send to database server.The select query cannot be added to the batch as it returns the object of
resultset
addBatch()-addBatch() is a predefined method which is used to add query to batch.
executeBatch()-It is a predefined Method which is used to execute a batch of Query.
 */
