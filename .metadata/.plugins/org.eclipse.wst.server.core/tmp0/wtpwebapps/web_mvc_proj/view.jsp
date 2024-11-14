<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of student</title>
 <style>
        table {
            border-collapse: collapse;
            width: 70%;
        }
        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
	<h3>All Students List</h3>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Phone</th>
			<th>Email</th>
			<th>Password</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<c:forEach items="${std}" var="student">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.phone}</td>
				<td>${student.email}</td>
				<td>${student.password}</td>
				<td><a href="delete?id=${student.id}">delete</a></td>
				<td><a href="update?id=${student.id}">update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>