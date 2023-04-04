package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SinghupController extends HttpServlet  {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Singhup");
		String firstName= request.getParameter("firstName");
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		
		System.out.println("FirstName "+firstName);
		System.out.println("Email "+email);
		System.out.println("password "+password);
		
		response.setContentType("text/html");
		
	PrintWriter out=response.getWriter();
	out.print("<html><body>");
	
	boolean isError= false;
	StringBuffer error = new StringBuffer("");
	if(firstName == null || firstName.trim().length()==0) {
		isError = true;
		error.append("<br>Please Enter FirstName");
	}else if(firstName.trim().length()<=2) {
		isError= true;
		error.append("<br>Please Enter atleast 3 characters in FirstName");
	}else {
		String alpha = "[a-zA-Z]+";
		if (firstName.matches(alpha) == false) {
			isError = true;
			error.append("<br>Please Enter Valid FirstName");
		}
	}
	if(email == null || email.trim().length()==0) {
		isError= true;
		error.append("<br>Please Enter  Email");
	}else {
		String alpha = "^(.+)@(\\S+)$";
		if (email.matches(alpha) == false) {
			isError = true;
			error.append("<br>Please Enter Valid Email");
		}
	
	}
	if(password == null || password.trim().length()==0) {
		isError= true;
		error.append("<br>Please Enter  Password");
	}
	if(isError=true) {
		out.print("<span style='color:red;'>" + error + "</span>");
	}else {
		out.print("FirstName =>" +firstName+ "<br>");
		out.print("Email =>" +email+ "<br>");
		out.print("Password =>" +password+ "<br>");
	}
	
	
	
	//out.print("firstName"+ firstName);
	
	out.print("</body><html>");
	
	}
	
}
