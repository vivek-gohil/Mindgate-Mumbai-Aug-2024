<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Employee CRUD</title>
</head>
<body>
	<h2>All Employees</h2>
	<hr>
	<table border="1">
		<tr>
			<th>Employe Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Salary</th>
			<th colspan="2">Action</th>
		</tr>
		<c:forEach var="employee" items="${employeeList}">
			<tr>
				<td>${employee.employeeId }</td>
				<td>${employee.firstName }</td>
				<td>${employee.lastName }</td>
				<td>${employee.salary }</td>
				<td><a href="update/${employee.employeeId}">Update</a></td>
				<td><a href="delete/${employee.employeeId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="addnewemployee">Add New Employee</a>
</body>
</html>