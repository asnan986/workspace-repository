package org.dxc.designpattern.factorypattern;

public class VehicleFactory {
	
	
	public Vehicle getInstance(String name) {
		if (name.equals("four"))
			return new Car();
	   else if(name.equals("two"))
		   return new Bike();
	   else if(name.equals("six"))
		   return new Van();
		return null;
	  
		
	}

}
