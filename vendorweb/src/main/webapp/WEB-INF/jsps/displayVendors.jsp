<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Display Vendors</h2>
<table border="1">
<tr>
<th>Id</th>
<th>Code</th>
<th>Name</th>
<th>Type</th>
<th>Email</th>
<th>Phone</th>
<th>Address</th>
<th></th>
<th></th>
</tr>
<c:forEach items="${vendors}" var="vendor">
<tr>
<td>${vendor.id }</td>
<td>${vendor.code }</td>
<td>${vendor.name }</td>
<td>${vendor.type }</td>
<td>${vendor.email }</td>
<td>${vendor.phone }</td>
<td>${vendor.address }</td>
<td><a href="deleteVendor?id=${vendor.id}">delete</a>
<td><a href="editVendor?id=${vendor.id}">edit</a>
</tr>
</c:forEach>
</table>
<p><a href="showCreateVendor">Create Vendor</a></p>
</body>
</html>