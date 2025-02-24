package edu.kh.oarr.model.vo;

public class Member {
	// 5명까지 멤버를 관리할 수 있는 회원정보 관리 프로그램
	
	

	// 속성 (필드, 멤버 변수)
	private  String memberId;
	private  String memberPw;
	private  String memberName; // 멤버의 이름
	private int memberAge;
	private  String region; // 경기 충북 강원 서울 등
		
	// 기능
	
	// 생성자 = 기본 or 매개변수
	// 생성자 작성 규칙
	// 클래스 이름과 같은 함수명, 반환형 없음
	// 매개변수 생성자가 하나라도 기존에 있다면 기본생성자의 자동 생성은 없다
	// 즉 기본생성자가 필요하면 내가 직접 만들어야 할 가능성이 있다.
	

	public Member() {

	} // ctrl space enter
	
	
	// alt shift s
	
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge= memberAge;
		this.region = region;
	}
	// 모든 필드를 받아서 넣어주는 매개변수 생성자

	// 오버로딩: 같은 클래스 내 동일한 생성자 이름, 메서드 이름 등을 이용할 수 있는 기법
	// 오버로딩 성립 조건: 이름이 같으며 파라미터의 개수, 순서, 타입이 하나라도 다르면 성립
	

	// 캡슐화 원치을 위함
	// 필드에 선언된 멤버변수들이 캡슐화 원칙에 의해 private으로 선언 => 간접 접근 방식으로 
	// 따라서 getter setter의 접근 제한자는 public

	// getter와 setter의 생성

	public String getMemberId() {
		// String 자료형의 값을 되돌려 준다.
		return memberId;
		// 메서드를 종료하고 해당 메서드를 call한 쪽으로 memberId라는 문자열을 가지고 되돌아간다.
		
	}	

	public void setMemberId(String memberId) {
		this.memberId = memberId;
		// 반환 값이 없다. 자료형 자체가 없음
		// 그러나 return;이 생략된 셈
		// 반환형이 void면 자동 추가. 즉 반환형 앞 명시적인 void를 없애면 오류
	}

	public String getMemberPw() {
		return memberPw;
	}


	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public int getMemberAge() {
		return memberAge;
	}


	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	
	
	

}
