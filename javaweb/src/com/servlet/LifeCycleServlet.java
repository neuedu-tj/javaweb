package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns={"/lifeCycle"} , loadOnStartup = 1)
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    
    public LifeCycleServlet() {
        super();
        System.out.println("¹¹Ôìº¯Êý------");
    }
    
    @Override
    public void init() throws ServletException {
    	System.out.println("init~~~~");
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}

	

}
