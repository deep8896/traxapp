<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create | Lead</title>
</head>
<body>
       <h2>create lead</h2>
       <form action="saveLead" method = "post">
          FirstName<input type = "text" name = "firstName"/><br>
          LastName<input type = "text" name = "lastName"/><br>
          Email<input type = "email" name = "email"/><br>
          Mobile<input type = "number" name = "mobile"/><br>
          
           <input type = "submit" value = "save"/>
       </form>
       <pre>
       </pre>
 ${msg}
</body>
</html>