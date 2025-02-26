package com.hw1.model.dto;

public class Novel extends Book  {
	String genre;
	
	public Novel() {
		// TODO Auto-generated constructor stub
	}

	public Novel(String genre) {
		super();
		this.genre = genre;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	
	
	
	@Override
	public void displayInfo() {
		System.out.println( String.format("[소설], 제목: %s / 저자 : %s / 장르 : %s", getTitle(), getAuthor(), genre));

		
	}
	
	
	

}
