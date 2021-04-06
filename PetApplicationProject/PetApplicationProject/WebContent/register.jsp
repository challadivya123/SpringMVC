

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<form action="LoginRegister">
<h3 align="center" style="color:red;">Registration Page</h3>
<table align="center" style="background-color:indigo;margin-left:20px">
<tr>

<td><input type="text" name="userName"></td>
</tr>
<tr>
<td>UserName:</td>
<td>
<input type="text" name="userName"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="password1"></td>
</tr>
<tr>
<td>ConfirmPassword:</td>
<td><input type="password" name="password2"></td>
</tr>
<tr>
<td><input type="submit" name="submit" value="Register!">
</td>
</tr>
</table>
</form>
</body>
</html>