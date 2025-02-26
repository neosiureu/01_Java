package edu.kh.poly.ex1.model.dto;
public class Car {
	// 속성
	private String engine;
	private String fuel;
	private int wheel;
	
	// 기능
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String engine, String fuel, int wheel) {
		super(); // object의 기본 생성자
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	
	@Override
	public String toString() {
		// 오버라이딩이란?
		// 부모 클래스에서 정의된 메서드를 자식 클래스에서 재정의 하는 것
		// return super.toString() // super 참조변수 (부모의 주소 값을 가짐) => 이를 return하면 Object의 주소 값만 나옴
		return engine + " / " + fuel + " / "  + wheel ;
	}
}
