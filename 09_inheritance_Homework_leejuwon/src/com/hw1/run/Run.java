package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.TextBook;

public class Run {

	public static void main(String[] args) {

		Book b[] = new Book[3];
		b[0] = new Novel("판타지");
		b[0].setTitle("해리 포터");
		b[0].setAuthor("JK롤링");
		
		
		b[1] = new Poetry(30);
		b[1].setAuthor("김소월");
		b[1].setTitle("우리들의 사랑 시");
		
		b[2] = new TextBook("CS");
		b[2].setAuthor("제임스 고슬링");
		b[2].setTitle("자바 프로그래밍");
		
		
		((Novel)b[0]).displayInfo();
		((Poetry)b[1]).displayInfo();
		((TextBook)b[2]).displayInfo();

		
				

		
	}

}
