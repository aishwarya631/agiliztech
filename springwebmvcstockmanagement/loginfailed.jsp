<%@ page isELIgnored="false"  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ADMIN LOGIN</h1>
<h4 style="color:red">${msg }</h4>
<form action="adminlogin" method="post">
username<input type="text" name="username"><br>
password:<input type="password" name="password"><br>
<input type="submit" value="login">
</body>
</html>