<!--  ref to JSTL tag library -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
	<title>Student Confirmation!</title>
</head>

<body>
	Student is confirmED: ${student.firstName} ${student.lastName}
	<br><br>
	Country:: ${student.country}
	
	<br><br>
	Country in list form::: 
	<ul>
		<c:forEach var="temp" items="${student.country}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
	
	<br><br>
	Favo Lanaguge:: ${student.favoriteLanguage}
	<br><br>
	
	Operating Systems:
	
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
	
	<br><br>
	
	os in line form::: ${student.operatingSystems.toString()}
</body>
</html>