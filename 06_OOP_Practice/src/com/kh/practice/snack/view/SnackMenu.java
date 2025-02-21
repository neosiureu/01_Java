package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;
import com.kh.practice.snack.model.vo.Snack;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();
	
	
	
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류: ");
		String tmpKind = sc.nextLine();
	
		System.out.print("이름: ");
		String tmpName= sc.nextLine();
		
		
		System.out.print("맛: ");
		String tmpFlavor = sc.nextLine();
		
		System.out.print("개수: ");
		int tmpNumof = sc.nextInt();
		
		System.out.println("가격: ");
		int tmpprice= sc.nextInt();

		// Snack s= new Snack(tmpKind, tmpName, tmpFlavor, tmpNumof, tmpprice);

		
		System.out.println(
				scr.saveData(tmpKind,tmpName, tmpFlavor, tmpNumof, tmpprice )
				
				);

		System.out.println(scr.confirmData());

		

		
		
	}
	
	
	

}
