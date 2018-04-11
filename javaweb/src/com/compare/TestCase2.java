package com.compare;

import java.util.Set;
import java.util.TreeSet;

public class TestCase2 {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(1, "tom" , 900);
		Emp e2 = new Emp(2, "jack" , 1900);
		Emp e3 = new Emp(3, "jetty" , 500);
		Emp e4 = new Emp(4, "tomcat" , 2100);
		
		Set<Emp> set = new TreeSet<Emp>();
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		
		System.out.println(set);

	}

}
