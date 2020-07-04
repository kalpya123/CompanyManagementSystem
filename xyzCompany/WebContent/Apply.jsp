<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply</title>
</head>

<link rel="stylesheet" href="/xyzCompany/apply.css" type="text/css">
<%
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
if(session.getAttribute("username")==null)
{
	response.sendRedirect("Login.jsp");
	
}else
	%>
<link rel="stylesheet" href="/xyzCompany/Career.css" type="text/css">
<div class="topnav">
  <a class="active"><img src="images/avatar-png-1.png" alt="Avatar" width="50" height="17"/> <br>${username}</a>
  <a  href="welcome.jsp">Home</a>
  <a href="Career.jsp" class="active">Career</a>
<%--<a><form action="view"><input type="submit" value="view"></form></a>--%>
  <a href="about.jsp">About us </a>
 
</div>	
<div class="bg-img">

	
<body style="text-align:center;">
<br>

<b><h3>Hello ${username} Please add your details below</h3></b>
<br>

<form action="apply"  method="post" enctype="multipart/form-data" autocomplete="off">
  <label for="fname"><b>First Name</b></label>
  <input type="text"  name="fname" placeholder="First Name" autocomplete="off" required>
  <br>
 <br>
 <br>
  <label for="lname"><b>Last Name</b></label>
  <input type="text"  name="lname" placeholder="Last name" autocomplete="off" required>
  <br>
  <br>
  <br>
  <label for="email"><b>Email</b></label>
  <input type="email" placeholder="Enter your Email" name="email" autocomplete="off" required>
  <br>
  <br>
  <br>
  <label for="number"><b>Phone Number</b></label>
  <input type="number" placeholder="Enter your Phone Number" name="phone" autocomplete="off" required>
  <br>
  <br>
  <br>
  <label for="file"><b>Upload Resume:</b></label>
<input type="file"  name="myfile">
<br>
<br>
<br>
<label for="Career"><b>Select Role</b></label>
  <select  name="job">
     <option>select</option>
    <option value="SoftwareEngineer">Software Engineer</option>
    <option value="HRManager">HR Manager</option>
    <option value="Accountant">Accountant</option>
    
  </select>
<br>
<br>
<br>
<button class="button">Submit</button>
</form>
</div>
</body>
</html>