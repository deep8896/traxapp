<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of ALL Leads</title>
</head>
<body>
<h2>List of All Leads</h2>
<table border = 1>
<tr>
<th>
Id
</th>
<th>
FirstName
</th>
<th>
LastName
</th>
<th>
Email
</th>
<th>
Mobile
</th>
<th>
Delete
</th>
<th>
Update
</th>
</tr>
<c:forEach var ='l' items ="${leads}">
<tr>
<td> ${l.id}</td>
<td> ${l.firstName}</td>
<td> ${l.lastName}</td>
<td> ${l.email}</td>
<td> ${l.mobile}</td>
<td> <a href ="delete?id=${l.id}">delete</a></td>
<td> <a href ="update?id=${l.id}"><input type= "submit" value = "update"></a></td>
</tr>
  </c:forEach>
</table>

</body>
</html>