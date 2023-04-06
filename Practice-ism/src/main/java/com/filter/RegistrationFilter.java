package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.util.Validations;

public class RegistrationFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
			
		System.out.println("RegistartionFilter::doFilter()");
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		boolean isError = false;
		
		if(Validations.isEmpty(firstName)) {
			isError = true;
			request.setAttribute("firstName", "Please Enter FirstName");
		}
		if(isError) {
			request.getRequestDispatcher("Registration.jsp").forward(request, response); 
		}else {
			chain.doFilter(request, response);
		}
		
	}
public void init(FilterConfig filterConfig) throws ServletException {
	System.out.println("RegistartionFilter::init()");
}
public void destroy() {
	System.out.println("RegistartionFilter::destroy()");
}
}
