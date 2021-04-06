<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="petAddition">
<table>
<tr>
<td><h3 style="color:red;">Addition of pets</h3></td>
</tr>
<tr>
<td>Pet Id:</td>
<td><input type="text" name="petId"></td>
</tr>
<tr>
<td>Pet Name:</td>
<td><input type="text" name="petName"></td>
</tr>
<tr>
<td>Pet Breed:</td>
<td><input type="text" name="breed"></td>
</tr>
<tr>
<td>Pet Age:</td>
<td><input type="text" name="age"></td>
</tr>
<tr>
<td><input type="submit" name="submit" value="Add pet">
</td>
</tr>
</table>
</form>
</body>
</html>