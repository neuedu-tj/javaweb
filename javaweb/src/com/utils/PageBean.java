package com.utils;

import java.util.List;

import lombok.Data;


public class PageBean {
	
	private List<?> data;
	private int totalRows;  //总记录数
	private int pageSize = 5;   // 每页显示多少条记录
	private int totalPage ;
	
	private int curr;

	
	public int getCurr() {
		return curr;
	}
	public void setCurr(int curr) {
		this.curr = curr;
	}
	public List<?> getData() {
		return data;
	}
	public void setData(List<?> data) {
		this.data = data;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		if(totalRows%pageSize==0) return totalRows/pageSize;	
		else return totalRows/pageSize + 1;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	@Override
	public String toString() {
		return "PageBean [data=" + data + ", totalRows=" + totalRows + ", pageSize=" + pageSize + ", totalPage="
				+ getTotalPage() + "]";
	}
	
	

}
