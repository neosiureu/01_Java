package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

/**
 * 
 */
/**
 * 
 */
public class StudentService {
	
	
	
	public StudentService() {
		studentList.add(new Student("홍길동", 23, "서울시 중구", 'M', 100));
		studentList.add(new Student("고영희", 23, "경기도 안산시", 'F', 90));
		studentList.add(new Student("강아지", 30, "서울시 강남구", 'M', 80));
		studentList.add(new Student("오미나", 27, "충북 청주시", 'M', 70));
		studentList.add(new Student("박주희", 24, "서울시 서대문구", 'F', 60));		
	}
	
	/*
	 * java.util.list에 존재하는 리스트라는 이름의 인터페이스
	 * List에 반드시 필요한 필수 기능만을 모아둔 interface
	 * 인터페이스이므로 객체 생성을 자체로 할 수 없으나 
	 * 부모의 참조변수로 자식의 객체를 가리킬 때의 역할은 할 수 있다
	 * */

	// java.util.ArrayList: 배열 형태의 List이므로 가장 대표적인 List의 자식 클래스
	
	// 학생의 정보를 저장할 리스트를 생성
	
	private List <Student> studentList = new ArrayList<Student>(); 
	// 다형성의 이용 (upcasting) => 부모타입의 참조변수에 자식객체 주소를 저장
	
	// new ArrayList() =  기본 크기 10짜리 리스트 생성
	// 검색이나 조회에 효율적인 ArrayList이지만 추가, 수정, 삭제에 효율적인 LinkedList로 얼마든지 바꿀 수 있음

	private Scanner sc = new Scanner(System.in);
	
	
	
	private List <Object> testlist = new ArrayList<Object>();
	// ex에서의 사용을 위한 리스트

	public void ex () { // List 테스트용 예제
		// 추가 => add = List.add(Object e): 리스트에 객체를 추가 
		// 매개변수 타입은 실제로 Object임 그 말은 모든 하위 객체를 매개변수로 전달 가능
		System.out.println("정말 모든 것을 받을 수 있나?");

		testlist.add("문자열");
		testlist.add(new Student("홍길동", 25, "서울시 중구", 'M',25 ));
		testlist.add(sc);
		testlist.add(new Object());
		
		// Object List.get(i) => i번째 인덱스에 있는 객체를 반환
		// 반환형을 보니 모든 것을 반환할 수 있다.
		System.out.println(testlist.get(0));
		System.out.println(testlist.get(1));
		System.out.println(testlist.get(2));
		System.out.println(testlist.get(3));
		
		// 컬렉션의 특징 => 여러 타입의 데이터를 저장할 수 있다.		
		
		// testList에서 꺼내온 인덱스의 요소가 Student혹은 그의 상속 관계인지 검사하고
		// 만약 Student라면 이름만 반환한다
		
		for( Object e : testlist ) {
			if(e instanceof Student) {
				System.out.println(((Student)e).getName());
			}		
		}
		
	}
	

	
	/**
	 * alt shift j는 메서드 설명용 주석
	 * @author leejuwon siwooreu@naver.com
	 */
	public void displayMenu () {
		int menuNum = 0; // 메뉴를 선택
		do {
			System.out.println("\n================학생관리 프로그램===================");
			System.out.println("1. 학생 정보의 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(검색어와 정확히 일치)");
			System.out.println("6. 이름으로 검색 (검색어를 포함)");
			System.out.println("7. 나이순으로 정렬 "); // comparable 클래스
			System.out.println("8. 이름순으로 정렬 "); // comparator 사용
			System.out.println("0. 프로그램 종료 ");
			
			
			System.out.print("메뉴 번호 선택: ");
			// 정수가 아닌 것이 들어올 것을 대비하는 예외 처리
			
			try {
				menuNum = sc.nextInt();
				sc.nextLine();
				
				switch (menuNum) {
				case 1: System.out.println(addStudent());
					break;
				case 2: selectAll(); 
					break;
				case 3: System.out.println( updateStudent());
					break;
				case 4: System.out.println( removeStudent());
					break;
				case 5: searchName1();
					break;
				case 6: searchName2();  
					break;
				case 7: sortByAge(); // comparable 이용
					break;
				case 8: sortByName();
					break;
				case 0: System.out.println("프로그램을 종료합니다");
					break;
				default: System.out.println("유효하지 않은 선택지입니다.");				
				}
				
				
			} catch (InputMismatchException e) {
				System.out.println("에러: 입력 형식이 유효하지 않습니다. 다시 시도해 주세요."); 
				// 종료 자체를 하지 않기 때문에 다시 0이 아니므로 처음으로 돌아가 sc를 다시 받을 수 있음
				sc.nextLine(); // 입력 버퍼에 잘못 넣은 숫자가 아닌 값이 있으므로 그것을 제거하는 과정
				menuNum = -1;
				/*  이런 문제가 생기는 이유? 첫 반복 시 잘못 입력하는 경우 menuNum이 초기값인 0을 가지고 있어 반복문이 종료된다 
				 * => 이를 방지하기 위해 임의의 값 -1을 대입해둔다.
				 * */
			}
			
		} 
		while (menuNum!=0);
		
		
		
	}
	
