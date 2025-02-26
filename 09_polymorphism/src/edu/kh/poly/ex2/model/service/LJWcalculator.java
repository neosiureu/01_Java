package edu.kh.poly.ex2.model.service;

public class LJWcalculator implements Calculator, TestInterface {

	
	@Override
	public int plus(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int minus(int num1, int num2) {
		return num1-num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1/num2;

	}

	@Override
	public String Test() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * 
	 * */
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		Calculator.super.display();
	}
	
	

	

	
/*
 * extends와 implements
 * 
 * 확장 vs 구현
부모가 클래스 => 자식도 클래스 = extends
부모가 인터페이스 => 자식도 인터페이스 = extends
부모가 인터페이스 => 자식이 인터페이스 = implements

즉 같은 종류면 extends, 다른 종류면 implements
 * */
	
	

	

}
