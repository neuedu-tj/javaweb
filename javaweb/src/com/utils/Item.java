package com.utils;

import com.domain.Product;

public class Item {
	
	private Product product;
	private int count;
	
	
	public Item() {
		super();
	}


	public Item(Product product, int count) {
		super();
		this.product = product;
		this.count = count;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	@Override
	public String toString() {
		return "Item [product=" + product + ", count=" + count + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		Item i1 = this;
		Item i2 = (Item) obj;
		
		if(i1.getProduct().getPid() == i2.getProduct().getPid()) return true;
		else return false;
	}
	
	
	

}
