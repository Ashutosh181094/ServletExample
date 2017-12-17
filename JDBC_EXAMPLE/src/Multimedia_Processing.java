import java.sql.*;
import java.io.*;
public class Multimedia_Processing 
{
public static void main(String[] args) throws Exception
{
	Connection con=Provider.getOracleConnection();
	FileInputStream fis=new FileInputStream("2.mp4"); //to read from file
	String sql="insert into Multi_1 values(?,?)";
	PreparedStatement pst=con.prepareStatement(sql);
	pst.setInt(1, 103);//
	pst.setBinaryStream(2, fis, fis.available());
	int status=pst.executeUpdate();
	if(status>0)
	System.out.println("Yes,Multimedia stored.......");
		else
	System.out.println("Error...........");
}
}
//This program is used to store the images audios and videos in database.