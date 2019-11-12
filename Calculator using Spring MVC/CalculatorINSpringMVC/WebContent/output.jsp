<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Output : ${calculator.firstValue} ${calculator.operation} ${calculator.secondValue} = ${calculator.output}
	<hr>
	
	<ul>
		<c:forEach var="list" items="${calculator.allCalHistory}">
		<li>${list}</li>
		</c:forEach>
	
	</ul>
</body>
</html>