<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Available Pet For Buy</title>
</head>
<body>
<h1>Buy Pet</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>PetId</th><th>PetName</th><th>PetBreed</th><th>PetPrice</th><th>Availability</th><th>Buy</th></tr>
<c:foreach var="pet" item="${list}">
<tr>
<td>${pet.petId}</td>
<td>${pet.petName}</td>
<td>${pet.petBreed}</td>
<td>${pet.petPrice}</td>
<td>${pet.availability}</td>
<td><a href="buypet/${pet.petId}">BuyPet</a></td> 
</tr>
</c:foreach>
 </table>
</body>
</html>