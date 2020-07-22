package org.dxc.designpattern.factorypattern;

public class Van implements Vehicle
{
	@Override
	public void drive() {
		System.out.println("iam driving my van");
	}
	@Override
	public int speed() {
		System.out.println("my driving speed id");
		return 100;
	}
}
