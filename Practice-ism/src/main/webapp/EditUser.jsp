<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="EditUserController" method="post">
<input type="hidden" name="userId" value="${param.userId}"/>
FirstName :<input type="text" name="firstName" value="${user.firstName}"/><br><br>
<input type="submit" value="Update"/>

</form>

</body>
</html>