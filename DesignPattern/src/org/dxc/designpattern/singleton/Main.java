package org.dxc.designpattern.singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		CheeseBurger burger1= CheeseBurger.getInstance();
		CheeseBurger burger2= CheeseBurger.getInstance();
		
		
		System.out.println(burger1.hashCode());
		System.out.println(burger2.hashCode());
		
		
	}

}
