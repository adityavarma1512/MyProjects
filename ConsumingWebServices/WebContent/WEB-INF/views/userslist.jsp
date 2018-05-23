<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<center><title>Users List</title></center>


</head>
<body>
	<table>
		<tr>
			<th>FIRST NAME</th>
			<th>lAST NAME</th>
			<th>EMAIL ID</th>
			<th>PHONE NO</th>
			<th>STREET NAME</th>
			<th>HOUSE NO</th>
			<th>CITY</th>
			<th>STATE</th>
			<th>ZIP CODE</th>
			<th>STREET NAME</th>
			<th>HOUSE NO</th>
			<th>CITY</th>
			<th>STATE</th>
			<th>ZIP CODE</th>
		</tr>
		<!--  loop over and print our customers -->
		<c:forEach var = "tempUser" items = "${usersList}">
		<tr>
			<td>${tempUser.firstname}</td>
			<td>${tempUser.lastname}</td>
			<td>${tempUser.emailid}</td>
			<td>${tempUser.phoneno}</td>
			<c:forEach var = "tempAddress" items = "${tempUser.addressList}">
			<td>${tempAddress.streetname}</td>
			<td>${tempAddress.housenumber}</td>
			<td>${tempAddress.city}</td>
			<td>${tempAddress.state}</td>
			<td>${tempAddress.zipcode}</td>
			</c:forEach>
		</tr>
		</c:forEach>
	</table>
</body>
</html>