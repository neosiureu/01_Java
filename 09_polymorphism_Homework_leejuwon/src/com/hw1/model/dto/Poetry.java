package com.hw1.model.dto;

public class Poetry extends Book {

	int  numberOfPoems;
	
	public Poetry() {
		System.out.println("시집");
	}
	
	
	public Poetry(int numberOfPoems) {
		super();
		this.numberOfPoems = numberOfPoems;
	}


	public int getNumberOfPoems() {
		return numberOfPoems;
	}


	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}


	@Override
	public void displayInfo() {
		System.out.println( String.format("[시], 제목: %s / 저자 : %s / 시집의 권수: %d", getTitle(), getAuthor(), numberOfPoems));
		
	}
	

}
