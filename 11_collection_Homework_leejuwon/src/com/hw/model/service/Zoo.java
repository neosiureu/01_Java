package com.hw.model.service;

import java.util.ArrayList;

import com.hw.model.dto.Animal;

public class Zoo {
	ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public Zoo() {
		// TODO Auto-generated constructor stub
	}
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	public void showAnimals() {
		for(Animal a : animals ) {
			a.sound();
		}
	}
	
	public void displayMenu() {
		System.out.println("******  KH 동물원  ******");
		System.out.println("원하는 작업을 선택하세요: ");
		System.out.println("1. 동물들의 울음소리 듣기 ");
		System.out.println("2. 종료 ");
		System.out.print("선택: ");


	}

}
