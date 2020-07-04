package com.apply;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@WebServlet("/apply")
@MultipartConfig(maxFileSize = 65535)

public class apply extends HttpServlet {
	String sql="INSERT INTO details (FirstName, LastName, Email,PhoneNumber,Resume,Role) values (?, ?, ?,?,?,?)";
	String url="jdbc:mysql://localhost:3306/student";
	String username="root";
	String password="kalpya";
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		String mail= request.getParameter("email");
		 String number= request.getParameter("phone");
		 InputStream inputStream = null;
		 String role= request.getParameter("job");
		 Part filePart = request.getPart("myfile");
		 if (filePart != null) {
	         
	            System.out.println(filePart.getName());
	            System.out.println(filePart.getSize());
	            System.out.println(filePart.getContentType());
	            inputStream = filePart.getInputStream();
	        }
		 Connection conn = null;
		 String message = null;
		 try {
	            // connects to the database
	            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	            conn = DriverManager.getConnection(url, username, password);
	            PreparedStatement statement = conn.prepareStatement(sql);
	            statement.setString(1, fname);
	            statement.setString(2, lname);
	            statement.setString(3, mail);
	            statement.setString(4, number);
	            statement.setString(6, role);
	            if (inputStream != null) {
	                
	                statement.setBlob(5, inputStream);
	            }
	            int row = statement.executeUpdate();
	            if (row > 0) {
	                message = "File uploaded and saved into database";
	            }
		 } catch (SQLException ex) {
	            message = "ERROR: " + ex.getMessage();
	            ex.printStackTrace();
	        } finally {
	            if (conn != null) {
	                // closes the database connection
	                try {
	                    conn.close();
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                }
	            }
	            request.setAttribute("Message", message);
	            getServletContext().getRequestDispatcher("/welcome.jsp").forward(request, response);
	}
}
}
