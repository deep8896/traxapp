<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menu.jsp"%>
-<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update | Lead</title>
</head>
<body>
       <h2>Update lead</h2>
       <form action="updateLead" method = "post">
        <input type = "hidden" name = "id" value="${lead.id}"/><br>
     FirstName<input type = "text" name = "firstName" value="${lead.firstName}"/><br>
        LastName<input type = "text" name = "lastName"value="${lead.lastName}"/><br>
         Email<input type = "email" name = "email"value="${lead.email}"/><br>
          Mobile<input type = "number" name = "mobile"value="${lead.mobile}"/><br>
           <input type = "submit" value = "update"/>
       </form>
       <pre>
       </pre>
 ${msg}
</body>
</html>