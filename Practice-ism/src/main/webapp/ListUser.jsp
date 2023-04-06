<%@page import="com.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align ="center">

    <%
		ArrayList<UserBean> users = (ArrayList<UserBean>) request.getAttribute("users");
	%>

<table border="1" align ="center">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
			<th>Edit</th>
			<th>Search</th>
			<th>View</th>
		</tr>

		<%
			for(UserBean user : users) 
			{
		%>
		<tr>
			<td><%=user.getUserId() %></td>
			<td><%=user.getFirstName()%></td>
			<td><%=user.getEmail()%></td>
			<td><%=user.getPassword()%></td>
			<td><a href="DeleteUserController?userId=<%=user.getUserId()%>">Delete</a></td>
			<td><a href="EditUserController?userId=<%=user.getUserId()%>">Edit</a></td>
			<td><a href="Search.jsp">Search</a></td>
			<td><a href="ViewUserController?userId=<%=user.getUserId()%>">View</a></td>
		</tr>
		<%
			}
		%>
		</table>
		<br>
		<br>
		
		<br>
		<br>
		
		 <table border="1" align ="center">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
			<th>Edit</th>
			<th>Search</th>
			<th>View</th>
		</tr>

		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.userId}</td>
				<td>${user.firstName}</td>
				<td>${user.email}</td>
				<td>${user.password}</td>
				<td><a href="DeleteUserController?userId=${user.userId}">Delete</a></td>
				<td><a href="EditUserController?userId=${user.userId}>">Edit</a></td>
				<td><a href="Search.jsp">Search</a></td>
			<td><a href="ViewUserController?userId=${user.userId}">View</a></td>
			
			</tr>
		</c:forEach> 


<!-- 	</table> -->
	
</body>
</html>