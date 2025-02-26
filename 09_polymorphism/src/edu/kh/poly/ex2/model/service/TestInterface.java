package edu.kh.poly.ex2.model.service;

public interface TestInterface {
	int plus (int num1, int num2);
	String Test();
	
	default void display() {
		System.out.println("테스트 인터페이스의 display");
	}
	
}
