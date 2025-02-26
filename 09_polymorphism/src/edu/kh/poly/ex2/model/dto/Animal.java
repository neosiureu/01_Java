package edu.kh.poly.ex2.model.dto;

public abstract class Animal {
	// 1) 추상클래스 => 미완성 메서드를 하나라도 포함한 클래스
	// 2) 객체로 Animal을 만들수는 없다. 다만 참조변수의 형은 될 수 있다.
	// 3) 여러 타입들을 관리하기 위한 상위 타입의 목적이며 객체로 생성하지는 않음
	
	
	// 속성
	private String type; // 종, 과
	private String eatType; // 식성

	
	
	// 기능
	public Animal() {
	}



	public Animal(String type, String eatType) {
		super();
		this.type = type;
		this.eatType = eatType;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEatType() {
		return eatType;
	}
	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	
	// 추상화된 동물의 공통 기능
	
	// 먹기, 숨쉬기, 움직이기
	// 다만 어떤 동물인가에 따라 방법이 다르다.
	// 해당 클래스에 각각의 자세히 메서드 정의를 하기 힘들다
	// 따라서 추상적으로 미완성적인 메서드를 만들어 상속 받은 자식이 
	// 해당 메서드를 다시 본인에게 맞는 형태로 정의하도록 오버라이딩 강제화
	// 그래서 abstract method가 필요한 것
	
	
	// 1) 동물은 먹는다
	public abstract void eat();
	
	// 2) 동물은 숨을 쉰다
	public abstract void breath();

	// 3) 동물은 움직인다
	public abstract void move();

	// 인터페이스와 달리 일반 메서드도 가능
	
	public void ex () {
		System.out.println("인터페이스와의 차이에 대한 예시를 들기 위한 일반 메서드!");
	}
	
	// 일반적인 필드와 메서드를 작성 가능
	
	@Override
	public String toString() {
		return type + " / " + eatType;
	}
	
	

}

