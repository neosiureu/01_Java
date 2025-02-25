package edu.kh.inheritance.model.dto;

public /*final*/ class Employee extends Person {
	// final 클래스: 상속 불가 (누군가의 부모가 될 수 없다)
	// 어디서 재정의 되면 곤란한 경우 사
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	
	public Employee() {

	}
	// 기본 생성자까지 직접 만들어야 오류가 안 남
	
	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality); // Person클래스의 매개변수 생성자로 전달받은 것들 중 name age nationality를 받음
		this.company = company;
		// company는 본인만의 필드만 초기화
	}
	
	
	// Person으로부터 상속받은 메서드 중
	// move메서드를 Emplyoee에 맞게 재정의

//	@Override
//	// 어노테이션: 해당 메서드가 오버라딩이  되었음을 컴파일러에 알려주는 역할
//	// 즉 잘못 오버라이드 하면 알려 줌
//	public void move(String str, int num) {
//		System.out.println("오버라이딩 된 move 메서드");
//		System.out.println("효율적으로 빨리 일하고 퇴근한다");
//
//
//	}
	
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		//super.move();
		System.out.println("이는 오버라이딩 된 move()입니다");
		System.out.println("효율적으로 빨리 일하고 퇴근한다");
		super.move();
	}
	
	// 김노동 36 한국 "kh정보교육원"
	
	@Override
	public String toString() {
		return super.toString() + "/ " +company;
	}

	
 	//	@Override의 동작 영역
 	// 부모에게 해당 메서드가 일단 있는지를 체크
	// 메서드의 특징 중 이름, 매개변수 타입, 개수, 순서가 일치하는지 여부를 검사한다.

	public final void onlyEmployee () {
		System.out.println("final 메서드 입니다. 따라서 오버라이딩이 안 됩니다.");
		
	
	}
	
	interface in1{
		
	}
	
	interface in2{
		
	}
	
}
