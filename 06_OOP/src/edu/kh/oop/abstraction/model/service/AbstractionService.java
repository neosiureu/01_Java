package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

public class AbstractionService {

	// 서비스를 담당하는 로직 => 특정 기능 = 비즈니스 로직을 제공하는 패키지
	// 가령 비밀번호를 암호화하거나 특정 파일만 걸러내는 작업 등은 다 이 패키지에 모여 있음
	public void ex1 () {
		// 속성과 기능은 필요할 때만 쓰면 된다. 딱히 가질 속성이 없고 기능만 써도 된다는 뜻
		// people 클래스를 이용하여 국민의 객체를 만든다
		People p1 = new People();
		// people 객체의 주소를 저장하여 참조하는 변수가 p1입니다  = 새로운 People객체를 heap영역에 생성

		// 원래 변수 앞에는 자료형이 들어가야 함
		// 따라서 People라는 이름을 자료형처럼 사용할 수 있음. 
		// 이렇게 클래스 이름을 자료형 이름처럼 사용하는 것을 일컬어 "사용자 정의 자료형"이라 함
		
	
		// 메서드 내에서 생성 된 변수는 항상 스택 영역에 생성. 따라서 p1은 stack에 있다.
		
		

/*
		p1.name="이주원";
		p1.gender = '남';
		p1.pNum = "960830-1234567";
		p1.phone = "010-1577-1577";
		p1.age = 317;
	
		
		
		System.out.println( "p1의 이름: " +p1.name);
		System.out.println("p1의 성별: " + p1.gender); 
		// 왜 기본 값이 0이라면서 빈 문자가 나오냐?
		// char타입: 유니코드에서 숫자0은 공백 문자를 나타 냄.
		// char 0은 공백이나 마찬가지라 0이 자동으로 빈 문자로 바뀐 것임
		System.out.println("p1의 주민번호: " +p1.pNum);
		System.out.println("p1의 주소: " +p1.address);
		System.out.println("p1의 전화번호: " +p1.phone);
		System.out.println("p1의 나이: " + p1.age );		

*/
		
		
	
		p1.tax();
		p1.vote();		
		p1.setName("잉중웡");
		System.out.println(p1.getName());

		p1.setGender('z');
		System.out.println(p1.getGender()+"성별");

		p1.setAge(592);
		System.out.println(p1.getAge()+"세");
		
		p1.setpNum("960830-1010101");
		System.out.println(p1.getpNum());
		
		p1.setPhone("010-0100-0110");
		System.out.println(p1.getPhone());
		p1.setAddress("오리시 하마군 마룽로");
		System.out.println(p1.getAddress());
		
		
	}

	
	public void exMyself () {
		People juwon = new People();
		juwon.tax();
		juwon.vote();		
		juwon.setName("이주원");
		System.out.println(juwon.getName());

		juwon.setGender('m');
		System.out.println(juwon.getGender()+"성별");

		juwon.setAge(-100);
		System.out.println(juwon.getAge()+"세");
		
		juwon.setpNum("960830-1010101");
		System.out.println(juwon.getpNum());
		
		juwon.setPhone("010-0100-0110");
		System.out.println(juwon.getPhone());
		juwon.setAddress("도봉구 노해로 144 101-708");
		System.out.println(juwon.getAddress());
	}
}


