<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body align="center">
<br><br><br><br><br><br>
<form action="Validate" method="post">
<div>
<h2>Login_Page:-</h2>
<table align="center">
	<tr>
		<td>Email_Id:</td>
		<td><input type="email" name="email" id="tbemail"></td>
	</tr>
	<tr></tr><tr></tr><tr></tr>
	<tr>
		<td>Password:</td>
		<td><input type="password" name="password" id="tbpassword"></td>
	</tr>
	<tr></tr><tr></tr><tr></tr>
	<tr>
		<td></td>
		<td><input type="submit" value="Login">
		<input type="reset" value="Reset"></td>
	</tr>
</table>
</div>
</form>
</body>
</html>