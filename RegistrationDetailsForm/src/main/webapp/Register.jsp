<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration_Form</title>
</head>
<body align="center">
<br><br><br><br><br><br>
<form action="Insert" method="post">
<div>
<h2>Register_Details:-</h2>
<table align="center">

	<tr>
		<td>Full_Name:</td>
		<td><input type="text" name="name" id="tbname"></td>
	</tr>
	<tr></tr><tr></tr><tr></tr>
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
		<td>Mobile_Number:</td>
		<td><input type="tel" name="mobile" id="tbmobile"></td>
	</tr>
	<tr></tr><tr></tr><tr></tr>
	<tr>
		<td>Gender:</td>
		<td><input type="radio" name="gender" value="Male">Male&nbsp;&nbsp;
			<input type="radio" name="gender" value="Female">Female&nbsp;&nbsp;
			<input type="radio" name="gender" value="Others">Others</td>
	</tr>
	<tr></tr><tr></tr><tr></tr>
	<tr>
		<td>City:</td>
		<td><select name="city" id="ddl"><option value="">...Select...</option>
							 <option value="Bangalore">Bangalore</option>
							 <option value="Mangalore">Mangalore</option>
							 <option value="Tirupati">Tirupati</option>
							 <option value="Kerala">Kerala</option>
							 <option value="Hyderabad">Hyderabad</option>
		</select></td>
	</tr>
	<tr></tr><tr></tr><tr></tr>
	<tr>
		<td></td>
		<td><input type="submit" value="Register">
		<input type="reset" value="Reset"></td>
	</tr>
</table>
</div>
</form>
</body>
</html>