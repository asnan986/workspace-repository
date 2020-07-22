package com.employee.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.employee.model.Employee;

public class EmployeeService {
	private ArrayList<Employee> emplist=new ArrayList<Employee>();


    public boolean register(Employee emp, Scanner s,int noOfEmp) {
	
    	boolean result=false;
	
    	for(int i=0;i<noOfEmp;i++) {
	
    		System.out.println("Enter the emp id ");
	
    		emp.setEmpId(Integer.parseInt(s.nextLine()));
	
    		System.out.println("Enter the emp name");
	
    		emp.setEmpName(s.nextLine());
	
    		System.out.println("Enter the emp salary");
	
    		emp.setEmpSalary(Double.parseDouble(s.nextLine()));
	
    		emplist.add(emp);
	
	
    	}
	if(emplist.size()!=0) {
		System.out.println("Number of employee is "+emplist.size());
		result=true;
	}
	return result;
}

public void display() {
	for(Employee e : emplist) {
		System.out.println(e);
	}

}


}
