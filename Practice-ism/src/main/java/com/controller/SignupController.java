package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupController")
public class SignupController extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("SignupController");
		
		String firstName = request.getParameter("firstname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		System.out.println("firstName : "+ firstName);
		System.out.println("email : "+ email);
		System.out.println("password : "+ password);
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		
		boolean isError = false;
		StringBuffer error = new StringBuffer("");
		if(firstName == null || firstName.trim().length() == 0) {
			isError = true;
			error.append("<br>Please Enter FirstName");
			
		}else if(firstName.trim().length() <= 2) {
			isError = true;
			error.append("<br>Please Enter atleast 3 character in FirstName");
		}
		else {
			String alpha = "[a-zA-Z]+";
			if(firstName.matches(alpha) == false) {
				isError = true;
				error.append("<br>Please Enter Valid FirstName");
			}
		}
		if(email == null || email.trim().length() == 0) {
			isError = true;
			error.append("<br>Please Enter Email");
			
		}
		if(isError == true) {
			out.print("<span style='color:red'>" + error + "</span>");
		}
		else {
			out.print("FirstName : "+ firstName + "<br>");
			out.print("Email : "+ email + "<br>");
			out.print("Password : "+ password + "<br>");
		}
		out.print("</body></html>");
	}
}