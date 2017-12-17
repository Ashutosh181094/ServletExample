import java.sql.*;
public class Date_Processing {
public static void main(String args[]) throws Exception
{
	Connection con=Provider.getMysqlConnection();
	String d="2017-11-21";
	String t="07:10:15";
	String ts="2017-11-21 07:10:15";
			
			Date dd=Date.valueOf(d);
	Time tt=Time.valueOf(t);
	Timestamp tts=Timestamp.valueOf(ts);
	String sql="insert into DTS values(?,?,?)";
	PreparedStatement pst=con.prepareStatement(sql);
	pst.setDate(1, dd);
	pst.setTime(2, tt);
	pst.setTimestamp(3, tts);
	int status=pst.executeUpdate();
	if(status>0)
	{
		System.out.println("Yes date,time,timestamp,inserted");
	
	}
	else
		System.out.println("Error.......");
	System.out.println("-------------------------------");
	sql="select * from dts";
	pst=con.prepareStatement(sql);
	ResultSet rs=pst.executeQuery();
	while(rs.next())
	{
		System.out.println(rs.getDate(1)+"\t"+rs.getTime(2)+"\t"+rs.getTimestamp(3));
	}
	
}
}
