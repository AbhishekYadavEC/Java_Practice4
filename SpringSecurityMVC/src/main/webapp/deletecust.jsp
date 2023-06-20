<!DOCTYPE html>
<html lang="en">
<%@page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>
<meta charset="UTF-8">
<title>Title</title>
</head>

<body>

<form:form action="delete">
Enter the customer ID you want to delete <input name="id" type="text" >

<input type="submit" value="Delete"/>
</form:form>

</body>
</html>