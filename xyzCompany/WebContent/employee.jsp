<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body style="text-align:center;">
<h1>Add New Employee</h1>  
<center>
<form action="SaveServlet" method="post" autocomplete="off">  
<table width=10% height=70%>  
<tr><td>Name:</td><td><input type="text" name="name" autocomplete="off" required/></td></tr>  
<tr><td>Email:</td><td><input type="email" name="email" autocomplete="off" required/></td></tr>  
<tr><td>Phone Number:</td><td><input type="text" name="phone" autocomplete="off" required/></td></tr>  
<tr><td>salary:</td><td><input type="text" name="salary" autocomplete="off" required/></td></tr>  
<br>
</table>  
<br>
<input type="submit" value="Save Employee"/>
</form>  
  </center>
<br/>  
 <form action="viewemp"><input type="submit" value="view employee" class="btn"></form>
  <br>
  
    <a href='update.jsp'>Update employee</a> <br>
    <br>
      <a href='delete.jsp'>Delete employee</a>
</body>
</html>