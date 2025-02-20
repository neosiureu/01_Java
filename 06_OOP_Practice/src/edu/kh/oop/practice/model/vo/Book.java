package edu.kh.oop.practice.model.vo;

public class Book {

	private String title; // 도서 이름
	private int price;
	private double discountRate;
	private String author;

	public Book() {

	}

	public Book(String titleString, int price, double discountRate, String author) {
		this.title = titleString;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}

	@Override
	public String toString() {
		return (title + " / " + price + " / " + discountRate + " / " + author);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String titleString) {
		this.title = titleString;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
