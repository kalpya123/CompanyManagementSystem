package employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/update")
public class upemp extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException
		{
			String name=request.getParameter("name");
		String name1=request.getParameter("txtName");
		String email=request.getParameter("mail");
		String phone=request.getParameter("phone");
		String salary=request.getParameter("salary");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
			("jdbc:mysql://localhost:3306/student","root","kalpya");
		PreparedStatement stmt=con.prepareStatement
			("update employee3 set Name=?,Email=?,PhoneNumber=?,salary=? where Name=?");
		stmt.setString(1, name1);
		stmt.setString(2, email);
		stmt.setString(3, phone);
		stmt.setString(4, salary);
		stmt.setString(5, name);
		stmt.executeUpdate();
		if(true)
//		out.println("<b>You are successfully update</b>");
		 response.sendRedirect("employee.jsp");
		con.close();
		}
		catch(Exception e)
		{
		out.println("<b> failed</b>");
		out.println("<b>Error:</b>" +e);
		}
		}
}
