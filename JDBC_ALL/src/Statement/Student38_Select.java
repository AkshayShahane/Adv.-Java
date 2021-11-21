package Statement;
import java.sql.*;
public class Student38_Select 
{
	public static void main(String[] args) 
	{
		try
		{
			Connection con=DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:orcl","c##akshaySS","akshay11");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from student38");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+
						"\t"+rs.getInt(6));
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