	/**
	 * @return  삽입 성공 시에는 "성공:문자열이 반환, 실패 시 "실패"문자열 반환
	 * 1. 학생 정보 추가 메서드
	 */
	public String addStudent () {
		
		// checked Exception: 반드시 throws 또는 try-catch처리를 강제한다
		// IOException SQLException
		
		// unchecked Exception: 강제 처리가 아니므로 해당 메서드에서 예외가 발생하면 
		// 자동으로 상위에서 호출된 display 메서드로 예외가 전파 된다
		// InputMisMatchException NullPointException, ArithmeticException
		// 이는 그것에 해당하기 때문에 자동으로 throws가 display 함수로 가게 된 것
		
		System.out.println("\n================학생정보 추가===================");
		System.out.print("이름: ");
		String name;
		int age;
		try {
			name = sc.next();

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			name = "몰?루";
		}
		System.out.print("나이: ");
		try {
			age = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			age=-1;
		}

		System.out.print("주거지: ");
		String region = sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("점수: ");
		int score = sc.nextInt();
		/*  이제 새로운 객체를 생성하고 필드에 있는 Student만 들어갈 수 있는 만들어둔 리스트에 추가한다.*/
		if(	studentList.add(new Student(name, age, region, gender, score)) ) {
			// add메서드의 성질상 성공하면 1이 반환되기 때문
			return "성공";
		}
		return "실패";	
	}
	
