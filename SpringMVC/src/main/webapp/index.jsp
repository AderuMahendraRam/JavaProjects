<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>
	<form action="add">
		<table>
			<tr>
				<th>First Value</th>
				<th><input type="number" name="t1" placeholder="enter value 1"></th>
				<th><%= request.getAttribute("error") %>
			</tr>
			<tr>
				<th>Second Value</th>
				<th><input type="number" name="t2" placeholder="enter value 2"></th>
				<th><%= request.getAttribute("error") %>
			</tr>
			<tr>
				<th></th>
				<th><input type="submit" value="Add"></th>
			</tr>
		</table>
	</form>
	
	<div>
		<span>Output : ${output}</span>
	</div>
</body>
</html>
