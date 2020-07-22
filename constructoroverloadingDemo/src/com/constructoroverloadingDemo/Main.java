package com.constructoroverloadingDemo;

import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);		
				
			System.out.println("enter id");
			long a= Long.parseLong(s.nextLine());
			System.out.println("enter product name");
			String b= s.nextLine();
			System.out.println("Is the product supplied by Nivas Suppliers? Type yes or no (not case sensitive)");
			String c=s.nextLine();
			int check= c.toLowerCase().compareTo("yes");
			if(check==0)
			{
				Product p= new Product(a,b);
				p.display();
			}
			else {
				
			System.out.println("enter supplier name");
			String d =s.nextLine();
			Product p=new Product(a,b,d);
			p.display();
			
			}

		}
		
		
		}

	


