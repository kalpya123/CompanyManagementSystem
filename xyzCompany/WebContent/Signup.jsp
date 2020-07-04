<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up</title>
</head>
<body style="text-align:center;">
<link rel="stylesheet" href="/xyzCompany/signup.css" type="text/css">
<div class="bg-img"> 
 <form action="signup" method="post" class="container" style="text-align:center;" autocomplete="off" >
 <br>
  <div class="imgcontainer">
 <img src="images/avatar-png-1.png" alt="Avatar" class="avatar" width="200" height="200">
 </div>
  <h1>SignUp</h1>
 <br>

  <label for="username"><b>Username</b></label>
    <input type="text" placeholder=" Enter Username" name="username"  autocomplete="off" required>
<br>
<br>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" autocomplete="off" required>
<br>
<br>
<label for="email"><b>Email</b></label>
    <input type="email" placeholder="Enter your Email" name="email" autocomplete="off" required>
    <br>
    <br>
    
    <button type="submit" class="btn">Signup</button>
    <br>
    <br>
    
</div> 
  </form>

</body>
</html>