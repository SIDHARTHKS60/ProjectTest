<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add patient</title>
</head>
<body>
<form action="AddPatient" method="post">
<div>
Patient Id
<input type="number" name="ptid"/>
</div>
<div>
Patient Name
<input type="text" name="ptname"/>
</div>
<div>
Patient Address
<input type="text" name="ptaddr"/>
</div>
<div>
Phone No
<input type="number" name="phno"/>
</div>
<input type="submit" value="SAVE"/>
</form><c:if test="${result != null }">
<b><%= request.getAttribute("result") %></b>
<c:out value="${ output }"/>
<i>${output}</i> 
</c:if>
</body>
</html>