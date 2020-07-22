package com.dxc.lampdaTest;

public class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		  return p.check(num);


}
	PerformOperation op1=(num)->{
		if(num%2==0)
			return false;
		else
			return true;
		
	};
	
	PerformOperation op2=(num)->{
		int i;
		boolean j= false;
		for(i=1;i<num;i++) {
			if(num%i==0)
				j=true;
			
			
		}
		return j;
		
		
	};
	PerformOperation op3=(num)->{
		int num1=num;
		int reversed = 0;
		
		 while(num1 != 0) {
	            int digit = num1 % 10;
	            reversed = reversed * 10 + digit;
	            num1 /= 10;
	        }
			
			
		if(num==reversed)
		return true;
		else
		return false;
		
		
	};
	
	
	
	public PerformOperation isOdd() {
		
		return op1;
		
	    
	}
	public PerformOperation isPrime() {
		return op2;
		
	    
	}
	public PerformOperation isPalindrome() {
		return op3;
		
	    
	}
	
	
}
