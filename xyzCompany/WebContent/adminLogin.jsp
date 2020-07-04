<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
<link rel="stylesheet" href="/xyzCompany/login.css" type="text/css">
<div class="bg-img">

<b style="text-align:center;">xyz company</b>  
 <form action="AdminLogin" method="post" class="container" style="text-align:center;" autocomplete="off">
 <br>
  <div class="imgcontainer">
 <img src="images/avatar-png-1.png" alt="Avatar" class="avatar" width="50" height="200">
 </div>
  <h1>Admin Login</h1>
 <br>
 <br>
  <label for="username"><b>Username</b></label>
    <input type="text" placeholder=" Enter Username" name="uname" id="uname" autocomplete="off" required>
<br>
<br>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pass" id="passw" autocomplete="off" required>
<br>
<br>

    <button type="submit" class="btn"  onclick="validate()">Login</button>
    <br>
    <br>
 <b>For Users </b>     
<a href="Login.jsp">    <b>User Login</b></a>
</div> 
  </form>
 </div>


</div>
</div>


</body>
</html>