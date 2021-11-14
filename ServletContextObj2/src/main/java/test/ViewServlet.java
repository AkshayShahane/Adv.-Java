package test;
import java.io.*;
import javax.servlet.*;

public class ViewServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String uName=req.getParameter("uname");
		int age=Integer.parseInt(req.getParameter("age"));
		pw.println("<br>========User Details========");
		pw.println("<br><br>Hello User "+uName);
		pw.println("<br><br>Your age is"+age);
		ServletContext sct=req.getServletContext();
		pw.println("<br><br>Server Name is: "+sct.getServerInfo());
		pw.println("<br><br>Your weight is=>"+sct.getInitParameter("Weight"));
	}
}
