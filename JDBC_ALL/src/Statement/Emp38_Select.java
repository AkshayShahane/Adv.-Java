package Statement;
import java.sql.*;
public class Emp38_Select 
{
	public static void main(String[] args)
	{
		try
		{
			Connection con=DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:orcl","c##akshaySS","akshay11");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from emp38");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
