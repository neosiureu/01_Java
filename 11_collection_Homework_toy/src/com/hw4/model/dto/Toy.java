package com.hw4.model.dto;

import java.util.TreeMap;

public class Toy {
	String name;
	int age;
	int price;
	String color;
	int date;
	TreeMap<Integer , String > material = new TreeMap<>();

	
	
	public Toy() {
		
	}



	public Toy(String name, int age, int price, String color, int date, TreeMap<Integer, String> material) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.date = date;
		this.material = material;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getDate() {
		return date;
	}



	public void setDate(int date) {
		this.date = date;
	}



	public TreeMap<Integer, String> getMaterial() {
		return material;
	}



	public void setMaterial(TreeMap<Integer, String> material) {
		this.material = material;
	}
	
	
	
	

}
