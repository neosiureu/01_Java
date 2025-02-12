package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	public void practice4 () {
		String ageMessage, adoleMsg, oldChildMsg ;
		int age;

		Scanner s= new Scanner(System.in);
		System.out.print("나이 입력: ");
		age= s.nextInt();
		
		ageMessage = (age >= 20) ? "저는 성인!"  : "저는 미성년!";
		adoleMsg = (age>=13 && age<=19) ? "청소년입니까? true" : "청소년입니까? false"; 
		oldChildMsg = (age>=65 || age<=12) ? "노인이거나 어린이입니까? true" : "노인이거나 어린이입니까? false"; 

		System.out.println(ageMessage);
		System.out.println(adoleMsg);
		System.out.println(oldChildMsg);




		
	}
	
}
