package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName= request.getParameter("FirstName");
		String lastName = request.getParameter("LastName");
		String gender = request.getParameter("Gender");
		String email= request.getParameter("Email");
		String password= request.getParameter("Password");
		String cnfmPassword= request.getParameter("ComfirmPassword");
		String city = request.getParameter("city");
		String hobby = request.getParameter("Hobby");
		
		
		
		System.out.println("FirstName "+firstName);
		System.out.println("LastName "+lastName);
		System.out.println("Gender "+gender);
		System.out.println("Email "+email);
		System.out.println("Password "+password);
		System.out.println("ComfirmPassword "+cnfmPassword);
		System.out.println("City "+city);
		System.out.println("Hobby "+hobby);
		
		
		
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
		
		if(lastName == null || lastName.trim().length()==0) {
			isError = true;
			error.append("<br>Please Enter LastName");
		}else if(lastName.trim().length()<=2) {
			isError= true;
			error.append("<br>Please Enter atleast 3 characters in LastName");
		}else {
			String alpha = "[a-zA-Z]+";
			if (lastName.matches(alpha) == false) {
				isError = true;
				error.append("<br>Please Enter Valid LastName");
			}
	}
		
		if(gender == null || gender.trim().length()==0) {
			isError= true;
			error.append("<br>Please Enter  Gender");
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

		else {
			String alpha = "^(?=.*[a-z])(?=.*[A-Z])(?=.*?[0-9])(?=.*?[!#%])[A-Za-z0-9!#%]{8,32}$";
			if (email.matches(alpha) == false) {
				isError = true;
				error.append("<br>Please Enter Valid Password");
			}
		
		}
		
		if(cnfmPassword == null || cnfmPassword.trim().length()==0) {
			isError= true;
			error.append("<br>Please Enter  ComfirmPassword");
		}
		
		if(city.equals("--")) {
			isError= true;
			error.append("<br>Please Enter  City");
		}
		
		if(hobby == null ) {
			isError= true;
			error.append("<br>Please Enter  Hobby");
		}
		
		RequestDispatcher rd = null;
		if (isError) {
			// Regi.jsp
			request.setAttribute("error", error.toString()); 
			rd = request.getRequestDispatcher("Registration.jsp");
		} else {
			// Login.jsp
			rd = request.getRequestDispatcher("Login.jsp");
		}

		rd.forward(request, response);
}}
