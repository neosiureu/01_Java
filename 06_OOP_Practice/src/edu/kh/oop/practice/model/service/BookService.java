package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;
import edu.kh.oop.practice.run.PracticeRun;

public class BookService {
	
		public void Practice() {
	
		//1) 기본 생성자를 이용하여 첫번째 book 객체를 생성해라.
		// import java.awt.print.Book;을 해버리면 안 됨
		
		Book bk = new Book();
		// null이랑 0만 들어 있음.
		System.out.println(	bk.toString());

		
		
		Book bk2= new Book("자바의정석", 30000, 0.2, "남궁성");
		
		
		
		System.out.println(	bk2.toString());
		
		System.out.println("==================");
		System.out.println();
		System.out.println("수정된 결과 확인");
		System.out.println("==================");
		bk.setTitle("C언어"); 
		bk.setPrice(30000);
		bk.setDiscountRate(0.1);
		bk.setAuthor("홍길동");
		System.out.println(	bk.toString());
		System.out.println();
		System.out.println("==================");
		System.out.println("할인 결과: ");
		System.out.println();
		
		System.out.println("도서명 = " +bk.getTitle());
		bk.setPrice( (int) discount(bk.getPrice(), bk.getDiscountRate()) );
		System.out.println("할인 된 가격: "+ bk.getPrice()+"원" );
		System.out.println("도서명 = " +bk2.getTitle());
		bk2.setPrice( (int) discount(bk2.getPrice(), bk2.getDiscountRate()) );

		System.out.println("할인 된 가격: "+ bk2.getPrice()+"원");




		}
	
	
	public double discount(int price, double rate) {
		return price -(price* rate);
	}
	
}
