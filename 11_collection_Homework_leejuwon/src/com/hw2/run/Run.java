package com.hw2.run;

import java.util.Scanner;

import com.hw.model.dto.Monkey;
import com.hw.model.dto.Tiger;
import com.hw.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zoo z = new Zoo();
		z.addAnimal(new Tiger());
		z.addAnimal(new Monkey());
		
		int choice = 0;
		
		do {

			z.displayMenu();
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			// z.displayMenu();
			switch (choice) {
			case 1: 
				{System.out.println("동물들의 울음소리를 들어보세요: ");
				z.showAnimals();
				break;}
			case 2: break;
			default:
				System.out.println("메뉴에 맞지 않습니다. 1이나 2만 입력해주세요");
			} 
		

		}
		while (choice!=2);
		System.out.println("프로그램 종료");

	}
	
}
		
