<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="AuthenticationController" method="post">

		<br> <br> Email:<input type="text" name="email" /> <br>
		<br> Password:<input type="text" name="password" />    <br>
		<br> <input type="submit" value="Login" />
	</form>
	<br> ${error}
</body>
</html>