package test;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProductServlet extends GenericServlet 
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		 res.setContentType("text/html");
		try
		{
		ResultSet rs=new ReteriveDAO().retrieve();
		 
		 pw.println("<html><body><table border=1px><tr><th>PCode</th><th>PName</th><th>PPrice</th><th>PQuantity</th>");
		 pw.println("<br>");
	
		 	while(rs.next())
		 	{
		 		
		 		//pw.println(rs.getString(1));
		 		pw.println("<tr><td>"+rs.getString(1)+"</td>"+"\t"+"<td>"+rs.getString(2)+"</td>"+"\t"+"<td>"+rs.getInt(3)+"</td>"+"\t"+"<td>"+rs.getInt(4)+"</td></tr>");
		 		pw.println("<br>");
		 	}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		pw.println("</table></body></html>");
		 RequestDispatcher rd=req.getRequestDispatcher("home.html");
		 rd.include(req, res);
	}
}
