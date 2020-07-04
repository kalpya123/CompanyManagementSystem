package com.signup;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.signup.dao.SignupDao;


@WebServlet("/signup")
public class Signup extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname= request.getParameter("username");
		 String pass= request.getParameter("password");
		  
		 SignupDao dao=new SignupDao();
		 
		 if(dao.check(uname, pass))//HTTP 1.1
			 
		 {
			 HttpSession session= request.getSession();
			 session.setAttribute("username", uname);
			 response.sendRedirect("Login.jsp");
		 }
		 else
		 {
			 response.sendRedirect("Signup.jsp");
		 }
		}


}
