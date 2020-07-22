package com.dxc.model;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
         student.setRollNO(12);
         student.setName("asnan");
         student.setMark1(100);
         student.setMark2(100);
         student.setMark3(100);
         StudentService studentservice=new StudentService();
         Result result =studentservice.calculateResult(student);
         System.out.println("condition " +  result.getCondition()+ " grade is "+result.getGrade());
         System.out.println(studentservice.calculateResult(student).getCondition());
	}

}
