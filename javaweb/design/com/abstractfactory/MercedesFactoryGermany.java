package com.abstractfactory;

public class MercedesFactoryGermany implements MercedesFactory{
	
	@Override
	public BenzA createBenzA() {
		System.out.println("开始生产 进口 A 级轿车");
		return new BenzAGermany();
	}

	@Override
	public BenzB createBenzB() {
		System.out.println("开始生产 进口 B 级轿车 ");
		return new BenzBGermany();
	}
	
}
