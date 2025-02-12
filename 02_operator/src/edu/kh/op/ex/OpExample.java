package edu.kh.op.ex;

import java.util.Scanner;

// 이 클래스는 메서드 내용만 담도록 한다
public class OpExample {
	// 실행용 클래스와 예제 코드 작성 클래스를 따로 만들자
	// 파일당 클래스에 해당하는 메서드를 만들어 해당 기능만 가지고 main에 사용할 것
	// 실행용 클래스에는 main함수가 있겠지. 각 예제에서 만든 메서드를 메인 메서드 내에서 호출하면 됨
	
	// ex1()메서드: OpExample이라는 클래스에 포함된 메서드
	public void ex1() { //어디서든 ctrl+ ex1을 클릭하면 여기로 옴
		// 증감 연산자
		// ++는 1을 더하고 --는 1을 뺀다
		int iNum1 =10;
		int iNum2 =10;
		iNum1++;
		iNum2--;
		System.out.println("iNum1 : "+ iNum1);
		System.out.println("iNum2 : "+ iNum2);
		// 다만 앞에 붙으면 먼저 더하거나 빼고 뒤에 붙으면 후에 더하거나 뺌
		int temp1=5;
		System.out.println(++temp1+5);
		int temp2=3;
		System.out.println("temp2의 값은 여기서"+(temp2-- +2)); 
		// 다른 모든 연산보다 늦게 3에서 2로 변함
		System.out.println("temp2의 값은 여기서"+temp2);
		
		int a=3, b=5;
		int c= a++ + --b;
		//최종 적으로 a와 b, c의 값을 구하시오
		
		System.out.printf("a는 %d b는 %d c는 %d\n", a,b,c);
		// 예상 값 a= 4 b= 4 c= 7	

	}
	public void ex2 () {
		
		//비교 연산자: < > <= >= == !=
		// 리턴 값은 언제가 0과 1
		int a=10;
		int b=20;
		System.out.println( (a == b) == false ); // a와 b가 같은 것이 거짓인가? 그렇다
		int c=4, d=5;
	
		System.out.println( (++c != d) == (--c != d) );
		// 좌항: false이며 우항: true 
		
		System.out.println(100>99);
		System.out.println(100>99 && 90>=98 || a>b);


	}
	public void ex3 () {
		// 논리연산자 && (둘 다 참일때 만 참) || (둘 중 하나만 참이어도 참)
		
		// ~와, 그리고, 면서, 부터, 까지, 사이 등의 문장이 나오면 and 논리연산자를 생각해
		
		int a=101;
		//a가 100이상이면서 짝수인지 묻고 싶다
		System.out.println( "a가 100이상이면서 짝수인가?  "+ ( (a>=100) && (a%2==0)));
		
		int b=5;
		//b는 1부터 10까지 숫자 범위에 포함되어 있는가?
		System.out.println("b는 1부터 10까지 숫자 범위에 포함되어 있는가?"+ ( (b>=1) && (b<=10)));
		
		// 또는 혹은 거나가 나오면 or를 생각해
		int c =10;
		System.out.println("c가 10을 초과하거나 짝수인가? " + ((c>10) || (c%2==0)));


		
		
	}

	public void ex4 () {
	// 삼항 연산자: 조건식 ? true일 때 실행 될 코드 : false일 때 실행 될 코드
	int num=30;
	
	String result =  num > 30 ? "num은 30을 초과하는 수": "num은 30이하의 수";
	System.out.println(result);
	
	// 입력받은 정수가 양수(0포함)인지 음수인지 구분하라
	
	Scanner in=new Scanner(System.in);
	System.out.print("정수 입력: ");
	int tmp = in.nextInt();
	String isPlus = tmp>=0 ? "양수입니다" : "음수입니다";
	System.out.println(isPlus);
	}
	
}
