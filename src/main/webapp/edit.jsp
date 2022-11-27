<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="updateapplication" modelAttribute="appliaction">
		<form:label path="id">Id:</form:label>
		<form:input path="id" readonly="true" />
		<br></br>
		<form:label path="app_name">App_Name:</form:label>
		<form:input path="app_name" />
		<br></br>

		<form:label path="email">User_Name:</form:label>
		<form:input path="email" />
		<br></br>
		<form:label path="user_password">User_Password:</form:label>
		<form:input path="user_password" />
		<br></br>
		<input type="submit" value="edit">
	</form:form>

</body>
</html>