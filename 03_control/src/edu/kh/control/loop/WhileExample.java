package edu.kh.control.loop;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileExample {
	
	
	ArrayList<String> menues = new ArrayList<String>();
	ArrayList<Integer> nums = new ArrayList<Integer>();
	
	/*
	 * 별도의 초기식과 증감식 없이 반복 종료 조건을 자유롭게 설정하는 반복문
	 * 
	 * 반복 조건이 false가 되는 경우 반복이 종료되므로 정해진 반복 횟수를 직관적으로 모를 때 사용
	 * 
	 * 
	 * */
	Scanner sc = new Scanner(System.in);
	
	public void ex1 () {
		int input = 9;
		
		while (input!=0) {
			System.out.println("--------- 메뉴 리스트 ---------");
			System.out.println("1. 떡볶이");
			System.out.println("2. 쫄면");
			System.out.println("3. 김밥");
			System.out.println("0. 종료");
			System.out.print("메뉴를 선택해 주세요: ");
			input= sc.nextInt();
			
			switch (input) {
			case 1: 
				System.out.println("떡볶이를 주문했습니다.");
				menues.add("떡볶이");
				break;
			case 2: 
				System.out.println("쫄면을 주문했습니다.");
				menues.add("쫄면");
				break;
			case 3: 
				System.out.println("김밥을 주문했습니다.");
				menues.add("김밥");
				break;
			case 0: 
				System.out.println("더 주문하실 것이 없으시군요.");
				break;
			default:
				System.out.println("잘못 선택 하셨습니다.");
				System.out.println("메뉴 번호를 잘 보시고 선택해주세요 !! ");

			}
			
			
			
		}

		
	}

	
	public void ex2 () {
		// 입력되는 모든 정수의 합을 구하되 0이 입력되면 반복 종료 후 결과를 출력한다.
		
		int input =0; // 입력받은 당시의 값을 저장할 변수
		// do while을 쓰지 않으면 수행 자체가 안 되도록 하는 코드
		int sum=0; // 마지막에 출력 할 합계를 저장할 변수
		do {
			// 절대 한 번은 수행되게 되는 코드. 처음에 들어온 값이 설령 0이라 해도!!
			System.out.print("정수 입력: ");
			input = sc.nextInt();
			sum+=input;
			if(input!=0)
			nums.add(input);
		} while (input!=0);
		
		System.out.println("0을 누르셔서 종료되었습니다.");
		System.out.println("총합: " + sum);
		System.out.println(nums);

		


	}

}
