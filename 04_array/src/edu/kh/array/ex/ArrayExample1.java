package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	/*
	 * array란? 같은 자료형의 변수를 하나의 묶음으로 다루는 것이다
	 * 묶여진 변수들은 하나의 배열 명으로 불리며
	 * 구분은 배열의 각 칸을 이용하는 index를 이용 함 (인덱스는 0부터 시작 함)
	 * 
	 * */

	Scanner sc = new Scanner(System.in);
	public void ex1 () {
		// -*-*-*--*-*-*- 변수 vs 배열의 비교 분석 -*-*-*--*-*-*-
		
		// 변수의 선언 
		int num; 
		// stack area에 int 자료형을 저장할 수 있는  공간 4바이트를 할당하고 그 공간에 num이라는 이름을 부여

		
		
		// 변수의 대입
		num=10; // num이라는 공간에 10이라는 값을 대입 함
		
		// 변수의 사용
		System.out.println("num에는"+num+"이라는 값이 저장되어 있다!!");
		// num이 저장 된 자리에 num에 저장된 값을 읽어와서 출력
		
		
		
		
		
		
		
		// dd
		
		// --------------------------------변수는 이런데 배열은 어떨까?---------------------------------
		
		
		// 배열의 선언 
		int[] arr; // stack 영역에 int[]라는 자료형 공간을 4바이트 할당하고 그 공간에 arr공간을 부여한다.
		//arr이라는 변수는 참조형으로 주소 값만을 저장할 수 있다.
		
		// 배열의 할당
		arr= new int[3]; 
		// 특히 new 연산자가 중요: new를 통해 만들어진 모든 존재는 heap area에 새로운 공간을 할당하는 셈
		// 그 공간은 배열이나 객체가 들어가게 됨
		// int[3]: int형 변수 3개를 하나의 묶음으로 나타내는 배열이라는 의미
		// 따라서 new int[3]은 heap 영역에 int형 변수 3짜리인 int[]배열을 생성(할당)하겠다는 의미
		// 마지막에 int[] arr = new int[3]이라고 했으므로 참조변수와 배열을 연결한 셈
		// int[]의 참조변수와 연결될 수 있는 것은 int[]뿐
		
		
		System.out.println("arr의 출력 결과: "+ arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// 배열의 요소 값 대입

		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 100;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		
		// 배열의 사용
		System.out.println(Arrays.toString(arr));
		

		
		
	}

	public void ex2 () {
		// 배열의 선언 및 할당
		
		System.out.println("------배열의 초기화 방식1: 인덱스를 이용한 초기화------");

		int arr[]= new int[4];
		// arr이 참조변수, int[4]가 객체
		// 힙 영역의 모든 인덱스 벨류가 JVM에 의해 0으로 초기화 됨
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		// 코드에서 빨간 줄의 에러가 뜨는 것: 컴파일 에러
		// 코드에서 빨간 줄이 뜨지 않지만 실행했을 때 나는 에러 : 런타임 에러
		

		// arr[4] = 5000;
		// 실행 시 ArrayInedexOutOfBondsException 에러가 발생
		
		System.out.println("배열의 길이는 "+ arr.length);
		// 배열의 길이를 나타내는 메서드가 아닌 일종의 변수로 "필드"인 length. 따라서 ()가 없다.
		
		
		System.out.println("------배열의 초기화 방식2:  ------");

		for(int i=0; i<arr.length; i++) {
			// i의 가용 값은 0123
			System.out.printf("arr[%d]에 저장된 값:  %d\n",i,arr[i]);
			
		}
		
		System.out.println("------배열의 초기화 방식3:  ------");

		int arr2[] = {1,2,3,4,5};
		// 이는 스택 영역에 int[] 자료형의 공간을 4바이트 할당한 뒤 arr2라는 이름을 부여
		// 힙 메모리 영역에 다섯 칸 짜리 int가 들어갈 수 있는 배열을 생성한 후 
		// 0번 인덱스부터 각 요소에 12345를 대입하였다.
		// int 배열의 주소 값을 arr2라는 참조 변수가 참조 함
		System.out.println( arr2.length+ "칸");
		System.out.println(Arrays.toString(arr2));

		
	}

	public void ex3 () {

		// 문제 5명의 키를 cm으로 입력받고 평균을 구하라.
		// 1번의 키를 입력하세요 (cm):  
		// 2번의 키를 입력하세요 (cm):  
		// ...
		// 5번의 키를 입력하세요 (cm):  
		// 평균 키 (cm)는: 
		
		// scanner (받아야하니) + 배열 (double형의 모음)이 필요할 듯.
		
		double height[] = new double[5];
		double sum=0; // 합계 저장용 변수
		
		// dobule[] 자료형 참조변수 height를 스택 영역에 생성.
		// 힙 영역에 새로 생성 된 5칸짜리 배열이 있고 
		// height에는 해당 배열의 주소를 참조변수로서 대입하라.
		for (int i=0; i<height.length; i++) {
			System.out.printf("%d번의 키를 입력 하세요(cm): ", i+1);
			height[i] = sc.nextDouble();


			sum+=height[i];
		}
		System.out.println("평균 키: "+sum / height.length);

		
	}

	public void ex4 () {
		// 입력받은 인원 수 만큼의 점수를 입력받아 배열에 저장한다
		// 단 입력이 완료되면 점수의 합계, 평균, 최고점, 최저점을 출력한다.
		
		int sum=0;
		double  avg = 0.0;
		System.out.print("입력받을 인원 수: ");
		int length= sc.nextInt();
		//할당할  배열의 크기를 이 숫자로 함 final은 필요 없음
		int [] scores = new int[length];
		
		for(int i=0; i<scores.length; i++) {
			System.out.print((i+1)+"번 점수 입력 (0이상 100이하): ");
			scores[i] =  sc.nextInt();
			sum+= scores[i];
			
			//	if(max<scores[i]) {max = scores[i]; }
			//	if(min>scores[i]) {min = scores[i]; }
			// 이 방식으로 하면? 최저점과 최고점을 알아야 하며 그 점수 내의 범위가 아닌 점수로 초기화를 해야 함
			// 다만 이러면 한 번의 loop로 처리할 수 있음
			
		}
		
		System.out.printf("합계: %d\n", sum);
		
		// 최고점과 최저점의 기준
		int max = scores[0], min = scores[0];
		
		for(int i=0; i<scores.length; i++) {
			// 최고점, 최저점을 비교하는 조건을 담은 식
			if(scores[i]>max) max= scores[i];
			if(scores[i]<min) min= scores[i];
		}
		
		avg = (double) sum / scores.length;
		System.out.printf("평균: %.2f\n", avg);
		System.out.println("최고점: "+ max);		
		System.out.println("최저점: "+ min);
		}

	
	public void ex5 () {
		// 점심 메뉴 뽑기 프로그램
		String arr[]= { "서브웨이", "김밥", "라면", "백반", "짜장면", "햄버거"};
		System.out.println("오늘 점심 메뉴: "+ arr[ (int) (Math.random()*6) ]);
		
	}
	
	
	public void ex6 () {
		// 배열을 이용한 검색
		// 입력 받은 정수가 배열 내에 존재하는지 확인하는 프로그램
		// 있다면 몇 번 인덱스에 존재하는지 출력

		int arr[]= {100,200,300,400,500,600,700,800,900,1000};
		System.out.println("정수 입력:");
		int input = sc.nextInt();
		
		// 신호를 나타내기 위한 변수
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++) {

			
			if(arr[i] ==input) {
				System.out.println(i+"번째 인덱스에 존재");
				flag = true;
			}
		
		}
		
		if(!flag) { //일치하는 값을 찾았으면 flag가 true가 되었으므로 이 코드는 !때문에 무시 됨
			System.out.println("존재하지 않음");
			// 따라서 일치하는 값을 끝까지 못 찾았을 때만 이 코드가 수행 됨
		}
		
		
//		if(arr[i] ==input) {
//		System.out.println(i+ "번째 인덱스에 존재");
//		break;
//	}
//	
//	if(i== arr.length-1) {
//		System.out.println("존재하지 않음");
//
//	}
		
	}
	
	
	public void ex7 () {
		// 입력받은 값과 일치하는 값이 있으면 그 인덱스 번호를 출려하고 없다면 존재하지 않는다고 출력
		// 다만 String 배열을 이용함
		String arr[]= {"사과", "딸기", "바나나", "키위", "아보카도" };
		boolean flag= false;
		System.out.print("과일 입력:");
		String input = sc.nextLine();
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(input)) {
				System.out.println(i+"번 인덱스에 존재");
				flag = true;
			}
		}
		if(!flag) {System.out.println("존재하지 않는 과일입니다!");
}
		
		
	}
	
	public void ex7_2 () {
		String arr[]= {"사과", "딸기", "바나나", "키위", "아보카도" };
		System.out.print("과일 입력:");
		String input = sc.nextLine();
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(input)) {
				System.out.println(i+"번 인덱스에 존재");
				break;
			}
			if(arr.length-1==i  ) { System.out.println("존재하지 않는 과일입니다!!");

			}
			}
		
		
	}


	public void ex8 () {
		// 자바에서 문자열은 조금 다르게 설정 된 String 클래스로부터 참조 됨
		String str = "가나다";
		System.out.println(str); 
		System.out.println(str.toString());
		// String 클래스에는 toString 메서드가 존재
		// 이 메서드는 특이하게도 자기 자신을 그대로 반환
		// str이라고만 해도 뒤에 .toString이 생략된 셈으로 치는 구조
		// 대입 되는 문자열 자체가 반환
		System.out.println(System.identityHashCode(str)); // 그럼 주소 값을 볼 수도 있어야지

		String str2= new String("가나다"); // String을 생성하는 두 가지 방식 리터럴 또는 new연산자
		// 리터럴 또는 new 
		// String str = "가나다"와 같은 리터럴의 경우 String constant pool에 저장
		// String str2= new String("가나다")와 같이 new를 통해 만들어진 경우 새 객체로 heap영역에 저장
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println("가나다를 입력하세요");
		String str3 = sc.next();
		System.out.println(str3 == str);
		System.out.println(str3.equals(str));
		System.out.println(str2 == str);
		System.out.println(str2.equals(str));
		System.out.println(str3 == str2);
		System.out.println(str3.equals(str2));


		
	}

	public void ex9 () {

		// 문자열을 입력받아 한 글자씩 잘라내어 char 배열에 순서대로 저장하는 문제
		// 문자 하나를 입력받아 일치하는 문자가 해당 char 배열에 몇 개 존재하는지 확인한다
		// 다만 일치하는 문자가 하나도 없을 경우 "존재하지 않습니다"라고 출력
		// 문자열 입력: "Hello" -> char 배열의 형태는 {h,e,l,l,o }
		// 검색할  문자를 입력 하세요: l
		// l은 2개가 존재합니다
		// 검색할  문자를 입력 하세요: p
		// p는 존재하지 않는다.
		
		// ===== 평가 기준 =====
		
		// 1) 배열을 검색할 수 있는가?
		// 2) 문자열의 길이를 파악할 수 있는가? String.length 메서드 <-> 배열에서는 메서드가 아닌 변수여서 ()가 없었음
		// 가령 "hello.length()"의 반환 값은 5
		// 3) 문자열에서 해당 인덱스에 존재하는 하나의 문자를 반환 하는 String.charAt(index)를 파악할 수 있는가? 
		// 가령 "hello.charAt(1)의 반환 값은 e
		// 4) cnt 변수를 이용해 개수를 파악할 수 있는가?
		
		System.out.print("문자열 하나를 입력하세요: ");
		String input= sc.nextLine();
		char arr[] = new char[input.length()]; 
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		
		System.out.println(Arrays.toString(arr));

		System.out.print("검색할 문자를 하나 입력 하세요: ");
		char ch= sc.next().charAt(0);	// h를 입력했다면 이제 "h"가 아닌 'h'가 되는 셈

		int cnt=0;
		
		for(int i=0; i<arr.length ; i++) {
		if(ch==arr[i]) {
			cnt++;
		}
		
		}
		if(cnt==0) {
			System.out.println("존재하지 않음");

		}
		else {
		System.out.printf("%c는 %d개 존재합니다",ch,cnt);}

		

		
		
		

	}
	
	public void ex10() {
		String strs[] = { new String("사과"), new String("바나나"), new String("딸기") };
	    for (int i = 0; i < strs.length; i++) {
	        System.out.println(strs[i] + "의 주소(해시): " + System.identityHashCode(strs[i]));
	    }
	}
	
	
	
}
