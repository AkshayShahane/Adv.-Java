package test;
import java.sql.*;
public class DeleteDAO
{
	int k=0;
	
	public int delete(int ppcode)
	{
		
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("delete from product38 where pcode=?");
			ps.setInt(1,ppcode);
			int k=ps.executeUpdate();
			
			return k;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return k;
		}
		
	}
	
}
