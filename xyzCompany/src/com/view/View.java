package com.view;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.Blob;


@WebServlet("/view")
public class View   extends HttpServlet{
    
	
	
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
        	 ResultSet rs = stmt.executeQuery("select * from details");
        	 out.println("<center><h2>Hey  here is details of applicants</h2><center> <br> <br>");
        	 out.println("<table border=1 width=100% height=50%>");  
        	 out.println("<tr><th>FirstName</th><th>LastName</th><th>Email</th><th>PhoneNumber</th><th>Role</th><tr>");
        	 while (rs.next()) 
             {  
                 String n = rs.getString("FirstName");  
                 String nm = rs.getString("LastName");  
                 String nk = rs.getString("Email");
                 int np = rs.getInt("PhoneNumber");
                 String rn = rs.getString("Role");
              //  String nr = rs.getString("Resume");
                 
                
                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + nk + "</td><td>" + np + "</td><td>" + rn + "</td></tr>");   
         }
        	 
        	 out.println("</table>");  
//        	 out.println("<p> <a href='view.jsp'>to add/edit/delete/update  employees</a></p>"); 
        	 out.println("</html></body>");  
             con.close();  
            }  
             catch (Exception e) 
            {  
             out.println("error");  
         }  

}
}

