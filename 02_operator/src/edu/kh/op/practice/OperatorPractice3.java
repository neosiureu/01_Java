package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	
	public void practice1  () {
		Scanner in=new Scanner(System.in);
		double price;
		boolean membership;
		System.out.printf("가격을 입력하세요: ");
		price = in.nextFloat();
		System.out.printf("멤버십 있으세요? (있으면 true, 없으면 false 입력)  ");
		membership= in.nextBoolean();
	
		price = (membership==true) ?  (price* 0.9) :  (price*0.95);
		System.out.printf("할인을 포함한 최종 금액: %.1f원 ", price);		
	}

	
	
	public void practice2 () {
		int total, fifthThousand, tenThousand, fiveThousand, thousand;
		System.out.print("출금할 금액 입력: ");
		Scanner in = new Scanner(System.in);
		
		total= in.nextInt();
		fifthThousand= total/50000;
		System.out.println("50000원: " + fifthThousand);
		total-= 50000*fifthThousand;
		// 복합대입 연산자의 일종으로 빼기와 대입을 합쳐서 사용
		// 차라리 amout %=50000으로 한번에 처리했어도 괜찮았을 듯?
		
		tenThousand= total/10000;
		System.out.println("10000원: " + tenThousand);
		total-= 10000*tenThousand;

		fiveThousand= total/5000;
		System.out.println("5000원: " + fiveThousand);
		total-= 5000*fiveThousand;
		
		thousand= total/1000;
		System.out.println("1000원: " + thousand);
		total-= 1000*thousand;
		

		
	}

	public void practice3 () {
		int firstNumber, secondNum;
		String multiString;
		Scanner in = new Scanner(System.in);
		System.out.print("첫 번째 수:");
		firstNumber = in.nextInt();
		System.out.print("두 번째 수:");
		secondNum= in.nextInt();
		multiString = (firstNumber % secondNum ==0) ? "배수 입니다"  : "배수가 아닙니다";
		
		System.out.println(multiString);

		
	}

}
