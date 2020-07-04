package employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class deleteEmp extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out=response.getWriter();   
		    Connection con=null;
		    try {

		        String id=request.getParameter("email");
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","kalpya");
		        PreparedStatement ps=con.prepareStatement("delete from employee3 where Email=?");
		        ps.setString(1, id);
		        int i=ps.executeUpdate();
		        if(i!=0)
		        {
//		            out.println("deleted Successfully");
		            response.sendRedirect("employee.jsp");
		        }
		        else if(i==0)
		        {
		            out.print("deleted");
		        }
		    } catch ( Exception e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		}
	
	}
