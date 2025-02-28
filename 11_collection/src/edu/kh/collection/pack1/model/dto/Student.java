package edu.kh.collection.pack1.model.dto;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private String region;
	private char gender;
	private int score;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, String region, char gender, int score) {
		super();
		this.name = name;
		this.age = age;
		this.region = region;
		this.gender = gender;
		this.score = score;
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
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", region=" + region + ", gender=" + gender + ", score="
				+ score + "]";
	}
	@Override
	public int compareTo(Student other) {
		// other = 다른 객체
		// 이 메서드는 두 객체를 비교하고 순서를 결정
		// 반환값의 의미: 현 객체와 this 객체를 빼기로 비교
		// 0이면 같고 양수이면 왼쪽 객체가 크고, 음수이면 왼쪽이 작음
		
		return this.age - other.age;
		// 현재 객체의 나이 - 다른 객체의 나이
		// 값이 양수이면 현재 객체의 나이가 더 크다
		// 작은 값이 앞에 오도록 정렬해야 오름차순
		// 작은것부터 큰 순서대로 정렬되도록 하는 오름차순정렬
		// 값이 음수이면 현재 객체의 나이가 더 작다 
	}
	
	
	
	
	
	
	
	
	
	// 기능
	

}
