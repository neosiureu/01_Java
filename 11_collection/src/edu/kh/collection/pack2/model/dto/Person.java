package edu.kh.collection.pack2.model.dto;

import java.util.Objects;

public class Person {
	// 사용자정의 클래스를 객체로 넣는다면 중복제거를 위해 할 것이 있다
	String name;
	int age;
	char gender;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String nameString, int age, char gender) {
		super();
		this.name = nameString;
		this.gender = gender;
		this.age = age;
	}
	public String getNameString() {
		return name;
	}
	public void setNameString(String nameString) {
		this.name = nameString;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, gender, name);
	} 
	
	/* 동일 비교 해주는 함수를 오버라이딩한 결과 
	Object 클래스에 있는 hashCode 메서드를 오버라이딩 한다
	필드에 저장된 값을 이용하여 각각의 hasCode를 생성한다.
	해시테이블에는 객체별 식별 코드가 정의되어 있다.
	*/
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		return age == other.age && gender == other.gender && Objects.equals(name, other.name);
//	} 
	
	// 동일 비교 해주는 함수를 오버라이딩한 결과
	/* ==의 결과는 주소를 비교. 즉 완전히 같은 값이어야 같은 것
	 equals는 주소가 다르더라도 값을 비교하는 메서드이다.
	 
	*/
	
	
	
	// 동등 vs 동일
	// 같은 객체를 제거한다 = 같다는게 동일한거야? 동등한거야?
	
	// -동일 = 가리키고 있는 주소 자체가 같다
	// -동등 = 해당 주소의 객체가 가진 값이 같다
	
	// 동일 객체 = 메모리 주소가 완전히 같은 객체
	// 그를 판단하는 기준은 hashCode()메서드. 같은 객체라면 완전히 반환값이 동일하기 때문
	
	// 동등 객체 = 메모리 주소가 다르더라도 각 객체의 내부 값들이 같음
	// 그를 판단하는 기준은 equals()메서드. 이러한 객체의 값이 같은지 판단할 때 사용 
	

	
}
