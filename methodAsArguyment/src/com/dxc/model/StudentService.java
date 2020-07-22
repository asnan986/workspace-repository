package com.dxc.model;

public class StudentService {
	public Result calculateResult(Student student)
	{
		
		
		if(student.getMark1()+student.getMark2()+student.getMark3()>200)
		{
			Result result =new Result("A","PASS");
			return result;
		}
		else
		{
			Result result =new Result("F","FAIL");
			return result;
		}
		
		
		
	}
	

}
