<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Employee CRUD</title>
</head>
<body>
	<h2>New Employee</h2>
	<hr>
	<f:form action="saveemployee" method="post" modelAttribute="employee">
		<table>
			<tr>
				<td>First Name</td>
				<td><f:input path="firstName" /></td>
				<td><f:errors path="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><f:input path="lastName" /></td>
				<td><f:errors path="lastName" /></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><f:input path="salary" /></td>
				<td><f:errors path="salary" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</f:form>
</body>
</html>