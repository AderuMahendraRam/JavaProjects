<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<form:form action="showOutput" modelAttribute="calculator">
		<table>
			<tr>
				<td>First Value :</td>
				<td><form:input path="firstValue"
						placeholder="please enter a digit" /></td>
			</tr>
			<tr>
				<td>Select Operation :</td>
				<td><form:select path="operation">
						<form:option value="+" lable="add">ADD(+)</form:option>
						<form:option value="-" lable="sub">SUB(-)</form:option>
						<form:option value="*" lable="mul">MUL(*)</form:option>
						<form:option value="/" lable="div">DIV(/)</form:option>
					</form:select></td>
			</tr>
			<tr>
				<td>Second Value :</td>
				<td><form:input path="secondValue"
						placeholder="please enter a digit" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form:form>
	<br>
	<label>output : ${calculator.firstValue} ${calculator.operation} ${calculator.secondValue} = ${calculator.output}</label>
	<br>
	<hr>
	

</body>
</html>