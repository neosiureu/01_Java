package edu.kh.oop.cls.model.vo;

public                       class             Student { // 클래스 선언 부
// [접근 제한자] [예약어]	[class]			[클래스 명]
	
	// public = 같은 프로젝트라면 어떤 클래스에서든 import하여 사용할 수 있다.
	// 반면 디폴트의 클래스는 같은 패키지에서만 가능

	// 필드 + (생성자를 포함한)메서드
	
	// 필드의 정의:  객체의 속성을 작성하는 클래스 내부의 영역. 멤버 변수라고 불린다.
	// 멤버변수의 구분: 인스턴스 변수 vs 클래스 변수
	// 인스턴스 변수: 필드에 작성되는 일반적인 변수 
	// 클래스 변수: static이 앞에 붙는 변수로 주로 public으로 접근 가능 
	// ex) public static String schoolName; 이러한 것이 static변수 또는 class 변수라 함
	
	// 필드의 접근 제한자 예제
	// 필드 접근 제한자: 직접 접근 가능한, getter setter없이 접근할 수 있는 범위. 
	
	public int v1=10; // 전체 접근 가능
	protected int v2=20; // 후손 클래스 접근 가능
	int v3= 30; // 같은 패키지 접근 가능
	private int v4= 40; // 같은 클래스까지 접근 가능
	
	
	// static 예약어
	public static String schoolName = "kh고등학교";
	
	// fianl 예약어
	private final int TEMP1 = 100;
	
	
	public int getTEMP1() {
		return TEMP1;
	}


	public void ex () {
		TestVo tvo  = new TestVo();
		// 같은 패키지라면 디폴트 접근자인 TestVo를 사용 가능
		
		
		System.out.println(v1); 
		// -> 전체에서 직접 접근 가능한 public인 v1만 에러가 나지 않음
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);

		// v1 v2 v3 v4모두 Student 클래스 내부에서 생성된 변수이기에 같은 클래스 내부에서는 문제 없이 접근
		
		
		
		
		
		}
	
	
	
}
	