	/**
	 * 학생 전체를 조회하는 메서드: List가 비어있는 경우에는 "학생정보가 없습니다"를 출력
	 * "하나라도 있는 경우에는 전체 학생을 출력한다"
	 */
	public void selectAll () {
		System.out.println("\n================학생 전체 조회===================");
		// studentList가 비어있는지 확인
		// List에 저장된 데이터의 개수를 얻어오는 방법: int List.size();
		
		// boolean List.isEmpty(): 컬렉션이 비어있다면 true를 반환
		if(studentList.isEmpty()) {
			System.out.println("학생 정보가 없습니다");
			return ; // 현재 메서드를 종료하고 호출한 곳으로 돌아 감
		}
//		for(int i=0; i<studentList.size(); i++) { // length가 아니다
//			System.out.println(studentList.get(i));
//		}
		// 배열이나 컬렉션의 모든 요소를 순차적으로 반복접근 할 수 있는 변형 반복문
		// 향상된 for문 위에 index 역을 할 i를 만든다.
		int i=0;
		for(Student std  : studentList ) {
			System.out.println((i++) +"번: "+std);
		}
	
	}
		
	
	/**
	 * 3. 학생정보 수정 메서드
	 * 오류1) 학생 정보가 studentList에 하나라도 있는지 없는지 검사한다
	 * 없다면 "입력된 학생 정보가 없다는 문자열을 반환
	 * 오류2) 인덱스 번호로 학생을 수정하려고 하는데
	 * 입력된 숫자가 0보다 작은지 검사
	 * 작다면 음수는 입력할 수 없다는 문자열을 반환
	 * 오류3) studentList 범위 내 인덱스번호가 맞는지 검사
	 * 초과헀다면 범위를 넘어선 값을 입력할 수 없다는 메시지 반환
	 * 
	 * 다 아니어야 수정
	 * 
	
	 * 
	 * @return 
	 * 수정할 때
	 * 1) index 번째에 저장된 학생의 정보: 수정 전 정보를 출력
	 * 2) 이름, 나이, 사는 곳, 성별, 점수에 대한 수정할 값을 입력 받는다
	 * 3) 수정이 완료되었다면 "이름"의 정보가 변경되었다는 문자열을 반환
	 */
	public String updateStudent() {
		System.out.println("\n================학생 정보의 수정===================");
		System.out.print("인덱스 번호: ");
		int index = sc.nextInt();
		if(studentList.isEmpty()) {
			return "입력된 학생 정보가 없습니다!!!";
		} else if(index<0) {
			return "음수는 입력할 수 없습니다!!!";
		}
		else if(index>= studentList.size() ) { // 인덱스와 같아져도 문제
			return "인덱스를 벗어난 값을 입력하셨습니다!!!";
		}
		else {
			// 1) 현재 index번째의 저장된 학생의 정보를 출력한다
			System.out.println(index +"번째에 저장된 학생 정보");
			System.out.println(studentList.get(index));
			//2) 이름, 나이, 사는 곳, 성별, 점수에 대한 수정할 값을 입력 받는다
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("주거지: ");
			String region = sc.nextLine();
			System.out.print("성별(M/F) : ");
			char gender = sc.next().charAt(0);
			System.out.print("점수: ");
			int score = sc.nextInt();
			
			// set메서드는 컬렉션 안의 객체 하나를 반환해준다
			// index번째에 있던 기존 학생 정보가 반환될 것이다. 그 객체를 temp에 저장해놓고 보여줄 것이다.
			Student temp = studentList.set(index, new Student(name, age, region, gender, score));
			// 수정 이전 객체가 반환. 왜 어차피 바꿀건데 이전 학생의 정보를 받아두어야 하나?
			// 리턴을 할 때 필요해서
			return temp.getName()+"의 정보가 변경되었습니다.";
			}
		}
	
	/**
	 * 4. 학생정보 제거 메서드
	 * 1) 인덱스 번호 입력 받고 비어있는지, 0보다 작은지, 번호가 범위를 벗어나는지 검사 다 통과했을때 제거
	 * 2) "정말 삭제하시겠습니까 (Y/N)?으로 물어본 뒤 " Y를 입력했다면 해당 인덱스에 있는 객체 삭제 후 
	 * 3) xxx님의 정보가 제거되었습니다 라는 문자열을 리턴
	 * 4) n을 입력했다면 취소라는 문자열을 리턴한다
	 * 
	 * Object List.remove(int index) => List에서 index번째 요소를 제거하고 제거된 요소인 Student가 반환 된다.
	 * 리스트 중간에 비어있는 인덱스가 없게 만들기 위해서 remove() 동작 시에 한 칸씩 자동으로 알아서 당겨 온다.
	 * 즉 삭제만 하면 메모리를 신경 안 써도 된다.
	 * @return
	 */
	public String removeStudent () {
		System.out.println("\n================학생 정보 제거===================");
		System.out.print("삭제할 사람의 인덱스 번호: ");
		int index = sc.nextInt();
		if(studentList.isEmpty()) return "입력된 학생 정보가 없습니다!!!";
		 else if(index<0) return "음수는 입력할 수 없습니다!!!";
		
		else if(index>= studentList.size() )  return "인덱스를 벗어난 값을 입력하셨습니다!!!";

		
		System.out.print("정말 삭제하시겠습니까? (Y/N): ");
		char yn = sc.next().toUpperCase().charAt(0); 
		// "y" => "Y" => 'Y'로 완성
		if(yn=='Y') {
			Student temp = studentList.remove(index);
			return temp.getName()+ "님의 정보가 제거되었습니다";
		}
		
		return "정보 삭제가 취소되었습니다.";
	}
	
	
	/**
	 * 5. 이름이 정확히 일치하는 학생을 찾아 조회
	 * 검색할 이름을 입력받아 studentList에서 꺼내 온 Student객체의 name 값이 같은지 비교
	 * -일치하는 경우에는 Student객체에 대한 내용을 출력
	 * 일치하는 것이 없다면 검색 결과가 없다는 메시지를 출력
	 * 
	 */
	public void searchName1(){
		System.out.println("\n================학생 검색 (이름이 완전히 일치해야 합니다)===================");
		System.out.print("검색할 이름을 입력하세요: ");
		String input = sc.next();
		boolean flag = true;
		for(Student std :studentList ) {
			if(input.equals(std.getName())) {
				// 일치하는 이름이 있을 경우
				System.out.println(std);
				flag = false;
			}	
		}
		if (flag) { System.out.println("일치하는 이름을 찾을 수 없습니다.");
		}
	}
	
