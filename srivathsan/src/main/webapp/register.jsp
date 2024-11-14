<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
<form:form action="save" modelAttribute="student">
<form:label path="name">Name</form:label>
<form:input path="name" type="text" placeholder="Enter Name"/>

<form:label path="phone">Phone</form:label>
<form:input path="phone" type="tel" placeholder="Enter phone no"/>

<form:label path="email">Email</form:label>
<form:input path="email" type="email" placeholder="Enter email"/>

<form:label path="password">Password</form:label>
<form:input path="password" type="password" placeholder="Enter password"/>

<input type="submit" value="register">
</form:form>


</body>
</html>