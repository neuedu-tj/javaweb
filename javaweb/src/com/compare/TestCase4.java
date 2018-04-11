package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCase4 {

	public static void main(String[] args) {
		
		Stu e1 = new Stu(1, "tom" , 900);
		Stu e2 = new Stu(2, "jack" , 1900);
		Stu e3 = new Stu(3, "jetty" , 500);
		Stu e4 = new Stu(4, "tomcat" , 2100);
		
		List<Stu> list = new ArrayList<Stu>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list , new StuComparator());

		System.out.println(list);

	}

}
