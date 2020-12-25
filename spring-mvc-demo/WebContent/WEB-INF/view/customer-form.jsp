<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Customer reg form</title>
	
	<!-- .error need to be the same as cssClass = "error" -->
	<style>
		.error {color:red}
	</style>
</head>

<body>

<i>Fill out form. Asterisk means required.</i>
<br><br>

	<!-- NEW - form:errors: Form validation. need same path -->
	<form:form action="processForm" modelAttribute="customer">
		First name: <form:input path="firstName" />
		<form:errors path="firstName" cssClass="error" />
		
		<br><br>
		
		Last name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		
		<br><br>
		
		free passes: <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		
		<br><br>
		
		Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		
		<br><br>
		
		<input type="submit" value="Submitt" />
	</form:form>
</body>
</html>