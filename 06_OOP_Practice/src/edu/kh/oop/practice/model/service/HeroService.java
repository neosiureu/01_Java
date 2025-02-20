package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void practice () {
		
		Hero h1 = new Hero("이구역짱", "전사", 200,20, 1, 0.0);
		System.out.println();
		Hero h2 = new Hero("지존위자드", "마법사", 100,100, 1, 0.0);
		System.out.println();

		System.out.println("==========="+h1.getNickname()+"의 시점"+"===========");
		h1.attack(100);
		h1.attack(50.5);
		h1.attack(49.5);
		h1.dash();
		h1.dash();
		h1.dash();
		System.out.println();

		System.out.println(		h1.toString());

		
		System.out.println();

		
		System.out.println("==========="+h2.getNickname()+"의 시점"+"===========");

		h2.attack(300);
		h2.dash();
		h2.attack(300);
		h2.attack(300);
System.out.println();

		System.out.println(		h2.toString());

		
	}
	
	

}
