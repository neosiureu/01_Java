package com.toyFactory.model.dto;

import java.util.*

public class Toy {
	String name;
	int price;
	String color;
	int age;
	int date;
	TreeMap<Integer , String > material = new TreeMap<>();

	// 필드는 6개: 장난감 이름, 사용가능연령 가격 색상 제조일(String) 재료 => Set인데 String만 이용 => 중복 되지 않는 값으로 저장하겠다
	

	

	
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
