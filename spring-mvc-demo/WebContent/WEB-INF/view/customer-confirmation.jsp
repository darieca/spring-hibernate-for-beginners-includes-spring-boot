<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
	<title>Customer Confirmed!</title>
</head>

<body>
	The customer is confirmed: ${customer.firstName} ${customer.lastName}
	<br><br>
	customer free pass count: ${customer.freePasses}
	<br><br>
	customer postal codee: ${customer.postalCode}
</body>
</html>