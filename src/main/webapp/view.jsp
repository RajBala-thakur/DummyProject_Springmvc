<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application View</title>
</head>
<body>
	<table border="2px">
		<tr>
			<th>ID</th>
			<th>App_Name</th>
			<th>User_name</th>
			<th>User_Password</th>
			<th>Delete</th>
			
		</tr>
		<c:forEach items="${slist}" var="application">
			<tr>
				<td>${application.id }</td>
				<td>${user.name}</td>
				<td>${user.password }</td>
				<td><a href="delete?id=${application.id}">Delete</a></td>
				<td><a href="edit?id=${application.id}">Edit</a></td>

			</tr>


		</c:forEach>






	</table>

	<h3>Hii ${name}</h3>
</body>
</html>