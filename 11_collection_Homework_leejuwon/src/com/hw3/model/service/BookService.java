package com.hw3.model.service;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.hw3.model.dto.Book;

public class BookService {
	ArrayList<Book> bookList = new ArrayList<Book>();
	ArrayList<Book> markedBookList = new ArrayList<Book>();

	Scanner sc = new Scanner(System.in);

	public BookService() {
		bookList.add(new Book(1111, "세이노의 가르침", "세이노",6480,"데이원"));
		bookList.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		bookList.add(new Book(3333, "역행자", "자청",17550,"웅지식하우스"));
		bookList.add(new Book(4444, "꿀벌의 예언", "베르나르베르베르", 15120,"열린책들"));
		bookList.add(new Book(5555, "도둑맞은 집중력", "요한 하리",16920,"어크로스"));	
	}
	
	public void displayMenu() {
		int choice=-1;
		do {
			System.out.println("======도서 목록 프로그램======");
			System.out.println("1. 도서 등록");
			System.out.println("2. 모든 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴를 입력 하세요: " );
			


			choice = sc.nextInt();
			
			switch (choice) {
			case 1: addBook();
				break;
			case 2: selectAllBook();
				break;
			case 3: updateBook();
				break;
			case 4: deleteBook();
				break;
			case 5: markedBookAdd();
				break;
			case 6: markedBookDelete();
				break;
			case 7: markedBookSelect();
				break;
			case 8: randomBook();
				break;
			case 0: System.out.println("프로그램을 종료하셨습니다. ");
				break;
			default:
				System.out.println("메뉴에 맞지 않습니다. 0에서 8까지 중 하나만 입력해주세요");
			} 
	
		}
		while (choice!=0);
		System.out.println("프로그램 종료");
		
	// display메뉴의 끝 중괄호	
	}
	
	void addBook() {
		System.out.println("======도서 등록======");
		System.out.print("도서 번호: ");
		int num = sc.nextInt();
		sc.nextLine();
		//인라인이 나오면 그 사이에 sc.nextLine()
		
		System.out.print("도서 제목: ");
		String title = sc.nextLine();

		System.out.print("도서 저자: ");
		
		String author = sc.nextLine();
		
		System.out.print("도서 가격: ");
		int price  = sc.nextInt();
		sc.nextLine();

		System.out.print("도서 출판사: ");
		String company = sc.nextLine();
		
		if(bookList.add(new Book(num, title, author, price, company)
				)
				) {	
			System.out.println("\n등록 완료\n");
		}
		
		else {
			System.out.println("도서 추가에 실패하셨습니다. 다시 시도해주세요 ");
		}
		

	}
	
	void selectAllBook() {
		for(Book b: bookList) {
		 System.out.println(b.toString());
		}
	}
	
	void updateBook(){
		System.out.print("수정할 도서 번호를 입력하세요: ");
		int tempBookNum = sc.nextInt();
		for(int i=0; i<bookList.size();i++) {
			if(tempBookNum == bookList.get(i).getBookNum()) {
				
				System.out.println("그 도서의 무엇을 수정하시겠습니까?");
				
				System.out.print("1. 도서 제목");

				System.out.print("2. 도서 저자: ");
				
				System.out.print("3. 도서 가격: ");

				System.out.print("4. 도서 출판사: ");

				System.out.println("0. 수정 종료");
				int choice =sc.nextInt();
				
				if(choice==1) {
					System.out.println("======도서명 수정======");
					System.out.println();
					System.out.println("도서의 새로운 이름을 입력하세요");
					String newTitle = sc.nextLine();
					bookList.get(i).setBookName(newTitle);					
				}
				
				else if(choice==2) {
					System.out.println("======도서 저자 수정======");
					String newTitle = sc.nextLine();
					
					
					
				}
				
				
				
			}
			
			else {
				System.out.println("그러한 번호와 일치하는 도서가 존재하지 않습니다. 도서번호를 다시 확인하세요.");
				return ;
				
			}
			
		}
		
		

	}

	void deleteBook() {
		System.out.print("삭제할 도서 번호를 입력하세요: ");
		int deleteNum = sc.nextInt();
		
		System.out.print("진짜 삭제하겠습니까? (Y/N) : ");
		char real = sc.next().toUpperCase().charAt(0);
		boolean flag = true;
		if(real=='Y') {
			for(int i=0; i<bookList.size(); i++) {
				if(deleteNum == bookList.get(i).getBookNum()) {
					Book tempBook = bookList.remove(i);
					flag= false;
					System.out.println("도서 "+tempBook.getBookName()+" 을 삭제하셨습니다. 감사합니다.");
					break;
				}
			}
			if(flag) {
				System.out.println("일치하는 번호가 없어 삭제에 실패하셨습니다! ");
			}
			

		}
		else {System.out.println("삭제에 실패하셨습니다. ");
}
		


		
	}
	

	void markedBookAdd() {
		System.out.println("======= 도서 번호를 안다면 즐겨찾기 할 도서 목록에 책을 추가할 수 있습니다======");
		System.out.print("추가할 도서 번호를 입력하세요");
		int num = sc.nextInt();
		sc.nextLine();
		boolean flag= true;
		for(int i=0; i<bookList.size(); i++) {
			if(num==bookList.get(i).getBookNum()) {
				markedBookList.add(bookList.get(i));
				flag=false;
				System.out.println(bookList.get(i).getBookName()+"이 추가되었습니다. 감사합니다");
				break;
				
			}
			
			if(flag) {
				System.out.println("해당하는 번호의 도서가 존재하지 않습니다. 도서 번호를 다시 확인해주세요");
			}
		}
		

	
		


	}


	void markedBookSelect() {
		for(Book b: markedBookList) {
			 System.out.println(b.toString());
			}
	}

	void markedBookDelete() {
		System.out.print("즐겨찾기로부터 삭제할 도서 번호를 입력하세요: ");
		int deleteNum = sc.nextInt();
		
		System.out.print("진짜 삭제하겠습니까? (Y/N) : ");
		char real = sc.next().toUpperCase().charAt(0);
		boolean flag = true;
		if(real=='Y') {
			for(int i=0; i<markedBookList.size(); i++) {
				if(deleteNum == markedBookList.get(i).getBookNum()) {
					Book tempBook = markedBookList.remove(i);
					flag= false;
					System.out.println("도서 "+tempBook.getBookName()+" 을 삭제하셨습니다. 감사합니다.");
					break;
				}
			}
			if(flag) {
				System.out.println("일치하는 번호가 없어 삭제에 실패하셨습니다! ");
			}
			

		}
		else {System.out.println("삭제에 실패하셨습니다. ");}
	}
	
	void randomBook() {
		System.out.println("랜덤으로 한 책을 선택합니다");
		Random r = new Random();
		int randomBookSize= r.nextInt(bookList.size());
		System.out.println(bookList.get(randomBookSize).getBookName()+ " author by " +bookList.get(randomBookSize).getAuthor());
	}

}
