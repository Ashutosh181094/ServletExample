import java.sql.*;
import java.io.*;
public class Multimedia_Processing1 
{
	public static void main(String[] args) throws Exception
	{
		Connection con=Provider.getOracleConnection();
		String sql="select photo from Multi_1 where slno=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, 103);
		ResultSet rs=pst.executeQuery();
		if(rs.next())
		{
			FileOutputStream fos=new FileOutputStream("2.mp4");
			InputStream fis=rs.getBinaryStream(1);//get the value of first column
			int ch;
			while((ch=fis.read())!=-1)
			{
				fos.write(ch);
			}
			System.out.println("Fetched............");
			fis.close();
			fos.close();
			
		}
	}

}
//This is used to Fetch the audio video and images from the database
