<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of employee</title>
</head>
<body>
	<h4>Employee List</h4>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Desination</th>
			<th>Location</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${emp}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.name}</td>
				<td>${employee.salary}</td>
				<td>${employee.location}</td>
				<td>${employee.posting}</td>
				<td><a href="delete?id=${employee.id}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<h3><a href="menu">Menu Page</a></h3>
</body>
</html>