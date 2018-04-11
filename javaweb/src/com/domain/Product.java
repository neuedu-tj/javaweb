package com.domain;

import java.math.BigDecimal;

public class Product {
	
	private int pid;
	private String pname;
	private BigDecimal price;
	private String description;
	private String imgs;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgs() {
		return imgs;
	}
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String pname, BigDecimal price, String description, String imgs) {
		super();
		this.pname = pname;
		this.price = price;
		this.description = description;
		this.imgs = imgs;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", description=" + description
				+ ", imgs=" + imgs + "]";
	}
	
	
	

}
