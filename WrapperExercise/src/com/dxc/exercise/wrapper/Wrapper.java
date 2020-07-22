package com.dxc.exercise.wrapper;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		  System.out.println("enter binary number: ");
		  String binary=s.nextLine();
		  System.out.println("enter octal number: ");
		  String octal=s.nextLine();
		  System.out.println("enter hexagonal number: ");
		  String hexagonal=s.nextLine();
		  int bin=Integer.parseInt(binary, 2); 
		  int oct=Integer.parseInt(octal,8);
		  int hex=Integer.parseInt(hexagonal,16);
		  System.out.println("The integer value of the binary number "+binary+" is "+bin);
		  System.out.println("The integer value of the octal number "+octal+" is "+oct);
		  System.out.println("The integer value of the hexagonal number "+hexagonal+" is "+hex);
	}

}
