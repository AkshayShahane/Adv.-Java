package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/add")
public class AddProduct extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		UserBean ub=new UserBean();
		ub.setpCode(req.getParameter("pcode"));
		ub.setpName(req.getParameter("pname"));
		ub.setPPrice(Integer.parseInt(req.getParameter("pprice")));
		ub.setPqty(Integer.parseInt(req.getParameter("pqty")));
		ServletContext sct=req.getServletContext();
		sct.setAttribute("bean", ub);
		int k=new InsertDAO().register(ub);
		
		if(k>0)
		{
			pw.println("=====================================<br><br>");
			pw.println("Data Inserted Successfully<br><br>");
			pw.println("=====================================<br><br>");
			RequestDispatcher rd=req.getRequestDispatcher("home.html");
			rd.include(req, res);
		}
		
	}
}
