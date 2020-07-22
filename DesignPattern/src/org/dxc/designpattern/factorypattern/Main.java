package org.dxc.designpattern.factorypattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleFactory factory= new VehicleFactory();
		
		
		Vehicle v1=factory.getInstance("four");
		v1.drive();
		System.out.println(v1.speed());
		Vehicle v2=factory.getInstance("two");
		v2.drive();
		System.out.println(v2.speed());
		
		Vehicle v3=factory.getInstance("six");
		v3.drive();
		System.out.println(v3.speed());
		
		

	}

}
