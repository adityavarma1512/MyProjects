<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>RegistrationPage</title>
<style>
* {
	box-sizing: border-box;
}

/* Create three equal columns that floats next to each other */
.column {
	float: left;
	width: 33.33%;
	padding: 10px;
	height: 300px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}
</style>
</head>
<body>
	<center>
		<h2>Registration Page</h2>
	</center>

	<form:form modelAttribute="insert">

		<div class="row">
			<div class="column">
				<center><h2>User Info</h2></center>
				<table>
					<tr>
						<td>First Name:<td>
						<td><form:input path="firstname" /></td>
					</tr>
					<tr>
						<td>Last Name:<td>
						<td><form:input path="lastname" /></td>
					</tr>
					<tr>
						<td>Email :<td>
						<td><form:input path="emailid" /></td>
					</tr>
					<tr>
						<td>Phone :<td>
						<td><form:input path="phoneno" /></td>
					</tr>
				</table>
			</div>
			<div class="column">
				<center><h2>Home Address</h2></center>
				<table>
					<tr>
						<td>Street Name:<td>
						<td><form:input path="addressList[0].streetname" /></td>
					</tr>
					<tr>
						<td>House NO:<td>
						<td><form:input path="addressList[0].housenumber" /></td>
					</tr>
					<tr>
						<td>City :<td>
						<td><form:input path="addressList[0].city" /></td>
					</tr>
					<tr>
						<td>State :<td>
						<td><form:input path="addressList[0].state" /></td>
					</tr>
					<tr>
						<td>ZipCode :<td>
						<td><form:input path="addressList[0].zipcode" /></td>
					</tr>
				</table>
			</div>
			<div class="column">
				<center><h2>Office Address</h2></center>
				<table>
					<tr>
						<td>Street Name:<td>
						<td><form:input path="addressList[1].streetname" /></td>
					</tr>
					<tr>
						<td>House NO:<td>
						<td><form:input path="addressList[1].housenumber" /></td>
					</tr>
					<tr>
						<td>City :<td>
						<td><form:input path="addressList[1].city" /></td>
					</tr>
					<tr>
						<td>State :<td>
						<td><form:input path="addressList[1].state" /></td>
					</tr>
					<tr>
						<td>ZipCode :<td>
						<td><form:input path="addressList[1].zipcode" /></td>
					</tr>
				</table>
			</div>
		</div>
		<tr>
					<center><td colspan="2"><td>
						<input type="submit" value="Submit" /></td>
					</tr><center>
	</form:form>
</body>
</html>