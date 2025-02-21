package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService extends Student {

	public void ex1() {
		// 클래스 접근 제한자 확인하기
		// clsService와 Student및 TestVo는 패키지가 다름
	
		
		Student std = new Student();
		

		// 필드 접근 제한자 확인하기
		
System.out.println(std.v1);
	// 전체에서 직접 접근 가능한 v1만이 에러가 나지 않음
System.out.println(v2);
// System.out.println(std.v3);
//System.out.println(std.v4);
	
		


		
		
	}
	
	public void ex2 () {
		// static 필드 확인 예제
		// 일단 Student 클래스를 이용하여 학생 객체를 둘 생성한다
		
		Student std1 = new Student();
		Student std2 = new Student();
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		//schoolName에 대한 규칙을 지키지 않아 노란 줄이 뜨게 됨
		// static이 붙은 변수는 클래스명.변수명 <- 이러한 형태로 사용해야 함
		/*
		 * 공유메모리 영역 (정적 메모리 영역)이라고 함
		 * 프로그램 시작 시 static이 붙은 코드들이 모두 static영역에 생성
		 * static 영역에 생성된 변수는 어디서든지 공유가 가능함
		 * 어디서든지의 정확한 기준은? 
		 * 
		 * */
		System.out.println(Student.schoolName);

	}



	public void ex3 () {
		// 생성자 확인 테스트
		// User클래스의 기본 생성자를 이용하여 u1이라는 참조변수로 객체를 생성하자
		User u1 = new User();
		// 다른 패키지이므로 일단 사용 불가. 다만 public이라 같은 프로젝트이기에 User를 import하면 사용 가능
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		System.out.println("-----------------------------");

		User u2= new User();
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
	// 예상되는 문제점
	// U1이 참고하고 있는 User객체와 U2가 참조하고 있는 User객체의 필드 값은 동일하다
	// 같은 디폴트 contructor로 객체를 생성하고 있기 때문
	
		System.out.println("-----------------------------");

		// 해결방법1: setter를 이용하여 새로운 값을 대입한다.
		u2.setUserId("asd1234");
		u2.setUserPw("qwertyui");
		u2.setUserName("기린");
		u2.setUserAge(25);
		u2.setUserGender('여');
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		
		// 해결방법2: 매개변수 생성자를 이용한 객체생성
	
		System.out.println();
		System.out.println();
		System.out.println();

		User u3= new User("thirdId", "passwordthree"); 
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		System.out.println(u3.getUserName());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserGender());
		
		
		
	}

	public void ex4 () {
		User u1 = new User();  // 기본 생성자로 User 객체를 생성
		User u2 = new User("user02","secondPW"); //이번에는 매개변수 생성자를 이용하여 User객체를 생성한 경우입니다
		User u3 = new User("user03", "thirdPw", "김홍석", 30, '남');
	
		System.out.printf("u1 : %s / %s / %s / %d / %c\n", 
				u1.getUserId(), u1.getUserPw(), u1.getUserName()
				, u1.getUserAge(), u1.getUserGender() );

		System.out.printf("u2 : %s / %s / %s / %d / %c\n", 
				u2.getUserId(), u2.getUserPw(), u2.getUserName()
				, u2.getUserAge(), u2.getUserGender());
		
		System.out.printf("u3 : %s / %s / %s / %d / %c\n", 
				u3.getUserId(), u3.getUserPw(), u3.getUserName()
				, u3.getUserAge(), u3.getUserGender());
	
	System.out.println(u3); // 원래 u3의 주소가 나와야 하지만 .toString이 생략되었다고 생각이 되어  둘이 똑같이 나옴
	System.out.println(u3.toString());
		
	}


}