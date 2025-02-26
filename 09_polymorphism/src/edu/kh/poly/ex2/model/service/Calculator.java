package edu.kh.poly.ex2.model.service;

// 모든 계산기에 대한 공통 필드, 기능명만을 제공하는 접점의 용도

public interface Calculator {
	/*
	 * > 인터페이스는 추상클래스의 변형
	 * 추상클래스보다 추상도가 높다 
	 * 추상클래스는 일부만 추상적이나 인터페이스는 모두 추상메서드여야 한다.
	 * */
	
	
	
	//필드 영역
	
	// 묵시적으로 public static fianl, 즉 상수만 필드로 존재할 수 있음
	
	public static final double PI =3.141592;
	public final int MAX_NUM = 100000; //static 없음
	public int MIN_NUM = -100000; // final static 없음
	int ZERO =0; // 다 없음
	
	
	
	
	// 기능 영역 => 메서드는 자동으로 abstract와 public
	
	public abstract int plus(int num1, int num2);
	
	int minus(int num1, int num2);

	public int multiple(int num1, int num2);

	abstract public int divide (int num1, int num2);
	

	
	default void display() {
		System.out.println("계산기 인터페이스의 display");
	}

}
