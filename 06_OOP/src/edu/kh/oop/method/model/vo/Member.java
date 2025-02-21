package edu.kh.oop.method.model.vo;

public class Member {
	// 회원 객체라면 가져야할 속성과 기능

	
	// filed area
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	
	
	// constructor area
	public Member() {
	}
	
	// 기본 생성자는 없을 경우 compiler가 자동으로 생성해주지만
	// 매개변수를 가진 생성자가 하나라도 존재한다면 자동으로 생성 안 해줌
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}
	// 생성자 오버로딩 
	// 메서드의 이름이 같으면서 파라미터의 개수, 타입, 순서 중 하나가 달라야 함
	// 여기서는 다 다르므로 오버로딩이 가능하다.
	
	
	// method area

	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	

	
}
