package com.compare;

public class Emp implements Comparable<Emp> {

	private int id;
	private String name;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Emp o) {
		Emp e1 = this;
		Emp e2 = o;
		
		if(e1.getSalary() > e2.getSalary() ) return -1;
		else if(e1.getSalary() < e2.getSalary() ) return 1;
		else return 0;
	}

}
