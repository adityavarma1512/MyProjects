<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<center><title>Find User</title></center>
</head>
<body>
<center>
		<h2>Find User By Entering UserId</h2>
	</center>

	<form action = "findUserById" method = "post">
		Enter Id: <input type = "text" name = "id">
		<button type = "submit" value = "find">Find</button>
	</form>
</body>
</html>