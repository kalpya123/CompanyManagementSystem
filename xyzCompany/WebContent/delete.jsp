<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
</head>
<body>
 <center>

                <form action="delete" method="post" autocomplete="off">
                <h1>Delete employee</h1>
                <br>
                <br>
                Enter Email :
                <input type="email" placeHolder="employee Email" name="email" autocomplete="off"/>
                <br>
                <br>
                
                <input type="submit" value="delete" name="remove"/>
                </form>

            </center>


</body>
</html>