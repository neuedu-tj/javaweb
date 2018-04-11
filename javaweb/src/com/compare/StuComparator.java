package com.compare;

import java.util.Comparator;

public class StuComparator implements Comparator<Stu>{

	@Override
	public int compare(Stu e1, Stu e2) {

		if(e1.getSalary() > e2.getSalary() ) return -1;
		else if(e1.getSalary() < e2.getSalary() ) return 1;
		else return 0;
	}


}
