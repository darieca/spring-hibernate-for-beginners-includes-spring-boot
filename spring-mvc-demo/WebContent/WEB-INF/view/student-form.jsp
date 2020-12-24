<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
	<title>Student Reg Formm</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">
		First Name:: <form:input path="firstName" />
		Last Name:: <form:input path="lastName" />
		
		<br><br>
		<!-- On submit, spring will call student.setCountry(...) -->
		Country:: 
		<form:select path="country">
			<form:option value="Brazil" label="Brazil" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" />
			<form:option value="India" label="India" />
		</form:select>
		<br><br>
		
		Country using maps:: 
		<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br><br>
		
		<!--  radio button, data binding to favLan -->
		Favorite language (radio button):: 
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
			
		<br><br>
		
		Favorite OS (radio button):: 
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
		
		
		
		<input type="submit" value="Submitt!" />
	</form:form>
	
</body>
</html>