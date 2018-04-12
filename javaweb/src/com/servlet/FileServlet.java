package com.servlet;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.FileUtils;

import com.dao.ProductDao;


@WebServlet("/file")
@MultipartConfig
public class FileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ProductDao productdao = new ProductDao();
	
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		productdao.getProducts();
		
		Collection<Part> parts = request.getParts();

		for (Part part : parts) {
			if(part.getName().equalsIgnoreCase("files")) {
				String abs_url = request.getRealPath("files")+"/"+part.getSubmittedFileName();
				FileUtils.copyInputStreamToFile(part.getInputStream(), new File(abs_url));
			}
		
		}
		
		
		
	}
	

}
