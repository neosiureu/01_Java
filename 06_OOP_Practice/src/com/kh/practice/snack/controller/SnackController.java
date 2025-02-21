package com.kh.practice.snack.controller;

import java.util.Scanner;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	Snack s = new Snack() ; 
	public String saveData(
			String kind, String name, 
			String flavor, int numOf
			, int price) {
		s.setFlavor(flavor);
		s.setKind(kind);
		s.setName(name);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return s.information() +"저장완료 되었습니다"; 
	}
	
	public String confirmData() {
		 System.out.println("저장된 정보를 확인하시겠습니까? (y/n으로만 대답해주세요)"	);
		 Scanner in = new Scanner(System.in);
		 char yn= in.next().charAt(0);
		 if(yn=='y'|| yn== 'Y') {
			 
			 return s.getKind()+"( "  + 
			 s.getName()+ " - " + 
					 s.getFlavor()+ 
					 " )"+ s.getNumOf() + 
					 " 개 " + 
					 s.getPrice()+" 원";

		 }
		 
		 else if(yn=='n'|| yn== 'N') 
		 
		 {
			 return " ";

			 
		 }
		 
		 else {
			 return "y나 n만 입력해달라고!!";
		 }
	
	}
	
	;
}
