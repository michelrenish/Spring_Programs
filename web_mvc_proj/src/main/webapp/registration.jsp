<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registeration</title>
</head>
<body>
<form:form action="save" modelAttribute="student">

<form:label path="name">Name :</form:label>
<form:input path="name" type="text" placeholder="Enter Name"/>

<form:label path="phone">Phone :</form:label>
<form:input path="phone" type="number" placeholder="Enter Number"/>

<form:label path="email">Email :</form:label>
<form:input path="email" type="text" placeholder="Enter Mail Id"/>

<form:label path="password">Password :</form:label>
<form:input path="password" type="text" placeholder="Enter password"/>
<input type="Submit" value="register">
</form:form>
<form:form action="view" modelAttribute="student">
<input type="submit" value="Get all Students">
</form:form>
</body>
</html>