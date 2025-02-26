package com.hw1.model.dto;

public class TextBook extends Book {
	String subject;
	public TextBook() {
		// TODO Auto-generated constructor stub
	}
	public TextBook(String subject) {
		super();
		this.subject = subject;
	}
	@Override
	public void displayInfo() {
		System.out.println( String.format("[전문서적], 제목: %s / 저자 : %s / 과목: %s", getTitle(), getAuthor(), subject));
		
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	

}
