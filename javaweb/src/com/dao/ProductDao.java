package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.domain.Product;
import com.utils.PageBean;

import jdbc.config.JDBCUtils;

public class ProductDao {

	private JDBCUtils utils = new JDBCUtils();
	
	public static void main(String[] args) {
		System.out.println(new ProductDao().getProductByPage( 1 , 5 ));
	}
	
	public PageBean getProductByPage( int curr , int pageSize ) {  
		
		PageBean pageBean = new PageBean();
		
		pageBean.setPageSize(pageSize);
		pageBean.setCurr(curr);
		
		String sql_total_rows = "select count(pid) from product";
		
		ResultSet rs = utils.executeQuery(sql_total_rows, null);
			try {
				if(rs.next())
					pageBean.setTotalRows(rs.getInt(1));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		String sql_data = "select * from product limit ? ,?";
		Object[] params = { (curr-1 ) * pageSize  , pageSize };
		List<Product> products = (List<Product>)utils.findByType(sql_data, Product.class, params);
		
		pageBean.setData(products);
			
			
		return pageBean;
	}
	
	

	public void saveProduct(Product product) {

		String sql = "insert into product( pname , price , description , imgs ) values ( ? , ? , ? , ? )";
		Object[] params = { product.getPname(), product.getPrice(), product.getDescription(), product.getImgs() };

		int row = utils.executeUpdate(sql, params);

		System.out.println(row + " 件产品成功保存");

	}

	public List<Product> getProducts() {
		String sql = "select * from product";
		Object[] params = null;
		
		List<Product> products = (List<Product>)utils.findByType(sql, Product.class, params);
		
		return products;
	}
	


}
