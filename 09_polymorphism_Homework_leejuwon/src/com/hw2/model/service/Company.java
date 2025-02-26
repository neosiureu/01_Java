package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {
	int employeeCount;
	Employee [] employees;
	public Company(int size) {
	employees = new Employee[size];
	employeeCount =0;
	}
	
	
	
	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	@Override
	public void addPerson(Person person) {
		int temp=-1;
		if(person instanceof Employee) {
			for(int i=0; i<employees.length;i++) {
				if(employees[i]==null) {
					temp =i;
					break;
				}
			}
			
			if(temp==-1) {
				System.out.println("인원이 모두 충원되어 더 이상 직원의 자리가 없습니다");
			}
			else {
				employees[temp] = (Employee) person;
				System.out.println("직원이 추가되었습니다- 아이디: "+ employees[temp].getName() + " / 사번 : " + employees[temp].getId());
				employeeCount++;
			}
			
			
		}
		
		else {System.out.println("Person에 적합한 인스턴스가 아닙니다.");
		}
		
		
	}
	@Override
	public void removePerson(String id) {
		int temp=-1;
		// TODO Auto-generated method stub
		if(employeeCount>0 ) {
			for (int i=0; i<employees.length; i++) {
				if(employees[i]!=null &&employees[i].getId().equals(id) ) {
					temp=i;
					System.out.println(employees[i].getName()+"라는 이름의 직원이 삭제되었습니다");
					//employees[i].setId(null); // 이게 약간 애매한데 id라는 스트링을 없애는 셈이므로 null이맞지않나?
					//employeeCount--는 제일 마지막으로 바꿔
					break;
				}
			}
			
			if (temp!=-1) {
				for(int i=temp; i<employees.length-1; i++) {
					employees[i] = employees[i+1];
					
				}
				employees[employees.length-1] = null; // 맨 끝에 있는 것을 널로 만들고
				employeeCount--; 
				
				
			}
		}
		// 삭제할 때 번호가 null이 될 것이므로 하나씩 당겨줘야 함
		
		
		else {
			System.out.println("해당 아이디를 가진 직원을 확인할 수 없습니다. 다시 체크해주세요");
		}
		
	}
	@Override
	public void displayAllPerson() {
		// TODO Auto-generated method stub
		System.out.println("전체 직원 명단 :");

		for(int i=0; i<employees.length; i++) {
			if(employees[i]==null) {continue;}
			System.out.println(employees[i].getInfo());	
		}
		
	}
	
	
	

}
