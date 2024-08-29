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
	<h2>Update Employee</h2>
	<hr>
	<f:form action="/employeecrud/saveupdatedemployee" method="post"
		modelAttribute="employee">
		<table>
			<tr>
				<td>Employee Id</td>
				<td><f:input path="employeeId" readonly="true" /></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><f:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><f:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><f:input path="salary" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</f:form>
</body>
</html>