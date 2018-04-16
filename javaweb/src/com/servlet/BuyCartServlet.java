package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ProductDao;
import com.domain.Product;
import com.utils.BuyCart;
import com.utils.Item;


@WebServlet("/buy")
public class BuyCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ProductDao dao = new ProductDao();
		
		int pid = Integer.parseInt(request.getParameter("pid"));
		
		
		Product product = dao.getProductById(pid);
		Item item = new Item( product , 1);
		
		
		BuyCart cart = null;
		
		if(session.getAttribute("cart")==null) {
			cart = new BuyCart();
			session.setAttribute("cart", cart);
		} else {
			cart = (BuyCart)session.getAttribute("cart");
		}
		
		//向购物车添加产品
		cart.addItem(item);
		
		request.getRequestDispatcher("page/cart.jsp").forward(request, response);
	}

}
