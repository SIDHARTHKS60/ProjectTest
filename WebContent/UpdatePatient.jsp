<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdatePatient</title>
</head>
<body>
<form action="UpdatePatient" method="post">
<div>Patient ID
<input type="number" name="ptid"/><br>
</div><br>
<div>Patient Name
<input type="text" name="ptname"/><br>
</div><br>
<div>Patient Address
<input type="text" name="ptaddr"/><br>
</div><br>
<div>Patient Phone
<input type="number" name="phno"/><br>
</div><br>
<input type="submit" value="UPDATE"/>
</form>
<c:if test="${result != null }">
<b><%= request.getAttribute("result") %></b>
<c:out value="${ output }"/>
<i>${output}</i> 
</c:if>

</body>
</html>