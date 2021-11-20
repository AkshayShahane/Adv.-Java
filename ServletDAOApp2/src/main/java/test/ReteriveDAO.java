package test;

import java.io.IOException;
import java.sql.*;

import javax.servlet.*;

public class ReteriveDAO 
{
	ResultSet rs=null;
	public ResultSet retrieve()
	{
		try
		{
			Connection con=DBConnection.getCon();
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from product38");
			return rs;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return rs;
		}
		
	}
}
