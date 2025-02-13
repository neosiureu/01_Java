package edu.kh.op.practice;

import java.util.Scanner;

// 기능 제공용 클래스

public class OperatorPractice {
	
	public void practice1 () {
		int people, candy;
		Scanner in=new Scanner(System.in);
		System.out.print("인원 수: ");
		people= in.nextInt();
		System.out.print("사탕 개수: ");
		candy= in.nextInt();
		System.out.println("1인당 사탕 개수: "+ (candy/people));
		System.out.println("남는 사탕 개수: "+ (candy%people));
	}
	
	public void practice2 () {
		Scanner in2=new Scanner(System.in); //설계도는 한 패키지에 하나만 수입하면 됨

		String name, gender;
		int year, whatClass, stdnum;
		float grade;
		System.out.print("이름: ");
		name =in2.nextLine(); //작성하는 스트링에 공백이 없으면 next만으로도 충분
		
		System.out.print("학년 (정수만): ");
		year =in2.nextInt();

		
		System.out.print("반 (정수만): ");
		whatClass =in2.nextInt();
		
		System.out.print("번호 (정수만): ");
		stdnum =in2.nextInt();
		in2.nextLine(); // nextInt 이후에 nextLine이 있으면 
		// 엔터를 한 번 먹어줘야 함 -> 개행문자를 비우는 과정
		
		System.out.println("성별 (남학생/여학생)으로 입력: ");
		gender =in2.nextLine();

		System.out.println("성적 (소수점 아래 둘째 자리 까지 입력하세요): ");
		grade = in2.nextFloat();
		
		System.out.printf("%d학년 %d반 %d번 %s라는 이름의 "
				+ "성별이%s인 학생의 "
				+ "성적은 %.2f이다",year,whatClass,stdnum,name,gender,grade);
	}
	
	public void practice3 () {
		int kor,eng,math,sum;
		float avg;
		Scanner in=new Scanner(System.in);
		System.out.printf("국어: ");
		kor = in.nextInt();
		System.out.printf("영어: " );
		eng= in.nextInt();
		System.out.printf("수학: ");
		math= in.nextInt();
		sum=kor+eng+math;
		avg = (float) ((kor+eng+math) /3.0);
		System.out.printf("합계: %d\n", sum);
		System.out.printf("평균: %.1f\n", avg);
		boolean isPass;
		isPass = (kor>=40 && eng>=40 && math >=40 && avg >=60.0) ? true : false;
		String msg = isPass ? "합격" : "불합격";
		
		System.out.println(msg);


	}
}
