<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Career</title>
</head>
<body style="background-image: url('images/160419_1555399556.jpg');">
<%
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
if(session.getAttribute("username")==null)
{
	response.sendRedirect("Login.jsp");
	
}
	
%>
<link rel="stylesheet" href="/xyzCompany/Career.css" type="text/css">
<div class="topnav">
  <a class="active"><img src="images/avatar-png-1.png" alt="Avatar" width="50" height="17"/> <br>${username}</a>
  <a  href="welcome.jsp">Home</a>
  <a href="Career.jsp" class="active">Career</a>
<%--<a><form action="view"><input type="submit" value="view"></form></a>--%>
  <a href="about.jsp">About us </a>
 
</div>

<br>
<br>
<h1>Career with us </h1>
<h2>Apply jobs  </h2>
<div style="background-color:powderblue;">
<hr >
<form action="Apply.jsp">
<h2>Software Engineer</h2>
<p>
Beginning your software engineer job description with an introductory paragraph<br>
 about your company and the working environment is the best way to set your company<br>
  apart from other employers. 
Take two or three sentences to let developers know what you <br>
bring to the table for new hires so you know 
youre attracting the best of the best.
</p>
<b>Software Engineer Job Responsibilities:</b>
<ul>

<li>Develops information systems by designing, developing, and installing software solutions.</li>
  <li>Determines operational feasibility by evaluating analysis, problem definition, requirements, <br>solution development, and proposed solutions.</li>
  <li>Develops software solutions by studying information needs, conferring with users, and studying <br>systems flow, data usage, and work processes.</li>
    <li>Investigates problem areas.</li>
</ul>  

<b>Software Engineer Qualifications / Skills:</b>
<ul>

<li>General programming skills</li>
  <li>Software design.</li>
  <li>Teamwork</li>
    <li>Problem solving</li>
</ul>
<p style="text-align:center;">  
<input type="submit" value="Apply">
</p>
</form>
<hr>
</div>
<form action="Apply.jsp">
<div style="background-color:powderblue;">
<hr>
<h2>HR Manager</h2>
<p>
We are looking for an HR Manager to oversee all aspects of human resources practices and processes.
</p>
<b>Hr Manager Responsibilities:</b>
<ul>

<li>Develop and implement HR strategies and initiatives aligned with the overall business strategy</li>
  <li>Bridge management and employee relations by addressing demands, grievances or other issues</li>
  <li>Manage the recruitment and selection process</li>
    <li>Support current and future business needs through the development, engagement, motivation and preservation of human capital</li>
</ul>  

<b>Hr Manager Qualifications / Skills:</b>
<ul>

<li>People oriented and results driven</li>
  <li>Demonstrable experience with Human Resources metrics</li>
  <li>Knowledge of HR systems and databases</li>
    <li>Excellent active listening, negotiation and presentation skills</li>
</ul>
<p style="text-align:center;">  
<input type="submit" value="Apply">
</p>
<hr>
</form>
</div>
<form action="Apply.jsp">
<div style="background-color:powderblue;">
<hr>
<h2>Accountant</h2>
<p>
We are looking for an Accountant  to oversee all aspects of Accountants practices and processes.
</p>
<b>Accountant  Responsibilities:</b>
<ul>

<li>Provides financial information to management by researching and analyzing accounting data; preparing reports.</li>
  <li>Prepares asset, liability, and capital account entries by compiling and analyzing account information.</li>
  <li>Documents financial transactions by entering account information.</li>
    <li>ummarizes current financial status by collecting information; preparing balance sheet, profit and loss statement, and other reports.</li>
</ul>  

<b>Accountant  Qualifications / Skills:</b>
<ul>
<li>Accounting</li>
  <li>Corporate Finance</li>
  <li>Reporting Skills</li>
    <li>General Math Skills</li>
</ul>
<p style="text-align:center;">  
<input type="submit" value="Apply">
</p>
<hr>
</div>
</form>
</body>
</html>