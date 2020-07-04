package employee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SaveServlet")
public class emp  extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("name");
		 String email= request.getParameter("email");
		 String phone= request.getParameter("phone");
		 String salary= request.getParameter("salary");
		 EmpDao e= new EmpDao();
if(e.check(name, email,phone,salary))//HTTP 1.1
			 
		 {
			 HttpSession session= request.getSession();
			 session.setAttribute("username", name);
			 response.sendRedirect("AdminHome.jsp");
		 }
		 else
		 {
			 response.sendRedirect("employee.jsp");
		 }
		}
	   
	
}

