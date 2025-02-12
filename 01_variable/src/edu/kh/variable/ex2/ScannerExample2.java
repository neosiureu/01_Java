package edu.kh.variable.ex2;

import java.util.Scanner;

//ctrl + shift + o => 현재 파일에서 import하기 적절한 클래스들을 전부 import 해 주는 단축 키
public class ScannerExample2 {

	public static void main(String[] args) {
		// 사칙연산 연산 프로그램
		// 두 개의 실수를 입력 받아 사칙 연산 결과를 모두 출력한다
		// 다만 출력된 결과 값은 소수점 이하 둘째 자리까지만 출력한다
		double d1, d2;
		Scanner sc = new Scanner(System.in);
		System.out.printf("첫 숫자를 입력하세요: ");
		d1= sc.nextDouble();
		System.out.printf("두번째 숫자를 입력하세요: ");
		d2= sc.nextDouble();
		
		System.out.println("사칙 연산의 결과");
		System.out.printf("%.2f+%.2f=%.2f\n",d1,d2,d1+d2);
		System.out.printf("%.2f-%.2f=%.2f\n",d1,d2,d1-d2);
		System.out.printf("%.2f*%.2f=%.2f\n",d1,d2,d1*d2);
		System.out.printf("%.2f/%.2f=%.2f\n",d1,d2,d1/d2);

		

		

	}

}
