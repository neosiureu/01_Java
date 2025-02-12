package edu.kh.variable.ex2;

public class PrintExample {

	public static void main(String[] args) {
		//System.out.println(); 는 한 줄 출력을 위한 메서드 단 개행까지 포함 

		System.out.println("테스트1");
		System.out.println("테스트2");
		
		//System.out.print(); 는 개행이 없다
		System.out.print("테스트3");
		System.out.println(); // 내용 없는 println은 단순 줄바꿈
		System.out.print("테스트4");
		// 줄 바꿈 여부에서만 차이
		
		System.out.println();
		
		// printf는 꼭 필요한가?
		int inum1=10;
		int inum2=5;
		System.out.println(inum1 + " + "+ inum2 +" = " +(inum1+inum2)); // 원할한 표시가 힘들어서
		System.out.printf("%d + %d = %d\n",inum1,inum2,inum1+inum2);  // 길어지면 printf는 필수!
		System.out.println("탈출문자열 확인차원");

		//System.out.printf("%알파벳, 그 알파벳 자리에 들어갈 값이나 변수를 개수에 맞춰 콤마를 기준으로 나열");
		
		System.out.printf("%d+%d*%d/2 = %d",inum1,inum1,inum2,(inum1+inum1*inum2/2) );
		System.out.println();
		// 패턴 연습
		int inum3=3;
		System.out.printf("%d\n",inum3);
		System.out.printf("%5d\n",inum3); // 같은 숫자를 몇 칸 공간 확보 후 오른쪽 정렬하여 출력하는 방식
		System.out.printf("%-5d\n",inum3); // 같은 숫자를 몇 칸 공간 확보 후 왼쪽 정렬하여 출력하는 방식
		System.out.printf("%f\n", 10/4.0); //반올림 처리와 같은 소수점의 자리를 제어하는 방법
		// %f는 실수를 나타낼 수 있으나 소수점 6자리까지가 디폴트
		System.out.printf("%.2f\n", 10/4.0); //표시되는 소수점 자리를 바꾸기 위한 방식
		
		// 문자와 문자열, 그리고 불리언
		
		boolean isTrue = false;
		char ch = '가';
		String str = "안녕하세요";
		System.out.printf("%b / %c / %s \n",isTrue,ch,str);
		
		
		
		
		
		System.out.println("또 다른 탈출 문자열 \\ 을 치면 \\가 하나만 나옴!! \\O/");
		System.out.println("a\tb\tc\td와 같은 경우 5칸이 하나를 차지함");
		// 유니코드에 대한 탈출 문자열? 16진수로 네 자리 표시 -> 65를 hexa로 표시한 결과가 41이라서 0041
		System.out.println("\u0041");


	}

}
