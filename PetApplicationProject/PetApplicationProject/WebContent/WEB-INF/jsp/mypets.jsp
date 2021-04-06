<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of owned Pets</title>
</head>
<body>
<h1 class="welcome">My Pets</h1>
	<div class="login">
		<table>
			<th>
				<tr>
					<th>Pet Name</th>
					<th>Pet Breed</th>
					<th>Pet Age</th>
				</tr>
			</th>
			<tbody>
				<c:forEach var="pet" items="${myPets}">
					<tr>
						<td><c:out value="${pet.petName}" /></td>
						<td><c:out value="${pet.petBreed}" /></td>
						<td><c:out value="${pet.petAge}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>