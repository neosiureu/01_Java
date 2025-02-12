package edu.kh.variable.ex1;
import java.util.ArrayList;
public class VariableExample2 {
	public static void main(String[] args) {
		boolean boolData; //선언부
		// 메모리에 논리 값을 저장 할 공간을 1바이트 할당하고 그 공간의 이름을 boolData라고 부를 것
		boolData = true; //boolData 변수에 값을 대입하는 대입부
		
		System.out.println("불리언 데이터의 값은"+ boolData);
		byte byteNum = 127; // 메모리에 정수 값을 저장 할 공간을 1바이트 크기 만큼 할당하며, 그 공간을 byteNum이라는 이름으로 부르겠음
		// 또한 선언 된 byteNum 변수에는 처음에 127을 넣겠다 (변수의 초기화)
		
		//byte byteNum2 = 128; 
		// 값의 표현 가능 범위인 -128~127을 벗어나기 때문
		byte byteNum2 = -128;
		
		short shortNum = 32767;
		//short shortNum2 = 32768;
		
		int    intNum  =            2147483647;
	//  자료형 변수명  대입연산자      리터럴
		
		
		// int intNum2 = 2147483648;
	
		//long longNum = 10000000000;
		long longNum2 = 10000000000L;
		
		
		//float floatNum = 1.2345;
		float floatNum2 = 1.2345F;
		
		char ch = 'A';
		//char ch2= "A";
		char ch2=66;
		System.out.println("ch의 값은 " + ch);
		System.out.println("ch2의 값은 " + ch2);

		
		
		/*
		 * 
		 * 1) case sensitive

2) reserved word is forbidden (상식적으로 사고)

3) 숫자로 시작 불가

4) 특수기호의 경우 언더바와 달러 표시만 사용 가능하나 일반적인 변수에서는 사용하지 않는 것을 습관화 한다.
(언더바를 작성하는 표기법은 자바의 상수에서 사용하거나 DB를 다룰 때 쓰게 된다
DB, 상수에서는 대문자만 사용해 camel case로 구분할 수 없기 때문)

5) camel case

6) 변수명은 이론상으로 언어를 가리지 않으나 영어로만 쓴다

		 * */
		

		//----------------------------------------//
		
		
		// 상수의 정의: 한 번 만 저장하면 상자에 값을 덮어쓸 수 없는 메모리
		// 상수의 선언법: final을 맨 앞에 붙이면 됨
		// 대문자로 표기 
		//final int NUM =100;
		// Num=120;
		// 메모리에 공간을 할당하는 것이므로 상수는 변수의 일종이나 한 번 값이 초기화 되면 다른 값을 재 대입할 수 없다.
		
		
		//final int std;
		//std=29;
		
		//final int MIN_AGE=1;
		//final int MAX_AGE=130;
		//final int LEFT_MOVE=-1;
		//final int RIGHT_MOVE=1;
		

		
		
		
		
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			x.add(2*i+1);
		}

		
		
		int a=290;
		byte b = (byte) a;
		//System.out.println(a);
		System.out.println(b);


		
		
		
	}

}
