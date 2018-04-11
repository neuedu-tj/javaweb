package com.dao;

import java.util.List;

import com.domain.Product;

import jdbc.config.JDBCUtils;

public class ProductDao {

	private JDBCUtils utils = new JDBCUtils();

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
	
//	public static void main(String[] args) {
//		System.out.println(new ProductDao().getProducts());
//	}

}
