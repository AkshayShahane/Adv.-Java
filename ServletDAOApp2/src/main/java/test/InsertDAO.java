package test;

import java.sql.*;

public class InsertDAO 
{
	int k=0;
	public int register(UserBean ub)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into Product38 values(?,?,?,?)");
			ps.setString(1,ub.getpCode());
			ps.setString(2,ub.getpName());
			ps.setInt(3, ub.getPPrice());
			ps.setInt(4, ub.getPqty());
			k=ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return k;
	}
}
