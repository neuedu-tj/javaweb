package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCase3 {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(1, "tom" , 900);
		Emp e2 = new Emp(2, "jack" , 1900);
		Emp e3 = new Emp(3, "jetty" , 500);
		Emp e4 = new Emp(4, "tomcat" , 2100);
		
		List<Emp> list = new ArrayList<Emp>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list);
		
		
		System.out.println(list);

	}

}
