package com.hw4.model.dto;

import java.util.TreeMap;

public class Toy {
	String name;
	int price;
	String color;
	int age;
	int date;
	TreeMap<Integer , String > material = new TreeMap<>();

	
	

	

	
	public Toy() {
		material.put(1,"면직물");
		material.put(2, "플라스틱");
		material.put(3, "유리");
		material.put(4, "고무");
	}

	


	public Toy(String name, int price, String color, int age, int date, TreeMap<Integer, String> material) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.age = age;
		this.date = date;
		this.material = material;
	}




	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
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
