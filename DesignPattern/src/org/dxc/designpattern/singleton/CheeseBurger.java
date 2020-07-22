package org.dxc.designpattern.singleton;

public class CheeseBurger {
	private static CheeseBurger burger = new CheeseBurger();
	private CheeseBurger(){
		
		System.out.println("DEFAULT CONSTRUCTOR");
		
	}
	
	public static CheeseBurger getInstance() {
		
		return burger;
		
	}

}
