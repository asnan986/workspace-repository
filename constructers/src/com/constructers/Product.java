package com.constructers;


public class Product {
	private long id;
	private String productName;
	private String supplierName;
	Product(){
		
	}
	Product(long id,String productName,String supplierName)
	
	{
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
		
	}
	
	void display()
	{
		System.out.println("product id is "+id);
		System.out.println("product name is " +productName);
		System.out.println("suppliername is "+supplierName);	
	}


	}


