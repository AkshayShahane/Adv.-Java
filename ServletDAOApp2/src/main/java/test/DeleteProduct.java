package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/delete")
public class DeleteProduct extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int Pcode=Integer.parseInt(req.getParameter("pdelete"));
		
		int k=new DeleteDAO().delete(Pcode);
		
		if(k>0)
		{
			pw.println("=======================================<br><br>");
			pw.println("<h3>Record Deleted Successfully...<h3><br><br>");
			pw.println("=======================================<br><br>");
			RequestDispatcher rd=req.getRequestDispatcher("home.html");
			rd.include(req, res);
		}
		else
		{
			pw.println("=======================================<br><br>");
			pw.println("<h3>Record Not found or No records</h3>");
			pw.println("<h3>Try again...</h3>");
			pw.println("=======================================<br><br>");
			RequestDispatcher rd=req.getRequestDispatcher("home.html");
			rd.include(req, res);
			
		}
	}
}
