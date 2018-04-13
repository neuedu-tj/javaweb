package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		
		HttpSession session = request.getSession();
		
		if("tom".equalsIgnoreCase(name) && "123".equalsIgnoreCase(pwd)) {
			session.setAttribute("isLogin", "ok");
		} 
		
		request.getRequestDispatcher("page/index.html").forward(request, response);
	}

}
