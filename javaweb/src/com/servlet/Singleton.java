package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 单实例多线程 带来的请求覆盖 , servlet 缺陷 */
@WebServlet("/s")
public class Singleton extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String name = null;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		name = request.getParameter("name");
		
		System.out.println("name : " + name);
		
	}

}
