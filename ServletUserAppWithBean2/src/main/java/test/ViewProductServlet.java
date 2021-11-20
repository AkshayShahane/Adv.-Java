package test;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/view")
public class ViewProductServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		
		 try
		 {
			 Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from UserReg38 where pcode=?");
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		 
		 
	}
}
