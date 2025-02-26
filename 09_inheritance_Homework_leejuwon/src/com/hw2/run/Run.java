package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;
import com.hw2.model.service.Prison;

public class Run {

	public static void main(String[] args) {
		
		ManagementSystem ms = new Company(10);
		// employees = new Employee[10], count=0
		ManagementSystem ms2 = new Prison(10);

		
		((Company)ms).addPerson( new Employee("EMP001","유재석","기획팀"));		
		((Company)ms).addPerson( new Employee("EMP002","정형돈","개발팀"));		
		((Company)ms).displayAllPerson();
		((Company)ms).removePerson("EMP002");
		((Company)ms).displayAllPerson();
		((Prison)ms2).addPerson( new Prisoner("1205", "정준하", "밥도둑"));		
		((Prison)ms2).addPerson( new Prisoner("1111", "박명수", "웃음연쇄살인마"));		
		((Prison)ms2).removePerson("1111");
		((Prison)ms2).displayAllPerson();
		


	}

}
