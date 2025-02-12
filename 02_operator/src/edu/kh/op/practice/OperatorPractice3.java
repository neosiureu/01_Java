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
		int total, fiveman, man, fiveth, th;
		System.out.println("출금할 금액 입력: ");
		Scanner in = new Scanner(System.in);
		
		total= in.nextInt();
		fiveman= total/50000;
		System.out.println("50000원: " + fiveman);
		total-= 50000*fiveman;
		
		
		man= total/10000;
		System.out.println("10000원: " + man);
		total-= 10000*man;

		fiveth= total/5000;
		System.out.println("5000원: " + fiveth);
		total-= 5000*fiveth;
		
		th= total/1000;
		System.out.println("1000원: " + th);
		total-= 1000*th;
		

		
	}

	public void practice3 () {
		int firstNum, secondNum;
		String basuString;
		Scanner in = new Scanner(System.in);
		System.out.print("첫 번째 수:");
		firstNum = in.nextInt();
		System.out.print("두 번째 수:");
		secondNum= in.nextInt();
		basuString = (firstNum % secondNum ==0) ? "배수 입니다"  : "배수가 아닙니다";
		
		System.out.println(basuString);

		
	}

}
