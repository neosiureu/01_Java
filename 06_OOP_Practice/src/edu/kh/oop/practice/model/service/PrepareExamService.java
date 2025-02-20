package edu.kh.oop.practice.model.service;

import java.util.Scanner;

public class PrepareExamService {

	Scanner sc = new Scanner(System.in);
	
	// 연습문제 2_5
	public void ex1 () {
		System.out.print("중간고사 점수: ");
		int mid = sc.nextInt();
		System.out.print("기말고사 점수: ");
		int fin = sc.nextInt();
		System.out.print("과제 점수: ");
		int homework =sc.nextInt();
		System.out.print("출석 횟수: ");
		int attend =sc.nextInt();
		final double MIN_ATTEND_RATE = 0.7;
		final int MAX_ATTEND = 20;
		if( attend<(MAX_ATTEND*(1-MIN_ATTEND_RATE))) {
			System.out.println("Fail [출석횟수 부족("+ attend +"/20)]");
		}
		else {
			System.out.println("중간고사 점수(20): "+ mid*0.2);
			System.out.println("기말고사 점수(30): "+ fin*0.3);
			System.out.println("과제 점수(30): "+ homework*0.3);
			System.out.println("출석 점수(20): "+ attend);
			if(realScore(mid, fin, homework, attend)<70) {
				System.out.println(realScore(mid, fin, homework, attend));
				System.out.println("Fail [점수미달]");
			}
			else {
				System.out.println(realScore(mid, fin, homework, attend));
				System.out.println("PASS");

			}
			
		}

		
		
	}
	
	
	public double realScore(int mid, int fin, int homework, int attend) {
		double last= mid*0.2 + fin*0.3 + homework*0.3+ attend;
		return last;
	}
	
	// 연습문제 3_11
	public void ex2() {
		System.out.print("정수 입력: ");
		int starNum = sc.nextInt();
		for(int i=0; i<starNum; i++) {
		for(int j=starNum-1; j>=i;j--) {
			System.out.print(" ");
			
		}
		for(int k=0; k<2*i+1; k++) {
			System.out.print("*");
		}
		System.out.println();

		}
	
	}
	
	
	
	// 연습문제 4_14
	public void ex3() {
		
		
	}
	
}
