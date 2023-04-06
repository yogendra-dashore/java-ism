package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

@WebServlet("/EditUserController")
public class EditUserController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		Integer userId = Integer.parseInt(request.getParameter("userId"));
		UserDao userDao = new UserDao();
		
		UserBean user = userDao.getUserById(userId);
		request.setAttribute("users", user);
		request.getRequestDispatcher("EditUser.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		//String email = request.getParameter("email");
		Integer userId =Integer.valueOf(request.getParameter("userId"));
		
		UserBean userBean = new UserBean();
		
		userBean.setFirstName(firstName);
		//userBean.setEmail(email);
		userBean.setUserId(userId);
		
		new UserDao().updateUser(userBean);
		response.sendRedirect("ListUsersController");
	}
}
