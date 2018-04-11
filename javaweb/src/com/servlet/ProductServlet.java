package com.servlet;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.FileUtils;

import com.dao.ProductDao;
import com.domain.Product;


@WebServlet("/product")
@MultipartConfig
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String method = request.getParameter("method");
		if("saveProduct".equalsIgnoreCase(method)) {
			saveProduct(request ,response);
		} else if("getProduct".equalsIgnoreCase(method)) {
			getProduct(request , response);
		} else {
			getProduct(request , response);
		}
		
		
	}
	
	//获取所有产品
	protected void getProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao dao = new ProductDao();
		List<Product> products = dao.getProducts();
		
		request.setAttribute("products", products); //Map
		
		System.out.println(products);
		
		request.getRequestDispatcher("page/products.jsp").forward(request, response);
		
	}
	
	//添加产品
	protected void saveProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("----------------------------");
		
		String pname = request.getParameter("pname");
		String price = request.getParameter("price");
		String desc = request.getParameter("desc");
		
//		Part imgs = request.getPart("imgs");//获取单个文件
		ProductDao dao = new ProductDao();
		
		StringBuilder sbd = new StringBuilder();
		
		Collection<Part> parts = request.getParts();
		for (Part part : parts) {
			if("imgs".equalsIgnoreCase(part.getName())) {
				String realative_url = "/javaweb/imgs/"+part.getSubmittedFileName();
				
				sbd.append(realative_url).append(",");
				
				String abs_url = request.getRealPath("imgs") + "/"+ part.getSubmittedFileName();
				FileUtils.copyToFile(part.getInputStream(), new File(abs_url));
			}
		}
		
		String last_realative_url = sbd.deleteCharAt(sbd.lastIndexOf(",")).toString();
		
		Product product = new Product( pname , new BigDecimal(price) , desc , last_realative_url );
		dao.saveProduct(product);

		getProduct(request , response);
	}

}
