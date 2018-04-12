package com.abstractfactory;

public class MercedesFactoryCN implements MercedesFactory{

	@Override
	public BenzA createBenzA() {
		System.out.println("开始生产 国产 A 级轿车 .");
		return new BenzACN();
	}

	@Override
	public BenzB createBenzB() {
		System.out.println("开始生产 国产 B级交车 .");
		return new BenzBCn();
	}

}