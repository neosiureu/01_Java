package edu.kh.oop.cls.model.vo;

public class User {
	/*
	 * 생성자
	 * new 연산자를 통해 객체를 생성할 때 
	 * 생성된 객체의 필드 값을 초기화하거나 지정된 기능을 수행하는 역할
	 * 
	 * -생성자 작성 규칙
	 * 1) 생성자의 이름은 반드시 클래스명과 동일해야 함
	 * 2) 반환형이 존재하지 않는다.
	 * 
	 * 생성자의 종류: 
	 * 1) 기본 생성자 
	 * 2) 매개변수 생성자
	 * */
	
	



	// 속성 영역. 필드, 변수를 적는다.
	// 아이디, 비밀번호, 이름, 나이, 성별은 "공통적"으로 가지고 있음 (추상화)
	// 데이터를 직접 접근할 수 없으므로 private이며 getter setter가 존재
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	// 매개변수가 없는 기본 생성자

	// ctrl + space + enter => 기본 생성자를 자동으로 생성한다.
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	// alt+shift+s를 누르면 generate constructor using field 

	

	
	// 매개변수 생성자를 이해하기 위해
	// 매개변수 생성자, Overloading, this를 이해해야 한다
	
	/*
	 * 생성자나 메서드 호출 시 소괄호 안에 작성되어 전달되어지는 값을 저장하는 변수
	 * -> 전달받은 값을 저장하고 있는 매개체 역할의 변수이다.
	 * */
	
	public User(String userId, String userPw) { //오버로딩의 적용
		System.out.println("이번에는 매개변수 생성자를 이용하여 User객체를 생성한 경우입니다");
		// 필드의 초기화: 필드에 직접 접근하여 매개변수를 대입한다.
		this.userId = userId;
		this.userPw = userPw;

		// 필드     = 매개변수
		// this 참조변수: 객체가 자기자신을 참조할 수 있도록 하는 변수이다.
		// 힙 영역에 this 참조변수가 있고 자기 자신의 주소 값이 적힌 공간이 존재한다.
		// 필드명과 매개변수명이 같은 경우 이를 구분하기 위해 사용한다.
		
	}
	
	
	
	public User(String userId, String userPw, String userName, int userAge, char userGender) {
		// this(); // 기본 생성자를 의미
		this(userId, userPw); // 인자가 둘인 생성자를 의미
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		// this생성자란 같은 클래스의 다른 생성자를 호출할 때 사용
		
	}
	

	// 기본적으로 자바에서는 인스턴스 변수, 생성자, 메서드, 변수명 등의 중복을 허용하지 않음
	
	// private String userId;
	//Duplicate field User.userId

	// public User() {
		
	//}
	// Duplicate method User() in type User
	
	
	// overloading: 클래스 내에 동일한 이름의 메서드를 여러 개 작성하는 기법
	// 성립조건: 메서드의 이름은 같으나 매개변수의 개수, 타입, 순서 중 하나 이상이 달라야 함
	
	
	public User(String userId) {
		// 이름이 같으면서 매개변수의 개수가 동일한 생성자가 이전에 없었기 때문에 오버로딩 가능
	}
	
	public User(int userAge) {
		// 가능=> 개수가 달라서
		
	}
	
	public User(String userId, int userPw) {
		// 가능=> 개수는 같아도 타입이 같은 것이 없어서
	}
	
	public User(int userPw, String userId) {
		// 가능=> 개수 타입 다 똑같지만 순서가 달라서
	}
	
	//public User(int user1, String Id1) {
		// 불가능=> 변수명은 알 필요가 없다
	//}
	
	
	
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPw() {
		return userPw;
	}
	
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getUserAge() {
		return userAge;
	}
	
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	public char getUserGender() {
		return userGender;
	}
	
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}

	@Override
	// annotation => 컴파일러용 주석. 컴파일러가 인식할 수는 있되 주석이긴 함
	// 1) 만약 오타가 있거나 부모 클래스에 없는 메서드를 잘못 작성했을 경우 컴파일 오류를 발생 시킴.
	// 부모 클래스의 메서드를 정확히 문법을 지켜 재정의 했는지 검사하는 역할.
	// 2) 사람의 입장에서 이 메서드가 부모 클래스를 재정의했다는 것을 한 눈에 알 수 있음.
	
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userAge=" + userAge
				+ ", userGender=" + userGender + "]";
	}
	
	
	

	
	// 기능 영역 (생성자 + 메서드)
	
	

}
