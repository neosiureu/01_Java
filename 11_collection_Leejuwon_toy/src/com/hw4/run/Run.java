package com.hw4.run;

import com.toyFactory.model.ToyService;

public class Run {

	public static void main(String[] args) {

		new ToyService().displayMenu();

		// 마지막에 재료가 두개 이상인 경우가 있음. 또는 하나일 수도 있음 
		// => 새로운 장난감 만들기 역시 여러 재료를 넣을 수 있어야 함. 하지만 하나일 수 있음 
		// 재료부분을 추가할 때는 메서드를 작성해야 하는데 addMaterials => 재료가 몇 개 들어올지 정해져 있지 않다 => 전달인자가 몇 개인지 정해져 있지 않다? 
		// 따라서 가변인자를 이용한다 int...변수명과 같이 쓴다 (OOP- method 부분 참조)
		// int...nums라고 하면 몇 개일지 모를 int자료형이 들어가는 것이다. 이를 이용해야만 한다
		
		
		
	}

}
