package com.hw2.model.dto;

public class Employee extends Person {
	private String position;

	public Employee(String id, String name, String postion) {
		super(id, name);
		this.position = postion;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInfo() {
		return String.format("고유번호: %s, 이름 %s, 직책: %s", id, name, position);
	}
	

}
