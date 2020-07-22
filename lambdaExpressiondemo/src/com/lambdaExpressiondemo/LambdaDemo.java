package com.lambdaExpressiondemo;

public class LambdaDemo {

	public void driving (Vehicle vehicle) {
		vehicle.drive();
		
	}

	public static void main(String[] args) {
			
			 LambdaDemo lamdaExpressionDemo=new LambdaDemo();
		     Vehicle vehicle=()->System.out.println("this is my car");
		     Vehicle vehicle2=()->System.out.println("this is my bus");
			 lamdaExpressionDemo.driving(vehicle);
			 lamdaExpressionDemo.driving(vehicle2);
			    
			
			
		
	Vehicle vehicledemo=new Vehicle() {
		@Override
		public void drive() {
			// TODO Auto-generated method stub
			System.out.println("this is a anonymous class");
			
		}
	};
	lamdaExpressionDemo.driving(vehicledemo);
	
}
}

