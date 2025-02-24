package com.hw1.run;



import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
	
				
		Employee[] em = new Employee[3];
		em[0] = new Employee(); // 1번 constructor로 초기화
		em[1] = new Employee(1, "홍길동",19, 'M',"01022223333","서울 잠실"); // 2번 constructor로 초기화
		em[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01022223333", "서울 마곡");
		
	
		for(int i=0; i<em.length;i++) {
			System.out.println(em[i]);
		}

		
		System.out.println("========================");
		
		em[0].setEmpNo(0);
		em[0].setEmpName("김말똥");
		em[0].setDept("영업부");
		em[0].setJob("팀장");
		em[0].setAge(30);
		em[0].setGender('M');
		em[0].setSalary(3000000);
		em[0].setBonusPoint(0.2);
		em[0].setPhone("01055559999");
		em[0].setBonusPoint(0.3);
		

		
		em[1].setDept("기획부");	
		em[1].setJob("부장");
		em[1].setSalary(4000000);
		em[1].setBonusPoint(0.3);
		em[1].setAge(30);
		System.out.println(em[0]);
		System.out.println(em[1]);


		
		
		

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

