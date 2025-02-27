package edu.kh.generics;

public class Run {
	public static void main(String[] args) {
		
		Box <String> sBox = new Box();
		// T는 이제부터 String입니다
		// 필드 getter setter의 사용되는 타입이 전부 String
		
		sBox.setItem("안녕 제네릭");
		System.out.println(sBox.getItem());
		
		Box <Integer> iBox = new Box <Integer>();		
		
		// 우변 타입을 생략 가능하다
		// 다이아몬드 연산자: 컴파일러가 좌변을 보고 우변의 타입을 추론한다
		
		iBox.setItem(5);
		System.out.println(iBox.getItem());
		
		/*
		 * 제네릭은 래퍼런스 타입만 허용하는데 기본 자료형인 int double char등은 사용할 수 없다.
		 * 이를 해결하기 위해 Wrapper 클래스를 사용한다
		 * Wrap = 감싸다, 포장하다
		 * int형만 Integer로 바꾸게 되고
		 * char를 Character로 바꾸면 된다
		 * 나머지는 맨 앞글자만 대문자로 바꾸면 똑같은 자료형을 래퍼런스로 가져올 수 있다
		 * */
		
		int num=10;
		Integer num1 =num;
		int num2 = num1;

		/*
		 * 원래는 int가 래퍼런스 타입으로 바뀌었기 때문에 오류가 나야 정상이지만 그렇지 않다

기본 자료형의 값을 자동으로 wrapping해주는 것을 auto boxing이라 한다

기본 자료형에서 wrapper클래스로 자동 변환해준다. 이를 auto boxing 그 반대 개념을 auto unboxing이라 부른다.
		 * */
		
		int num3 = Integer.parseInt("999");
		System.out.println(num3);

		
	}

}
