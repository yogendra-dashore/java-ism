package com.Calcy.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)  {
		String str=request.getParameter("operation");
		
		int number1= Integer.parseInt(request.getParameter("number1"));
		int number2= Integer.parseInt(request.getParameter("number2"));
		
		int a = number1+number2;
		int s = number1-number2;
		int m = number1*number2;
		int d = number1/number2;
		
		if(str.equals("add")) {
			System.out.println("number1 :"+number1);
			System.out.println("number2 :"+number2);
			System.out.println("Ans :"+a);
		}
		else if(str.equals("sub")){
			System.out.println("number1 :"+number1);
			System.out.println("number2 :"+number2);
			System.out.println("Ans :"+s);
			
		}
		else if(str.equals("multi")){
			System.out.println("number1 :"+number1);
			System.out.println("number2 :"+number2);
			System.out.println("Ans :"+m);
	}
		else if(str.equals("div")){
			System.out.println("number1 :"+number1);
			System.out.println("number2 :"+number2);
			System.out.println("Ans :"+d);
		}
		}
}
