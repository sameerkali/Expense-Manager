<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body bgcolor="blue">
	<div align="right">
	<!-- for logout -->
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="logout">
	</form:form>
	</div>
	
	<div>
		<b><u>user details</u></b><br>
		userid : <br> 
		name :<br>
		username :<br>
		phone number :<br>			
	</div>	
	
</body>
</html>