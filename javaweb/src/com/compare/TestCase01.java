package com.compare;

import java.util.Set;
import java.util.TreeSet;

public class TestCase01 {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>();
		set.add("IV");
		set.add("II");
		set.add("V");
		set.add("VI");
		set.add("III");
		
		System.out.println(set);

	}

}
