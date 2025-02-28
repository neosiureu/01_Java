package com.hw.model.dto;

public abstract class Animal {
	String name;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public Animal(String name) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	abstract public void sound();
}
