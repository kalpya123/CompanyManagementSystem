<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body style="text-align:center;">
<link rel="stylesheet" href="/xyzCompany/login.css" type="text/css">
<script type="text/javascript" src="/xyzCompany/index.js"></script>
<div class="bg-img">

<b style="text-align:center;">xyz company</b>  
 <form action="Login" method="post" class="container" style="text-align:center;" autocomplete="off">
 <br>
  <div class="imgcontainer">
 <img src="images/avatar-png-1.png" alt="Avatar" class="avatar" width="50" height="200">
 </div>
  <h1>Login</h1>
 <br>
 <br>
  <label for="username"><b>Username</b></label>
    <input type="text" placeholder=" Enter Username" name="uname" id="uname" autocomplete="off"required>
<br>
<br>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pass" id="passw" autocomplete="off" required>
<br>
<br>

    <button type="submit" class="btn"  onclick="validate()">Login</button>
    <br>
    <br>
     <b>new here</b>     
<a href="Signup.jsp"><b>Sign Up</b></a>
 <b>For Admin </b>     
<a href="adminLogin.jsp"><b>Admin Login</b></a>
</div> 
  </form>
 </div>


</div>
</div>



</body>
</html>