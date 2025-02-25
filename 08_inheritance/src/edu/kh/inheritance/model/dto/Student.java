package edu.kh.inheritance.model.dto;

public class Student extends Person {
	// Student는 Person을 확장합니다.
	
	// 속성
	
//	private String name;
//	private int age;
//	private String nationality;
	// 여기까지는 부모인 Person에 있었음. 
	// 따라서 자식의 멤버와 부모의 멤버는 구분 되어야. 
	// 일단은 필요 없으니 지워도 됨
	

	private int grade;
	private int classRoom;
	// 이건 학생이라는 자식 고유의 필드
	
	
	
	// 메서드
	
//	public String getName() {
//		return super.name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getNationality() {
//		return nationality;
//	}
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}
	
	
	public Student() {
		// super()가 생략
	}


	public Student(int grade, int classRoom) {
		super(); // => Person의 기본생성자쪽으로 가게 됨
		this.grade = grade;
		this.classRoom = classRoom;
	}



	public Student(String name, int age, String nationality, int grade, int classRoom) {
		
		super(name, age, nationality);

		// 부모의 private 멤버이기 떄문에 접근할 수 없다.
		// this 참조변수는 본인 자신만을 의미
		// 상속을 받았어도 name, age, nationality는 부모의 고유 필드이기 때문에 
		// 자식인 Student에서 this 참조변수를 통해 직접 접근하는 것은 불가능하다.
		// 다만 물론 public인 setter를 통한 간접접근은 가능하다.
		// 그럼에도 setter를 따로 세팅하는 것은 비효율적!!

		// 따라서 비효율적으로 하지 말고 super 생성자를 통해 하자는 것
		
		// super(매개변수...)
		
		this.grade = grade;
		this.classRoom = classRoom;

	
	}


	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	@Override
	public String toString() {
		return super.toString() + "/ " + grade + "/ " + classRoom;
		
	}
	
	
// 여기에서 student 객체를 만들려고 하면 당연히 실패하지.



// 그렇다면 Peson을 상속받은 Student가 정말로 Person의 멤버 변수와 메서드를 사용할 수 있나?


	


}