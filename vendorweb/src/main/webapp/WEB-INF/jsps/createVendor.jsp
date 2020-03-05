<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Vendor</title>
</head>
<body>
	<form action="saveVendor" method="POST">
		<pre>
Id: <input type="text" name="id" />
Code: <input type="text" name="code" />
Name: <input type="text" name="name" />
<label for="type"> Type: </label>
<select id="type" name="type">
<option value="Regular">Regular</option>
<option value="Contract">Contract</option>
</select>
Email:<input type="email" name="email" />
Phone:<input type="tel" name="phone" />
<label for="address">Address:</label>
<textarea id="address" rows="4" cols="50" name="address"></textarea>
<input type="submit" value="Save" />
</pre>
	</form>
<p>${msg}</p>
<a href="displayAllVendors">Display Vendors</a>
</body>
</html>