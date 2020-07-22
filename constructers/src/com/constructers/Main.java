package com.constructers;

import java.util.Scanner;
public class Main {public static void main(String[] args){
	Scanner s=new Scanner(System.in);		
	System.out.println("enter id");
	long a= Long.parseLong(s.nextLine());
	System.out.println("enter product name");
	String b= s.nextLine();
	System.out.println("enter supplier name");
	String c =s.nextLine();
	Product p=new Product(a,b,c);
	p.display();
	
	}

}
