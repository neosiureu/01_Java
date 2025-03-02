package com.hw4.model.service;

import java.util.Scanner;

public class ToyService {
	Scanner sc = new Scanner(System.in);
	
	public void displayMenu() {
		int choice=-1;
		do {
			System.out.println("<<<<    플레이타임 공장  >>>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일순으로 조회하기");
			System.out.println("5. 연령별 사용가능한 장난감리스트 조회하기");
			System.out.println("6. 재료추가");
			System.out.println("7. 재료제거");
	
			
			System.out.print("메뉴를 입력 하세요: " );
			


			choice = sc.nextInt();
			
			switch (choice) {
			case 1: selectToy();
				break;
			case 2: //createToy();
				break;
			case 3: // deleteToy();
				break;
			case 4: // selectToyByDate();
				break;
			case 5:  // selectToyByAge() ;
				break;
			case 6: // addMaterial();
				break;
			case 7:  // deleteMaterial();
				break;
		
			case 0: System.out.println("프로그램을 종료하셨습니다. ");
				break;
			default:
				System.out.println("메뉴에 맞지 않은 선택지입니다.. 0에서 7까지 중 하나만 선택 해주세요");
			} 
	
		}
		while (choice!=0);
		System.out.println("프로그램 종료");
		
		
		
		
	// display메뉴의 끝 중괄호	
	}
	
	public void selectToy() {
		
	}

	
	
}
