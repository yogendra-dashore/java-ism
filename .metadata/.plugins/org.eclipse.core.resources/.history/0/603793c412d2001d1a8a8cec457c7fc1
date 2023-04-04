<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">

	<%
		String error = (String)request.getAttribute("error");
	%>

<form action="Registration" method="post" >

FirstName : <input type="text" name="FirstName" placeholder="Enter FirstName"><br><br>
LastName : <input type="text" name="LastName" placeholder="Enter LastName"><br><br>
Gender:
  <input type="radio" id="gender1" name="Gender" value="Male">Male
  <input type="radio" id="gender2" name="Gender" value="Female">Female<br><br>

Email : <input type="text" name="Email" placeholder="Email"><br><br>
Password : <input type="Password" name="Password" placeholder="Enter name"><br><br>
ComfirmPassword : <input type="Password" name="ComfirmPassword" placeholder="Enter ComfirmPassword"><br><br>
<label for="City">City:</label>
    <select name="city">
    <option value="--">--</option>
    <option value="Jalgaon">Jalgaon</option>
    <option value="Pune">Pune</option>
    <option value="Mumbai">Mumbai</option>
    <option value="Ahmedabad">Ahmedabad</option>
  </select><br><br>
      
Hobby:
  <input type="radio"  name="Hobby" value="Cricket">Cricket
  
  <input type="radio" name="Hobby" value="60">Singing
 
  <input type="radio"  name="Hobby" value="100">Bike Ridding<br><br>
   <input type="submit" value="Login">


</form>
<%=error%> 

</body>
</html>