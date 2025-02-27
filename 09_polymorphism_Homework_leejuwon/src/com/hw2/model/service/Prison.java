package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem {

	int prisonerCount;
	Prisoner [] prisoners;
	
	public Prison(int size) {
	prisoners = new Prisoner[size];
	prisonerCount =0;
	}
	
	@Override
	public void addPerson(Person person) {
		int temp=-1;
		if(person instanceof Prisoner) {
			for(int i=0; i<prisoners.length;i++) {
				if(prisoners[i]==null) {
					temp =i;
					break;
				}
			}
			
			if(temp==-1) {
				System.out.println("인원이 모두 충원되어 더 이상 수감할 자리가 없습니다");
			}
			else {
				prisoners[temp] = (Prisoner) person;
				System.out.println("수감자가 추가되었습니다- 아이디: "+ prisoners[temp].getName() + " / 수감번호 : " + prisoners[temp].getId() + " / 죄목: " +  prisoners[temp].getCrime());
				prisonerCount++;
			}
			
			
		}
		
		else {System.out.println("Person에 적합한 인스턴스가 아닙니다.");
		}
		
		
	}

	public void removePerson(String id) {
		int temp=-1;
		// TODO Auto-generated method stub
		if(prisonerCount >0 ) {
			for (int i=0; i<prisoners.length; i++) {
				if(prisoners[i]!=null &&prisoners[i].getId().equals(id) ) {
					temp=i;
					System.out.println(prisoners[i].getName()+"라는 이름의 죄수가 탈옥했습니다");
					//employees[i].setId(null); // 이게 약간 애매한데 id라는 스트링을 없애는 셈이므로 null이맞지않나?
					//employeeCount--는 제일 마지막으로 바꿔
					break;
				}
			}
			
			if (temp!=-1) {
				for(int i=temp; i<prisoners.length-1; i++) {
					prisoners[i] = prisoners[i+1];
					
				}
				prisoners[prisoners.length-1] = null; // 맨 끝에 있는 것을 널로 만들고
				prisonerCount--; 
				
				
			}
		}
		// 삭제할 때 번호가 null이 될 것이므로 하나씩 당겨줘야 함
		
		
		else {
			System.out.println("해당 아이디를 가진 죄수를 확인할 수 없습니다. 다시 체크해주세요");
		}
		
	}

	@Override
	public void displayAllPerson() {
		// TODO Auto-generated method stub
		System.out.println("전체 죄수 명단 :");

		for(int i=0; i<prisoners.length; i++) {
			if(prisoners[i]==null) {continue;}
			System.out.println(prisoners[i].getInfo());	
		}
		
	}
	

}
