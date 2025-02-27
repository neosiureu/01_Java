package edu.kh.exception.test;

public class ExceptionTest {

	public static void main(String[] args) {
		// about compile error
		// 컴파일 단계에서 나온 빨간 줄로 개발자가 코드를 잘못써서 나타난다.
		
		int a = (int) 99.9; // 자료형이 맞지 않아 연산이 불가능하여 컴파일 에러가 발생 (개발자가 코드를 잘못 썼다)
		
		// about runtime error
		// 프로그램 실행 이후에 발생하는 에러
		// 주로 if문을 통해 처리한다.
		
		int[] arr = new int[3];
		// 길이가 3이고 인덱스가 0,1,2로 존재하는 배열
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		// arr[3] = 40;
		

		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at edu.kh.exception.test.ExceptionTest.main(ExceptionTest.java:21)
		 * */	
		// ArrayIndexOutOfBoundsException = 배열범위 초과 예외
		
		if(arr.length>=3) { // 배열 인덱스 범위를 초과한 값이 들엉왔다면
			System.out.println("배열 범위를 초과했습니다.");

		}
		else {
			arr[3] = 40; 
			System.out.println("배열 범위는 안정적입니다.");
		}
	

		
	}

}
