package com.hw1.model.vo;

public class Employee extends Person {

	private int salary;
	private String dept;
	
	public Employee() {
	}	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		// Person이라는 부모 생성자에 애초에 name이라는 인자가 없으므로
		// 자동으로 추가해주지 않는 것
		super(age, height, weight);
		this.name= name;
		// protected이기 때문에 직접 this.name을 쓰면 자식 객체에 접근이 가능
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String information() {
		return super.information()+ String.format( " 급여: %d / 부서: %s ",salary,dept); 
				//" 급여: "+this.salary+" 부서: "+this.dept;
	}
	
}
