package org.dxc.designpattern.burger;

import java.util.Random;

public class MeatLoverBurger extends Hamburger {

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("your favorite MeatBurger is preparing");
		System.out.println("------------------------------------------");
		
	}

	@Override
	void cook() {
		// TODO Auto-generated method stub
		System.out.println("your food is cooked");
		System.out.println("------------------------------------------");
		
	}

	@Override
	int box() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		System.out.println("your order is readyfor pickup\n"+"your box number is generated below");
		System.out.println("------------------------------------------");
		return rand.nextInt(1000000);
	}

}
