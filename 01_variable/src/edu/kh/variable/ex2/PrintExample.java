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
		System.out.printf("%d + %d = %d",inum1,inum2,inum1+inum2);  // 길어지면 printf는 필수!
		
		//System.out.printf("%알파벳, 그 알파벳 자리에 들어갈 값이나 변수를 개수에 맞춰 콤마를 기준으로 나열");



		

		
	}

}
