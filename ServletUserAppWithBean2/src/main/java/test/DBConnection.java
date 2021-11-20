package test;
import java.io.*;
import java.sql.*;

public class DBConnection 
{
	private static Connection con=null;
	private DBConnection()
	{
		
	}
	static
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##akshaySS","akshay11");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static Connection getCon()
	{
		return con;
	}
}
