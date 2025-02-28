package com.hw3.model.dto;

public class Book {
	private int bookNum;
	private String bookName;
	private String author;
	private int price;
	private String company;



	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookNum, String bookName, String author, int price, String company) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.company = company;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "[도서 제목=" + bookName + ", 도서 저자=" + author + ", 도서가격=" + price + ", 출판사=" + company + "]";
	}

	
	
	
	
	
}
