package test;
import java.io.*;
import javax.servlet.*;
public class ViewServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String Name=req.getParameter("uname");
		String Address=req.getParameter("address");
		pw.println("<br>========User Info======");
		pw.println("<br><br>User Name: "+Name);
		pw.println("<br><br>User Address"+Address);
		ServletConfig scf=this.getServletConfig();
		pw.println("<br><br>Servlet name: "+scf.getServletName());
		pw.println("<br><br>Height of user inside ConfigObj==>"+scf.getInitParameter("height"));
	}
}
