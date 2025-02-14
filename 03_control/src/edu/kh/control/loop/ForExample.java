package edu.kh.control.loop;

import java.util.*;

// 기능 제공용 메서드이며 메인 함수가 없어 실행용은 따로 만들 것

public class ForExample {
	Scanner sc = new Scanner(System.in);

	public void ex1 () {
		for (int i=1 //초기식
				; i<=10 //조건식 
				;i++ // 증감식
				) {
			System.out.print(i+" ");
			}
		
	}
	
	public void ex2 () {
		//영어 알파벳 A에서 Z를 한 줄로 출력해라
		for (char i='A'; i<='Z'; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();

		
		for(int i= 'A'; i<='Z'  ; i++) { //char가 int로 자동 형변환되기 때문에 이러한 비교식이 가능
			System.out.print( (char)i + " ");
			// int는 char로 자동 형변환될 수 없기에 강제 type casting을 해야
		}
		
	}

	public void ex3 () {
		//1부터 입력받은 수까지 1씩 증가하며 출력하자
		System.out.print("숫자 하나를 입력해보세요: ");

		int input = sc.nextInt();
		
		for (int i=1; i<=input; i++) {
			System.out.println(i+" ");
		}
		
	}
	
	public void ex4 () {
		// 정수 5개를 입력받아 그 합을 구하라
		System.out.print("배열의 개수는? : ");
		int size = sc.nextInt();
		int[] ex= new int[size];
		for (int i=0;i<5;i++) {
			ex[i]=i+1;
		}
		int sum=0;
		
		for(int i:ex) {
		System.out.print("입력"+i+" : " );
		int input = sc.nextInt(); //for의 괄호 안에서 만들어진 변수 input은 
		// 그 중괄호 밖에서는 사용될 수 없다.
		sum+=input;
		}
		System.out.println("총 합은"+sum);
		
	}
	
	public void ex5 () {
		// 1부터 20까지 1씩 증가하며 출력하되 입력받은 수의 배수는 양쪽에 괄호를 표시하게 한다
		// 괄호를 표시할 배수를 입력 받으면 그 숫자의 배수는 ()로 감싼 채 출력한다.
		System.out.print("어떤 수에 대해 괄호를 표시하시겠습니까?: ");	
		int num= sc.nextInt();
		for (int i=1; i<=20; i++) {
			if(i%num==0) {
				System.out.print("(");
			}
			
			System.out.print(i);
			if(i%num==0) {
				System.out.print(")");
			}
			System.out.print(" ");

		}
		System.out.println();

		for (int i=1; i<=20; i++) {
			if(i%num==0) {
				System.out.print("("+ i +")"+" ");
		
		}
			else {System.out.print(i+" ");}

		}
		
		int[] arr = new int[20];

		// 배열 초기화
		for (int i = 0; i < arr.length; i++) {
		    arr[i] = i+1; // 1부터 20까지 저장
		}
		System.out.println();
		
		for(int i:arr) {
			if(i%num==0) {
				System.out.print("("+i+") ");
			}
			
			else { System.out.print(i+" ");}
			
			
		}
	

	}
	
	public void ex6 () {
		// 구구단 출력하기: 2부터 9가 아니면 해당 단을 출력하되 입력받은 수가 2에서 9 사이의 숫자가 아니면 "잘못 입력하셨습니다 출력
		System.out.print("단 입력: ");
		int dan= sc.nextInt();
		
			if(dan>=2 && dan<=9) {
				for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d \n", dan,i, dan*i); //미리 예시 하나를 붙여넣고 나중에 %d로 고치자
				}
			}
			else {
				System.out.println("잘못 입력 하셨습니다. 2에서 9 사이의 수를 입력해주세요!!");

			}
		}
	public void ex7 () {
		// 입력 받은 수의 배수와 총 개수
		int input, sum=0, count=0, limit;
		String result="";
		System.out.printf("몇의 배수가 궁금하십니까?: ");
		input = sc.nextInt();
		System.out.printf("최대 몇 까지의 합이 궁금하십니까?: ");
		limit = sc.nextInt();
		for (int i=1; i<=limit; i++) {
			if(i%input==0) {
				count++;
				sum+=i;
				result+=i+ " ";
			}
		}
		
		System.out.printf("%s : %d \n ",result, count);
		System.out.printf("%d의 배수 합계 %d ", input,sum);
		
	}
	

	public void ex8 () {
		// 구구단을 전부 출력해보자.
		for(int dan=2; dan<=9; dan++) {
			for(int num=1; num<=9; num++) {
				System.out.printf("%d x %d = %2d  ", dan, num, dan*num);
			}
			System.out.println();
		}
	}
	
	public void ex9 () {
		for (int i=9; i>=2; i--) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d= %2d  ",i,j,i*j);
			}
			System.out.println();
		}
		
	}
	
}

/*
 * class Tv { int channel; String color; double volumn; boolean onOff = false;
 * 
 * public Tv() { onOff = !onOff; if(onOff == true) {
 * System.out.println("티비가 켜졌습니다.");
 * 
 * } else { System.out.println("티비가 꺼졌습니다.");
 * 
 * }
 * 
 * }
 * 
 * public int getChannel() { return channel; } public String getColor() { return
 * color; } public double getVolumn() { return volumn; }
 * 
 * public void setChannel(int channel) { this.channel = channel; }
 * 
 * public void setColor(String color) { this.color = color; }
 * 
 * public void setVolumn(double volumn) { this.volumn = volumn; }
 * 
 * 
 * 
 * }
 */


