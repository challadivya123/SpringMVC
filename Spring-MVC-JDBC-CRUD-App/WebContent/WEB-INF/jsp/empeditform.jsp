<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<title>Employee Edit Form</title>
</head>
<body>
<h1>Edit Employee</h1>
<form:form method="post" action="http://localhost:8080/Spring-MVC-JDBC-CRUD-App/editsave">
<table>
<tr>
<td></td>
<td><form:hidden path="id"/></td>
</tr>
<tr>
<td>Name:</td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>Salary:</td>
<td><form:input path="salary"/></td>
</tr>
<tr>
<td>Designation:</td>
<td><form:input path="designation"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="EditSave"/></td>
</tr>

</table>
</form:form>
</body>
</html>