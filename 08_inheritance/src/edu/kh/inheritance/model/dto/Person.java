package edu.kh.inheritance.model.dto;
// dto = Data Transfer Object
// vo와 유사하나
// 비즈니스 계층과의 데이터 교환을 위해 사용한다.
// 가령 db에서 (db가 비즈니스 계층) 가지고 오는 데이터가 있을 때 자바 노드에서 어떤 클래스를 만들었을 때


public class Person extends Object { // 아무것도 상속받지 않았다? 아니, extends Object가 생략되어 있다!!
	
	// class 선언부에 상속 구문이 하나도 작성되어있지 않다면 컴파일러가 extends Object 구문을 자동으로 추가해준다.
	
	
	
	//속성
	private String name;
	private int age;
	private String nationality;

	
	// 생성자
	
	public Person() {

	}
	
	public Person(String name, int age, String nationality) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	// 메서드

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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}



	public void breath () {
		System.out.println("사람은 코와 입으로 숨을 쉰다. ");
	}
	
	public void move () {
		System.out.println("사람은 움직일 수 있다. ");
	}

	
	@Override
	public String toString() {
		return name + "/ " + age + "/" + nationality;
	}
	
}
