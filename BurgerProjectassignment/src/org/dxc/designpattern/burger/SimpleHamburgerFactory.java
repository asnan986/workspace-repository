package org.dxc.designpattern.burger;

public class SimpleHamburgerFactory {
	
	public Hamburger createHamburger(int i) {
		
		switch (i) {
		case 1:
			return new CheeseBurger();
	
		case 2:
			return new VeggieBurger();
			
		case 3:
			return new MeatLoverBurger();
			
		default:
			return null;
			
		}

}
}
