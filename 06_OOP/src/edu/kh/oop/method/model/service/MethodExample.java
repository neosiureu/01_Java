package edu.kh.oop.method.model.service;

import java.util.Scanner;

public class MethodExample {
	
	// 메서드가 호출될 때마다 stack에는 메서드를 실행한 이력이 쌓인다.
	// 메서드를 호출한 순서대로 쌓임.
	// main에서 method1로, 그 이후 method2로.
	// 제일 마지막에 쌓인 순서대로 스택에서 나가게 되므로 LIFO의 법칙에 따라 제일 나중에 들어온 것부터 나간다.
	// method2에서 method1로, 거기에서 main으로 가게 된다.
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		System.out.println("두 숫자를 입력하세요: ");
		
		int result = method2(sc.nextInt(), sc.nextInt()); 
		// method2()함수 호출
		System.out.println(result);
	}

	public int method2(int a, int b) {
		int sum = a+b; 
		return sum;
	}
	
	
}
