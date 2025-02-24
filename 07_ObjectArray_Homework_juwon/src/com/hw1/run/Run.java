package com.hw1.run;

import java.util.Arrays;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee[] em = new Employee[3];
		em[0] = new Employee(0, null, null, null, 0, ' ', 0, 0.0, null, null);
		em[1] = new Employee(1, "홍길동", null, null, 19, 'M', 0, 0.0, "01022223333", "서울 잠실");
		em[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01022223333", "서울 마곡");
		
	
		for(int i=0; i<em.length;i++) {
			System.out.println(em[i].toString());
		}

		
		System.out.println("========================");
		em[0] = new Employee(0,"김말똥","영업부","팀장",19,'M',3000000,0.2,"01055559999","전라도 광주");
		em[1].setDept("기획부");	
		em[1].setJob("부장");
		em[1].setSalary(4000000);
		em[1].setBonusPoint(0.3);
		em[1].setAge(30);
			System.out.println(em[0].toString());
			System.out.println(em[1].toString());


		
		
		

		System.out.println("========================");

		for(int i=0; i<em.length;i++) {
		System.out.println
		(em[i].getEmpName()+"의 연봉 : "+ (int) ((em[i].getSalary()+ (em[i].getSalary()*em[i].getBonusPoint()) 
				)*12)
				);

		}
		System.out.println("========================");


		int result =0;
		
		for(int i=0; i<em.length; i++) {
			result += ((em[i].getSalary()+ (em[i].getSalary()*em[i].getBonusPoint()) 
					)*12);
		}

		System.out.println("직원들 연봉의 평균 " + result/3 + "원");

		
			
		}
		

		

		
	}

