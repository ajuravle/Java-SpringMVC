<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>SpringMVC FORM</title>
</head>
<body>

	<form:form modelAttribute="userForm" action="/SpringMVC/addUser" method="POST">
		<table>
			<tr>
				<td><form:label path="username">Name: </form:label></td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password: </form:label></td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"/></td>
			</tr>
		</table>
	</form:form>

</body>
</html>