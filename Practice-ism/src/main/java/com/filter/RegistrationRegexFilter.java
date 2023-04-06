package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.util.Validations;

public class RegistrationRegexFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("RegistrationRegexFilter::doFilter()");
		String firstName = request.getParameter("firstName");
		
		boolean isError = false;
		
		if(Validations.isAlpha(firstName) == false) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter Valid FirstName");
			
		}
		if(isError) {
			request.getRequestDispatcher("Registration.jsp").forward(request, response);
		}
		else {
			chain.doFilter(request, response);
		}
		
	}
public void destroy() {
System.out.println("RegistrationRegexFilter::destroy()");
	
}
public void init(FilterConfig filterConfig) throws ServletException {
	System.out.println("RegistrationRegexFilter::init()");
}
}
