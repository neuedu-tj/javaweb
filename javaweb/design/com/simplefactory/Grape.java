package com.simplefactory;

public class Grape implements Fruit {

	public void grow() {
		// TODO Auto-generated method stub
		System.out.println("Grape is growing .... ");
	}

	@Override
	public void harvest() {
		// TODO Auto-generated method stub
		System.out.println("Grape has been harvested. ");
	}

	@Override
	public void plant() {
		// TODO Auto-generated method stub
		System.out.println("Grape has been planted . ");
		
	}

}
