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
<body>
	Welcome To First Maven Web Project Using Spring...!
	<br><br>
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="logout">
	</form:form>
	
</body>
</html>