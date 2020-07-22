package com.dxc.lampdaexpression;

import java.util.*;
import java.util.function.Predicate;

public class Personwithlambdaexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> listOfPerson=Arrays.asList(
				new Person("Deepa","Ravi"),
				new Person("Meena","Kumar"),
				new Person("Priya","Arun"),
				new Person("Lynet","Athi"),
				new Person("Banu","Priya")
				);
		Collections.sort(listOfPerson,(person1,person2)->person1.getLastName().compareTo(person2.getLastName()));
		System.out.println("--------------------------------");
		printLastNameWithCondition(listOfPerson,person->person.getLastName().startsWith("A"));
		System.out.println("--------------------------------");
	}
	private static void printLastNameWithCondition(List<Person> listOfPerson ,Predicate<Person> predicate) {
		for(Person p:listOfPerson) {
			if(predicate.test(p))
			System.out.println(p.getLastName());
		}
		
	}


}
