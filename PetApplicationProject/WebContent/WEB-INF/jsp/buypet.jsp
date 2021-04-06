<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>buy a pet</title>

</head>
<body>
<h1>Buy Pet</h1>

<tr>
<th>PetId</th><th>PetName</th><th>PetBreed</th><th>Price</th><th>Buy</th>
</tr>
<table>
<c:forEach var="pet" items="${list}">

<tr>
<td>${pet.petId}</td>
<td>${pet.petName}</td>
<td>${pet.petBreed}</td>
<td>${pet.Price}</td>
<td><a href="buypet/${pet.pid}">BuyPet</a></td> 
</tr>

</c:forEach>
 </table>
</body>
</html>