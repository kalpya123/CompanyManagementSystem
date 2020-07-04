<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
if(session.getAttribute("username")==null)
{
	response.sendRedirect("Login.jsp");
	
}else
	
%>
<link rel="stylesheet" href="/xyzCompany/welcome.css" type="text/css">
<div class="topnav">
  <a class="active"><img src="images/avatar-png-1.png" alt="Avatar" width="50" height="17"/> <br>Admin</a>
  <a  href="AdminHome.jsp">Home</a>
 <%-- <a href="AdminHome.jsp">Career</a>--%> 
  <a ><form action="view"><input type="submit" value="view" class="btn"></form></a>
 <%--  <a href="about.jsp">About us </a>--%>
<%--  <a> <form action="Logout"><input type="submit" value="Logout"></a>--%>
</div>



<div class="bg-img">
<br> 
<h1>welcome Admin</h1>


<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<h2> Hey Admin  <span style='font-size:30px;'>&#128525;</span>  </h2>
  <form action="Logout">
<input type="submit" value="Logout" class="btn">
</form>
<br>

 <form action="viewemp"><input type="submit" value="view employee" class="btn"></form>
</div>



</body>
</html>