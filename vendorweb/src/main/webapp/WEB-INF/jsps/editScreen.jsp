<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<form action="editSaveVendor" method="POST">
		<pre>
Id: <input type="text" name="id" value="${vendor.id}" />
Code: <input type="text" name="code" value="${vendor.code}" />
Name: <input type="text" name="name" value="${vendor.name}" />
<label for="type"> Type: </label>
<select id="type" name="type">
<option value="${vendor.type=='Regular'?'Regular':''}">Regular</option>
<option value="${vendor.type=='Contract'?Contract:'' }">Contract</option>
</select>
Email:<input type="email" name="email" value="${vendor.email}" />
Phone:<input type="tel" name="phone" value="${vendor.phone}" />
<label for="address">Address:</label>
<textarea id="address" rows="4" cols="50" name="address">${vendor.address}</textarea>
<input type="submit" value="Save" />
</pre>
	</form>
<p>${msg}</p>
<a href="displayAllVendors">Display Vendors</a>
</body>
</html>