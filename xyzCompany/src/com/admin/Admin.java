package com.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AdminLogin")
public class Admin extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String uname= request.getParameter("uname");
		 String pass= request.getParameter("pass");
		
	
		 if (uname.equals("admin") && pass.equals("admin"))
		 {
			 HttpSession session= request.getSession();
			 session.setAttribute("username", uname);
			 response.sendRedirect("AdminHome.jsp");
		 }
		 
		 else
		 {
			 response.sendRedirect("Login.jsp");
		 }
		 
		
		}
}
