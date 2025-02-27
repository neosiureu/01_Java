package edu.kh.generics;

import java.util.ArrayList;

// 제네릭클래스로 이를 선언해보자

public class Box <T> {
	// T의 이름은 타입 파라미터. 
	// 실제 Box가 사용될 때 String이나 Interger등으로 그 타입이 변환 됨
	
	
	private T item; //T타입 변수 선언

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
	
	
	
}
