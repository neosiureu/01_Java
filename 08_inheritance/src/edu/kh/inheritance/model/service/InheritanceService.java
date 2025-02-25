package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

public class InheritanceService   {
	// 상속 확인 예제
	
	public void ex1 () {
		Person p = new Person();
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("한국");
		
		System.out.println(p.getName());
		System.out.println(p.getNationality());
		System.out.println(p.getAge());

		
		Employee emp = new Employee();
		// 고유 클래스 멤버
		emp.setCompany("kh정보교육원");
		System.out.println(emp.getCompany());

		
		// 상속받은 클래스 멤버
		emp.setName("조미현");
		System.out.println(emp.getName());
		emp.setAge(20);
		System.out.println(emp.getAge());
		emp.setNationality("한국");
		System.out.println(emp.getNationality());

	
		
		
		
		//student만의 고유한 멤버
		/*
		 * Object 
		 * 		ㄴPerson
		 * 		ㄴ Student 
		 * */
		Student std = new Student();
		std.setGrade(3);
		std.setAge(15);
		std.setName("이주원");
		std.setNationality("한국");
		std.setClassRoom(5);
		System.out.println(std.getAge());
		System.out.println(	std.getClassRoom());
		System.out.println(	std.getName());
		System.out.println(std.getNationality());

	
		
		
		
		
		p.breath();
		p.move();
//		
		emp.breath();
		emp.move();
		
		std.breath();
		std.move();
		
		
	}
	public void ex2 () {
		// super생성자를 직접 이용해보자
		
		// Student 객체 생성
		Student std = new Student("홍길동", 17, "한국", 1, 3); // 기본생성자 X 매개변수 생성자를 하자
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		// 미션: employee객체를 생성할 때 부모님에게 상속받은 이름, 나이, 국적까지 전부 초기화하며
		// 고유의 회사까지 매개변수 생성자를 이용하여 만들자.
		
		Employee emp= new Employee("김노동",30,"한국","kh정보교육원");
		// 김노동 30 한국 kh정보교육원을 set하고 get하여 출력하자
		
		System.out.println(emp.getAge());
		System.out.println(emp.getName());
		System.out.println(emp.getNationality());
		System.out.println(emp.getCompany());

		

		
			
	}
	public void ex3 () {
		// System.out.println("오버라이딩 확인 예제");
		Student std = new Student();
		Employee emp = new Employee();
		std.move();
		emp.move();

		
	}
	
	public void ex4 () {
		
		Person p = new Person("김철수", 17, "한국");
		System.out.println(p.toString());
		System.out.println(p);
		
		Student std = new Student("강호동",18,"미국",2,6);
		System.out.println(std.toString());
		
		Employee emp = new Employee("김노동",36,"한국","kh정보교육원");
		System.out.println(emp.toString());
//		Employee emp2 = new Employee();
//		System.out.println(emp2.toString());


	}
	
	
	

}
