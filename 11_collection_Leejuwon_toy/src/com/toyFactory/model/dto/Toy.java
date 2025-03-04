package com.toyFactory.model.dto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.print.attribute.standard.MediaSize.Other;

public class Toy implements Comparable<Toy> {
	private String name;
	private int age;
	private int price;
	private String color;
	String date;
	Set<String> material = new HashSet<String>();

	

	// 필드는 6개: 장난감 이름, 사용가능연령 가격 색상 제조일(String) 재료 => Set인데 String만 이용 => 중복 되지 않는 값으로 저장하겠다
	
	
	public Toy() {
	
	}
	

	public Toy(String name, int age, int price, String color, String date) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.date = date;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}



	public Set<String> getMaterial() {
		return material;
	}



	public void setMaterial(Set<String> material) {
		this.material = material;
	}
	
	


	@Override
	public int compareTo(Toy o) {
		return  Integer.parseInt(this.date)  - Integer.parseInt(o.date)  ;
	}


	@Override
	public String toString() {
		return " 장난감 이름: " + this.getName()
		+ " / 사용 가능 연령: "+ this.getAge() + " / 가격:"+ this.getPrice()+ " / 색상: "+ this.getColor() + " / 제조년월일: "+ this.getDate()+ " / 재료: "+ this.getMaterial() ;
	}



}
