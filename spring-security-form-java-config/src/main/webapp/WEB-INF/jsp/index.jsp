<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Spring Security Tutorial - Form</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Pragma" content="no-cache">
        <meta http-equiv="Cache-Control" content="no-cache">
        <meta http-equiv="Expires" content="Mon, 22 Jul 1970 11:12:01 GMT">
		<link href="<c:url value='/static/favicon.ico'/>" rel="shortcut icon">
		<link href="<c:url value='/static/style.css'/>" rel="stylesheet" type="text/css"/>
	</head>
	<body>
		<H1>Welcome to the User screen!</H1>
		<p><a href="<c:url value='/admin'/>">Go to Admin screen</a></p>
		<p><a href="<c:url value='/logout'/>">Logout</a></p>
	</body>
</html>
