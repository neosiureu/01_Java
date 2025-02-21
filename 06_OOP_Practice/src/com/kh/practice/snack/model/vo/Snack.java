package com.kh.practice.snack.model.vo;

public class Snack {
	

	String kind; // 과자 종류
	String name; // 과자 이름
	String flavor; // 과자 맛
	int numOf; // 과자 수
	int price; // 과자 가격
	
	public Snack() {
	}
	
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String information () {
		return "종류: "+this.getKind()+ 
				"\n이름: "+this.getName()+ 
				"\n맛: "+this.getFlavor()+ 
				"\n개수: "+this.getNumOf()+ 
				"\n가격: "+this.getPrice()
				;
	}
	
	
	
	

	
}
