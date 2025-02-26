package edu.kh.poly.ex2.model.dto;

public class Person extends Animal {
	// 오버라이딩의 강제화 => 상속을 했으면 무조건 함수들이 있는데 
	// 아무것도 작성하지 않아서 오류
	
	private String name;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Person(String type, String eatType, String name) {
		super(type, eatType);
		this.name = name;
	}
	



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void eat() {
		System.out.println("인간은 숟가락이나 젓가락과 같은 도구를 이용하여 먹는다. ");
	}

	@Override
	public void breath() {
		System.out.println("인간은 코와 입으로 숨을 쉰다. ");
	}

	@Override
	public void move() {
		System.out.println("인간은 두 발로 걷는다. ");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person : " + super.toString() +" / " + name;
	}
	

}
