package com.hw1.model.vo;

public class Person {
	private int age;
	private double height;
	private double weight;
	protected String name;
	// private와 protected의 차이는 해당 변수의 직접접근 가능 여부
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int age, double height, double weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String information() {
		return String.format("이름: %s / 나이: %d / 신장: %.1f / 몸무게: %.1f ", 
				name, age, height, weight);
		//형식지정자와 똑같이 써도 됨 => print가 아닌 String 반환을 해주는 차이
	}
}
