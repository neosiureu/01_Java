package edu.kh.oop.abstraction.model.vo;
// 대체 왜 패키지명이 이런가? 
// MVC 패턴

/*
>> MVC = Model View Controller의 약자

자바 이용 프로그램은 이 형태를 따르는 것이 관례

>
application의 역할을 세 가지로 분리하는 설계 패턴이 MVC

유지보수가 간단하며 역할 분리가 명확하여 협업이 쉬움 


Model- 데이터와 비즈니스 로직을 처리하는 부분 (DB, 서비스, 객체)
View- user interface를 담당하는 부분 (HTML, JSP, React, Thymeleaf 등)
Controller- 사용자의 요청을 받은 뒤 모델과 뷰를 연결하고 제어하는 역할 (응답)

여기에서 model.vo라는 이름을 지은 이유가 Model부분에 해당 됨

> 그 중 model에도 데이터가 나눠 짐.

DB(보안 등) 서비스(알고리즘 등) 객체 등 넓은 범위이기 때문에 많은 범위가 있음
vo는 value object의 약자로 데이터를 담는 객체를 관리한다는 의미
여기에서 DB와 관련이 깊어지면 vo가 아닌 dto를 써야 함

DB에는 영구적으로 값을 저장하는 부분이 존재: DB에서 자바 노드로 어떤 데이터를 가져왔을 떄 그 데이터를 이용하기 위해 존재하는 공간이 vo
값을 저장하는 용도의 객체이기 때문에 value object라고 불림


일단 model의 정의를 알아두자

> model은 프로그램의 로직과 관련 있는 데이터를 저장하거나 비즈니스 로직을 다룬다

vo의 정의를 알아두자

> vo는 value object의 약자로 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지

 */



// 캡슐화의 정의: 변수와 함수를 하나로 묶어서 관리하는 기법으로 
// 데이터의 직접적인 접근을 제한하는 것이 원칙이다.
// 직접 접근을 못하기에 클래스 내부에 간접 접근 방법을 제공하는 기능을 반드시 작성해야만 한다
// 그를 getter setter라 부른다.

/*
 * 데이터의 직접 접근을 제한하면 private으로 바꾸면 됨
 * */

public class People {
	// 클래스란 객체의 "속성과 기능"을 정의한 것
	// 객체를 만들기 위한 설계도

	// 속성이란? 값, 데이터, 변수
	// 국민이라면 반드시 공통적으로 가지고 있는 속성만 가지고 있어야 함 -> 추상화의 본질!!
	// 필드란? 클래스에서 사용하는 변수가 나열되는 공간 (속성은 필드 변수, 멤버 변수라고도 불린다)

	// 기능이란? 메서드, 함수
	private String name;
	private char gender;
	private String pNum;
	private String address;
	private String phone;
	private int age;
	// 위 6개의 변수를 간접 접근할 수 있게 해야 함

	
	
	// [접] [자] [명]
	
	// 기능 == 행동이나 동작 == method로 동작
	
	public void tax () {
		System.out.println("세금을 냅니다. ");
	}
	
	public void vote () {
		System.out.println("투표를 합니다. ");
	}

	// 캡슐화에서 사용할 간접 접근 기능
	

	// name이라는 변수의 값을 호출한 쪽으로 돌려 보내주는 간접접근 기능 중 getter를 만들자.
	
	public String getName() {
		return name;
		// name이라는 문자열을 돌려 보내주는 = return name, 함수 앞에 String
		// 현재 메서드를 종료하고 호출한 지점으로 되돌아감.
		// return; => 현재 메서드를 종료하고 호출한 쪽으로 되돌아가기만 함
		// 다만 일반적으로 return 옆에 함수 앞 자료형을 적어 주는데, 
		// 이는 현재의 메서드를 종료할 때 변수를 가지고 호출한 쪽에 그대로 넣는다는 말
	}
	
	// 따라서 getter들은 반환형이 무조건 있을 것이다. getter는 항상 변수를 호출하기 위해 존재하기 때문
	// 필드에 작성된 변수는 특정 자료형이 있을테니
	
	public void setName(String name) {
		this.name = name;
	}
	// name 변수에 값을 세팅하는 간접 접근 기능 setter
	// 전달 인자 == 파라미터 == 매개 변수
	// 매개변수의 이름은 필드의 인스턴스 변수는 색이 다름
	// this의 역할은 현재 객체, 즉 this.뒤에 변수가 있으면 현재 객필드에 있는 변수라는 의미

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getpNum() {
		return pNum;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// setter를 이용하면 본인이 원하는 기능을 추가할 수 있음.
		// age가 0보다 작을 떄는 예외를 발생시키고 0보다 클 때만 원하는 값을 this로 세팅한다.
		if(age>0) {
			this.age = age;
		}
		else {
			throw new IllegalArgumentException("사람 나이가 어떻게 음수냐??");
			// 메서드에 전달된 인자가 유효하지 않을 때 발생하는 예외
		}
		
	}

	
	
	
	
	
}

