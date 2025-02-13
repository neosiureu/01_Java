package edu.kh.control.condition;

import java.util.Scanner;

// 기능만 제공하고 실행은 안 하는 클래스

public class ConditionExample {
	Scanner sc =new Scanner(System.in); // 멤버 변수, 인스턴스 변수 sc
	// 필드 영역에 변수를 생성하는 것으로 클래스에서 공공으로 사용하는 것을 sc라 함 
	
	public ConditionExample() {
		// TODO Auto-generated constructor stub
	}
	
	public void ex1 () {
		// if문
		// 조건식이 true일 때만 내부 코드를 수행
		
		//입력 받은 정수가 양수인지 검사하라. 양수라면 "양수입니다" 출력
		System.out.print("정수 입력: ");
		int input = sc.nextInt();

		if(input>0) {
			System.out.println("양수입니다");

		}
		
		if(input<=0) {
			System.out.println("양수가 아닙니다");

		}
		System.out.printf("ㅇ");

	}

	public void ex2 () {
		// if- else문:
		// 조건 식의 결과가 true이면 if문이 실행 false이면 else문이 실행
		// 홀짝 검사 예제, 다만 0이면 "0입니다"를 출력해야
		// 중첩 if문을 사용
		System.out.print("정수를 입력하세요: ");
		int input=sc.nextInt();
		if(input%2==1) {
			System.out.println("홀수 입니다"); // else는 가장 가까이에 있는 if와 "양자택일"
			// 즉 if가 맞으면 else 자체는 수행을 안 하고 바로 중괄호 밖으로

		} else { // 짝수 또는 0 입력 시 수행
			if(input==0) {
				System.out.println("0 입니다");
			}
			else {
				System.out.println("짝수 입니다");

				
			}
			
		}
		
		
		
	}
	
	public void ex3 () {
		
		// if (조건식) - else if (조건식) - else 들과 뒤에 {}
		// + - 0 판별
		Scanner sc =new Scanner(System.in);
		System.out.println("정수를 입력하세요");

		int input= sc.nextInt();
	
		if(input >0) {
			System.out.println("양수 입니다");
		}
		else if (input<0) {
			System.out.println("음수 입니다");
		}
		
		else {
			System.out.println("0입니다");
		}
		
	}

	public void ex4 () {
		Scanner sc =new Scanner(System.in);
		System.out.println("몇 월인지 입력하세요");
		int month = sc.nextInt();
		 // 조건부 수행 결과 저장 및 출력
	
		
		String season = sc.nextLine();
		if( (month>0 && month<3) || month==12  ) {
			System.out.println("온도를 입력하세요");
			int temperature = sc.nextInt();
			season = "겨울";	
			if(temperature<=-15) {	
				season+="한파 경보";
			}
			else if(temperature<=-12) {
				season+="한파 주의보";
			}
			
		}
		else if (month>=3 && month <=5) {
			season = "봄";
		}
			
		else if (month>=6 && month <=8) {
			season = "여름";
			System.out.println("온도를 입력하세요");
			int temperature = sc.nextInt();
			if(temperature>=35) {	
				season+="폭염 경보";
			}
			else if(temperature>=33) {
				season+="폭염 주의보";
			}
		}
			
		else if (month>=9 && month <=11) {
			season = "가을";
		}
		else {
			season = "없음";
		}
		
		System.out.println("현재 계절은 "+season);		
	}

	public void ex5 () {
		int age;
		String result;
		System.out.println("나이를 입력해주세요. ");
		age = sc.nextInt();
		if(age<=13) {
			result = "어린이 입니다";
		}
		
		else if(age<=19) {
			result = "청소년 입니다";
		}
		
		else 
			result = "성인 입니다"; 
		
		
		System.out.println(result);

		
	}

	public void ex6 () {
		// 백점 만점 점수를 입력 받아 90점 이상이라면 A
		// 80점 이상 90점 미만은 B
		// 70점 이상 80점 미만은 C
		// 60점 이상 70점 미만은 D
		// 60점 미만은 F
		// 0점보다 낮거나 100점을 초과하는 경우 "잘못 입력 했다고 출력"
		int score;
		String resultString =null;
		System.out.print("점수를 입력해주세요: ");
		score= sc.nextInt();
		/*if(score>=90 && score<=100) resultString= "A";
		else if(score>=80&& score<90) resultString= "B";
		else if(score>=70&& score<80) resultString= "C";
		else if(score>=60&& score<70) resultString= "D";
		else if(score>=0&& score<60) resultString= "F";
		else System.out.println("잘못 입력 하신 듯");*/
		
		// 제일 먼저 걸러져야 할 것이 if문 제일 위로 가야 함




		
	}

	public void ex7 () {
		// 놀이기구 탑승 제한 검사 
		//(나이가 12세 이상이며, 키가 140이상이면 탑승 가능)
		// 나이가 12세 미만인 경우 적정 연령이 아니라고 출력
		// 키가 140미만인 경우 적정 키가 아니라고 출력
		// 나이가 0세 미만, 100세 초과 시 잘못 입력 하셨다고 출력
	
		
		// 집합의 범위가 전혀 다른 것을 먼저 처리하고 같은 밴다이어그램 안에 있으면 좁은 것부터 처리한다
		
		int age;
		int height;
		String result;
		System.out.print("나이 입력: ");
		age = sc.nextInt();
		if(age>100 || age<0) {
			result="잘못 입력 하셨습니다";	
		}
		else {
			System.out.print("키 입력: ");
			height = sc.nextInt();
			
			if(age<12) {result = "적정 연령이 아닙니다";}
			else if(height<140) {result="적정 키가 아닙니다";}
			else {result="탑승 가능";}
		}
		System.out.println(result);

			
	}
	public void ex8 () {
		int age;
		int height;
		String result;
		System.out.print("나이 입력: ");
		age = sc.nextInt();
		if(age>100 || age<0) {
			result="나이를 잘못 입력 하셨습니다";	
		}
		else {
			System.out.print("키 입력: ");
			height = sc.nextInt();	
			if (height>250 || height<0){
				result = "키를 잘못 입력하셨습니다";
				}
			else {
				if(age<12 && height<140) {
					result = "나이와 키 모두 적절치 않음";
				}
				else if(age>=13 && height<140) {
					result = "나이는 적절하나 키가 적절치 않음";
				}
				else if(age>=13 && height<140) {
					result = "키는 적절하나 나이가 적절치 않음";
				}
				else {result="탑승 가능";}
				
			}
		}
		
		System.out.println(result);
		}
	
		/*
		 * // 놀이기구 탑승 제한 검사 프로그램
// 조건 - 나이 : 12세 이상
// - 키 : 140.0cm 이상
// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
// 나이 O , 키 O : "탑승 가능"

// [실행화면]
// 나이 입력 : 130
// 나이를 잘못 입력 하셨습니다

// 나이 입력 : 30
// 키 입력 : 300
// 키를 잘못 입력 하셨습니다

// 나이 입력 : 20
// 키 입력 : 110
// 나이는 적절하나, 키가 적절치 않음

// 나이 입력 : 10
// 키 입력 : 150
// 키는 적절하나, 나이가 적절치 않음

// 나이 입력 : 10
// 키 입력 : 110
// 나이와 키 모두 적절치 않음

// 나이 입력 : 15
// 키 입력 : 160
// 탑승 가능!!!
		 * */
		
		
	}
		
		
	
		
		

		
	
	
	
