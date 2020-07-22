package org.dxc.designpattern.factorypattern;

public class Car implements Vehicle{
	@Override
	public void drive() {
		System.out.println("iam driving my car");
	}
	@Override
	public int speed() {
		System.out.println("my driving speed id");
		return 90;
	}

}
