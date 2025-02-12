package edu.kh.variable.ex2;

import java.util.Scanner;

// Scanner라는 이름의 클래스를 ex2패키지의 이 파일로 수입
// 비유하자면 class는 설계도이므로 설계도를 이 파일로 가져오는 셈. 
//설계도만 있으니 기계 자체는 여기에서 준비해서 만들어야 함
// import는 다른 패키지에 존재한느 클래스를 들여오는 구문

public class ScannerExample {
	public static void main(String[] args) {
		// 프로그램 실행 중에 키보드 입력을 받을 수 있는 역할을 하는 클래스로부터 객체 생성. 즉 설계도로부터 기계 만들기
		Scanner sc = new Scanner(System.in);
		// import가 없으면 설계도가 없는 셈이라 기계를 만들수 없다. 따라서 오류가 확인되면 마우스를 올려 적절히 오류 수정 가능
		// Scanner라는 설계도를 이용해서 만든 기계의 이름이 sc. 
		// sc는 참조변수 매개변수는 키보드 입력이어야 하므로 System.in
		// sc라는 참조변수는 만들었지만 정확히 뭘 하는지는 아직 모름
		System.out.print("정수 1 입력: ");
		int input1 = sc.nextInt(); // 다음으로 입력 된 정수 값 하나를 input1에 넣음
		System.out.print("정수 2 입력: ");
		int input2 = sc.nextInt();
		System.out.printf("%d+%d=%d\n",input1,input2,input1+input2);
		// 정수를 키보드로부터 입력 받으려면 nextInt, 문자열이고 싶으면 next, 실수이고 싶으면 nextDouble등 
		// 어떤 타입인지에 따라 참조변수에 의해 소환되는 메서드들이 다름 
	
	}
}
