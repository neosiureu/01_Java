package com.hw1.model.vo;

public class Student extends Person {
	int grade;
	String major;
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight); // 메서드 맨 앞에 super가 와야 함
		// 다만 클래스 맨 앞에 생성자가 와야하는 건 아님
		this.name = name;
		this.grade = grade;
		this.major = major;
		// name은 부모 값에 직접 접근해서 초기화 해야 함

		
		
	}
	@Override
	public String information() {
		return super.information() + String.format("/학년: %d, /전공: %s ",grade,major) ;  
				
				//+" 학년: "+ this.grade +" 전공: "+ this.major ;
	}
	
	
	
	

}
