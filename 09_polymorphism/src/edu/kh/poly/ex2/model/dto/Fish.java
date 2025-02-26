package edu.kh.poly.ex2.model.dto;

public class Fish extends Animal {

	public Fish() {
		// TODO Auto-generated constructor stub
	}
	
	public Fish(String type, String eatType) {
		super(type, eatType);
	}


	@Override
	public void eat() {
		System.out.println("물고기는 입을 뻐끔 거리며 먹는다");
	}

	@Override
	public void breath() {
		System.out.println("물고기는 아가미를 이용해 숨을 쉰다");
	}

	@Override
	public void move() {
		System.out.println("물고기는 꼬리로 헤엄을 친다");
	}
	
	@Override
	public String toString() {
		return "Fish: " + super.toString();
	}
	
}