	/**
	 * 6. 이름에 특정 문자열이 포함되는 학생을 찾아서 조회하는 메서드
	 * 문자열을 입력받아 studentList에서 꺼내 온 Student객체의 name값에 포함되는 문자열인지 검사한다
	 * 
	 *  포함되는 학생 객체를 찾는데 성공한 경우 Student객체를 출력한다
	 *  없다면 "검색결과가 없다고 출력"
	 *  
	 */
	public void searchName2 () {
		System.out.println("\n================학생 정보 검색 (일부만 일치하는 이름이어도 검색 가능합니다)===================");
		System.out.print("이름에 포함될 문자열을 입력하세요 : ");
		String input = sc.next();
		boolean flag = true;
		for(Student std:studentList ) {
			// boolean String.contains(문자열): 앞쪽에 뒤쪽이 포함되어 있으면 참, 아니면 거짓
			if(std.getName().contains(input)) { //순서는 꼭 이래야 함. input이 포함되는 쪽이므로 주의
				System.out.println(std);
				flag = false;
			}
			
		}
		if(flag) {
			System.out.println("검색 결과가 없습니다");
		}
	}
	
	
	/*
	* 
	*  리스트를 정렬하는 방법
	* 방법1) Comparable인터페이스를 상속받아 compareTo메서드의 재정의
	* 이 예시에서는 Student에 Comparable인터페이스를 상속받는다. 
	* 그를 오버라이딩한 compareTo메서드에서 정의한대로 정렬된다.
	* 방법2) Comparator 클래스에 의한 정렬 compare()메서드 사용 => 익명 내부 클래스를 이용한다
	* 이름이 없는 클래스를 즉석에서 선언해 한 번만 사용할 목적으로 작성한다.
	* 외부에서 그 클래스를 부를 수 없다. 재사용하지 않는다는 의미
	* 객체를 생성하면서 곧바로 구현 내용을 정의할 수 있다.
	* why 익명 내부 클래스? 
	* 1) 코드의 간결화 (별도로 클래스를 만들지 않아도 될 때 사용)
	* 2) 즉시 사용  한번 사용하고 말 Comparator등을 정의할 때 유용
	* 3) 지역화 (특정 메서드 안에서만 필요할 때)
	* */
	
	/**
	 * 나이에 따라 오름차순으로 정렬하는 메서드
	 * 
	 */
	public void sortByAge () {
		Collections.sort(studentList);
		// compareTo 메서드가 실행 되어야 함=> 물론 그 안에 있는 Student객체에 대한 compareTo를 내가 정의했어야 함
		for(Student std:studentList) {
			System.out.println(std); // 23 23 30 27 24
		}
	}
	

	public void sortByName () {
		// 이름에 따라 정렬하기 (가나다순)
		Collections.sort(studentList, new Comparator<Student>() {
				// 익명 내부클래스는 Comparator의 인터페이스를 상속받아 구현한 클래스가 된다
	// public class ABC implements Comparator대신에 한번만 쓰고 버릴 것이니 이 내부 클래스를 쓴 것
			
			@Override
			public int compare(Student o1, Student o2) { // 각기 다른 Student객체 둘이 들어온 것
				// 그를 통해 비교
				// 두 객체를 비교하고 순서를 결정한다 => 반환값: 왼쪽-오른쪽으로 compareTo와 같음

				return o1.getName().compareTo(o2.getName()) ; // String 클래스에서 만든 compareTo라는 다른 메서드를 구현
				// 자바에서 문자열 객체를 비교하는 메서드
			}
		
		} 
					
/* 여기가 sort메서드의 끝입니다 */);
		
		for(Student std: studentList) {
			System.out.println(std);
		}
		/*여기가 sortByName메서드의 끝입니다*/ 
	}
	
	
}
