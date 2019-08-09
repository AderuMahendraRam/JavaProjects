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
</body>
</html>
