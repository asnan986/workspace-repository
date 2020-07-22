package org.dxc.designpattern.burger;

import java.util.Scanner;

public class HamburgerStore {
	
	private static void orderHamburger(){
		Scanner s = new Scanner(System.in);
		System.out.println("welcome to HamBergur store\n"+"we have your delicious tastes as below");
		System.out.println("enter 1 for Cheeseburger\n"+"enter 2 for VeggieBurger\n"+"enter 3 for MeatBurger");
		SimpleHamburgerFactory factory = new SimpleHamburgerFactory();
	   int check =s.nextInt();
	   while(check>3 || check<1)
	   {
		   System.out.println("ohh!! sorry you have entered the wrong input\n"+"Please enter the correct input");
		   check=s.nextInt();
		   
	   }
	   Hamburger item =factory.createHamburger(check);
	   
	    item.prepare();
		item.cook();
		System.out.println(item.box());
		System.out.println("------------------------------------------");
		 System.out.println("thankyou sir!! have a nice day");
	
	}

	public static void main(String[] args) {
		orderHamburger();
		
				
		// TODO Auto-generated method stub

	}

}
