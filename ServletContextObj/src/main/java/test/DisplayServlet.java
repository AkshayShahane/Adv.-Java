package test;
import java.io.*;
import javax.servlet.*;
public class DisplayServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String uName=req.getParameter("uname");
		pw.println("Hello User: "+uName);
		ServletContext sct=req.getServletContext();
		pw.println("<br><br>ServerInfo:"+sct.getServerInfo());
		pw.println("<br><br>ContextValue: "+sct.getInitParameter("a"));
	}
}
