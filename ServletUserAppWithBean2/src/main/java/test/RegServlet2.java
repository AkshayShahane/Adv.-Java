package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/reg2")
public class RegServlet2 extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		ServletContext sct=req.getServletContext();
		UserBean ub=(UserBean)sct.getAttribute("bean");
		ub.setAddr(req.getParameter("addr"));
		ub.setmId(req.getParameter("mid"));
		ub.setPhNo(Long.parseLong(req.getParameter("phno")));
		int k=new RegisterDAO().register(ub);
		
		if(k>0)
		{
			pw.println("User Registration Successfull");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
		
	}
}
