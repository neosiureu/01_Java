package edu.kh.inheritance.model.dto;

import edu.kh.inheritance.model.dto.Employee.in1;


// The type GrandChild cannot subclass the final class Employee
public class GrandChild extends Employee implements in1
{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
	}
	
//	public void onlyEmployee() {
//		//Cannot override the final method from Employee
//	}

	
}
