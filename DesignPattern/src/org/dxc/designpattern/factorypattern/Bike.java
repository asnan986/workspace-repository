package org.dxc.designpattern.factorypattern;

public class Bike implements Vehicle {
	@Override
	public void drive() {
		System.out.println("iam driving my bike");
	}
	@Override
	public int speed() {
		System.out.println("my driving speed id");
		return 60;
	}

	
}
