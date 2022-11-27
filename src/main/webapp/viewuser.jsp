<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User view</title>
</head>
<body>
	<table border="2px">
		<tr>
			<th>ID</th>
			<th>App_Name</th>
			<th>User_Name</th>
			<th>User_Email</th>
			<th>User_Password</th>
			<th>User_phone</th>
			<th>User_Id</th>
			
			<th>Delete</th>
			<th>Edit</th>
			
		</tr>
		<c:forEach items="${slist}" var="application">
			<tr>
				<td>${aplication.id }</td>
				<td>${aplication.app_name}</td>
				<td>${application.getUser().name}</td>
				<td>${application.getUser().email}</td>
				<td>${application.getUser().password }</td>
				<td>${application.getUser().phone}</td>
				<td>${application.getUser().id}</td>
				
				
				<td><a href="delete?id=${application.getUser().id}">Delete</a></td>
				<td><a href="edit?id=${application.getUser().id}">Edit</a></td>

			</tr>


		</c:forEach>






	</table>

	<h3>Hii ${name}</h3>
</body>
</html>