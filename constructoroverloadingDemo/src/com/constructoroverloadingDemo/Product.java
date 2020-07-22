package com.constructoroverloadingDemo;


public class Product {
	private long id;
	private String productName;
	private String supplierName;
	Product(){
		
	}
	
Product(long id,String productName)

	
	{
		this.id = id;
		this.productName = productName;
		this.supplierName = "Nivas";
		
	}
	
	Product(long id,String productName,String supplierName)
	
	{
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
		
	}
	
	void display()
	{
		System.out.println("Product Id is "+id);
		System.out.println("Product Name is " +productName);
		System.out.println("Supplier Name is "+supplierName);	
	}


	}


