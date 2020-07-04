package employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewemp")
public class View  extends HttpServlet{
	 public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
     {  
        PrintWriter out = res.getWriter();  
        res.setContentType("text/html");  
        out.println("<html><body>");  
        try 
        {  //com.mysql.cj.jdbc.Driver
       	 Class.forName("com.mysql.cj.jdbc.Driver");
       	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "kalpya");
       	 Statement stmt = con.createStatement();
       	 ResultSet rs = stmt.executeQuery("select * from employee3");
       	 out.println("<center><h2>Hey  here is details of Employees</h2><center> <br> <br>");
       	 out.println("<table border=1 width=100%>");  
       	 out.println("<tr><th>Name</th><th>Email</th><th>PhoneNumber</th><th>salary</th><tr>");
       	 while (rs.next()) 
            {  
                String n = rs.getString("Name");  
                String nm = rs.getString("Email");  
                String nk = rs.getString("PhoneNumber");
                String np = rs.getString("salary");
                 
                
               
                out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + nk + "</td><td>" + np + "</td></tr>");   
        }
       	 
       	 out.println("</table>");  
       	 out.println("<p> <a href='employee.jsp'>add/delete/updateEmployee</a></p>"); 
       	 out.println("</html></body>");  
            con.close();  
           }  
            catch (Exception e) 
           {  
            out.println("error");  
        }  

}
}
