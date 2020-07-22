package com.employee;

import java.util.Scanner;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

public class Main {

		public static void main(String[] args) {
			
			EmployeeService service=new EmployeeService();
			Employee emp=new Employee();
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number of employee to register");
				
			int noOfEmp=Integer.parseInt(s.nextLine());
			boolean result=service.register(emp,s,noOfEmp);
				if(result) {
					service.display();
					System.out.println("Employee registered successfully");
				}
				else
					System.out.println("Employee is not registered");
				

	}

}
