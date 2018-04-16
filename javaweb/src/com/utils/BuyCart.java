package com.utils;

import java.util.ArrayList;
import java.util.List;

public class BuyCart {
	
	private List<Item> items = new ArrayList<Item>();
	
	public List<Item> getItems() {
		return items;
	}




	public void addItem( Item item ) {
	
		if(items.contains(item)) {  // contains 方法底层会调用 比较者自己的 equals 方法 . 
			for (Item i : items) {
				if(i.equals(item)) {
					i.setCount(i.getCount()+item.getCount());
				}
			}
		} else {
			items.add(item);
		}
		
	}
	
	

}
