package com.dxc.lampdaexpression;

import java.util.*;

public class PersonWithoutLambdaExpression {

	public static void main(String[] args) {
		List<Person> listOfPerson=Arrays.asList(
				new Person("Deepa","Ajay"),
				new Person("Meena","Kumar"),
				new Person("Priya","Arun"),
				new Person("Lynet","Athi"),
				new Person("Banu","Priya")
				);
		
		//1. sort list by last name
		
	//	Collections.sort(listOfPerson,new LastNameComparator());
		
		Collections.sort(listOfPerson, new Comparator<Person>() {

			@Override
			public int compare(Person person1, Person person2) {
				// TODO Auto-generated method stub
				return person1.getLastName().compareTo(person2.getLastName());
			}
			
		});
		
		System.out.println("--------------------------------");	
			//2. create a method to print all elements in the list
		printAll(listOfPerson);
		
		System.out.println("--------------------------------");
		//3.Create a method prints all the people that have last name beginning with A
		printLastNameWithA(listOfPerson);
		
		System.out.println("--------------------------------");
		

	}

	private static void printLastNameWithA(List<Person> listOfPerson) {
		for(Person p:listOfPerson) {
			if(p.getLastName().startsWith("A"))
			System.out.println(p.getLastName());
		}
		
	}

	private static void printAll(List<Person> listOfPerson) {
		// For Each synatx
		/*for(clasname reference: containter object) {
			
		}*/
		
		for(Person p:listOfPerson) {
			System.out.println(p.getLastName());
		}
		
	}


	



	

}

