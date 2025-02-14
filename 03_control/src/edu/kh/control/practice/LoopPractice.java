package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1 () {
		
		System.out.print("1 이상의 수를 입력하세요: ");
		int num = sc.nextInt();
		if(num>=1) {
			for(int i=1; i<=num;i++) {
				System.out.print(i+" ");

			}
		}
		else {
			System.out.println("1 이상의 숫자를 입력하라고 내가 말했지^^");

		}

		
	}

	
	public void practice2 () {
		
		System.out.print("1 이상의 수를 입력하세요: ");
		int num = sc.nextInt();
		if(num>=1) {
			for(int i=num; i>=1 ;i--) {
				System.out.print(i+" ");

			}
		}
		else {
			System.out.println("1 이상의 숫자를 입력하라고 내가 말했지^^");

		}

		
	}
	

	public void practice3 () {
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		int sum=0;
			for(int i=1; i<=num;i++) {
				sum+=i;
			}
		
			for(int i=1; i<=num; i++) {
				System.out.print(i);
				if(i<num)
				System.out.print("+");
			}
			System.out.println("="+sum);

	


		
	}

	
	public void practice4 () {
	
		System.out.println("1 이상의 두 수를 입력하세요! ");
		System.out.print("첫 번째 숫자: ");
		int num1= sc.nextInt();
		System.out.println();
		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();
		System.out.println();

		if(num1<1 || num2<1) {
			System.out.println("1 이상의 숫자를 입력하라고 내가 말했지^^");			
		}
		else {
			if(num1>num2) {
				for(int i=num2; i<=num1; i++) {
					System.out.print(i+" ");

				}
			}
			else if (num1<num2) {
				for(int i=num1; i<=num2; i++) {
					System.out.print(i+" ");
				}
			}
			else { System.out.print(num1);
}

		}

	}

	
	public void practice5 () {
		System.out.print("단을 알고 싶은 숫자: ");

		int dan = sc.nextInt();
		
		System.out.println("=========="+ dan+"단 ==========");

		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i , dan*i);
		}
		
	}

	
	
	public void practice6 () {
		System.out.print("단을 알고 싶은 최소 숫자: ");

	
		int startDan = sc.nextInt();
	
		if(startDan>=2 && startDan<=9) {
		for(int i= startDan; i<=9; i++ ) {
		
		System.out.println("=========="+ i+"단 ==========");

		for(int j=1; j<=9; j++) {
			System.out.printf("%d * %d = %2d\n", i, j , i*j);
			}
		}
		
		}
		
		else {
			System.out.println("그런 단은 없습니다!! 2부터 9 사이에서 입력하셔야죠!! ");
		}
	}

	
	
	public void practice7 () {

		System.out.print("최대 별의 개수: ");

		int num= sc.nextInt();
	
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");

			}
			System.out.println();

		}
	}

	
	
	public void practice8 () {

		System.out.print("최대 별의 개수: ");

		int num= sc.nextInt();
	
		for(int i=num; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");

			}
			System.out.println();

		}
		
	}
	
	
	
	public void practice9  () {
	
		System.out.print("최대 별의 개수: ");

		int num= sc.nextInt();
	
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");

			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");

			}
			System.out.println();

		}
	}
	
	
	
	public void practice10 () {
		System.out.print("최대 별의 개수: ");

		int num= sc.nextInt();
	
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		

		for(int i=num; i>=1; i--) {
			for(int j=i-1; j>=1; j--) {
				System.out.print("*");

			}
			System.out.println();

		}
	}
	
	
	
	public void practice11 () {
		System.out.print("최대 별의 개수: ");

		int num= sc.nextInt();
	
		
		for(int i=1, l=0; i<=2*num-1; i+=2, l++) {
			for(int k=num-l; k>=1; k--) 
			{
				System.out.print(" ");
			}
		
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}	
			System.out.println();

		}
	}


	public void practice12 () {
		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		for(int i=1; i<=num; i++) {
			if(i==1 || i==num) {
			for(int j=1; j<=num; j++) {
				System.out.print("*");
				}
			}
			else {
				System.out.print("*");

				for(int k=1; k<=num-2; k++ ) {
				System.out.print(" ");
				}						
				System.out.print("*");
			}
			System.out.println();

		
		
	}
		
	
	}
	
	public void practice13 () {
		System.out.print("자연수 하나를 입력하세요: ");
		int gongbasu=0;
		int num=sc.nextInt();
		for(int i=1; i<=num; i++) {
			if(i%2 ==0 && i%3==0 ) {
				gongbasu++;
				}
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("count: " + gongbasu);
	}
}

