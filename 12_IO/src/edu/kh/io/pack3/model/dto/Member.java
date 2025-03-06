package edu.kh.io.pack3.model.dto;

import java.io.Serializable;


// Serializable인터페이스는 재구현 할 추상메서드를 가지지 않음
// 상속만 받아도 입출력 시 직렬화가 가능하다는 마커 (의미, 표시)만 제공한다
public class Member implements Serializable {
	private String id;
	private String pw;
	private String name;
	private int age;
	
	
	public Member() {
		// TODO Auto-generated constructor stub
	}


	public Member(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


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


	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
	
	
	

}
