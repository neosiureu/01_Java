package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.dto.Animal;
import edu.kh.poly.ex2.model.dto.Fish;
import edu.kh.poly.ex2.model.dto.Person;

public class AbstractService {
	public void ex1 () {

		Person p1=new Person();
		p1.setName("이주원");
		p1.setType("척추동물 - 인간");
		p1.setEatType("잡식");
		
		Fish f1=new Fish();
		f1.setType("척추동물 - 어류");
		f1.setEatType("초식");
		
		
		// Animal 추상클래스는 직접 객체로서 만들 수 없음
		// Animal a1=new Animal();

		// 다만 부모타입 참조변수로서의 역할은 가능하기 때문에
		// Animal을 상속받아 미완성 부분을 구체적으로 구현한
		// Person Fish를 이용하면 객체를 생성할 수 있다.
		
		System.out.println(p1.toString());
		System.out.println(f1.toString());
		
		Animal a1=new Person(); 
		// Person 객체가 마치 부모인 Animal인 척 가능
		Animal a2=new Fish(); // 다형성 업 캐스팅을 이용
		// Fish 객체가 마치 부모인 Animal인 척 가능
	
		
		// Person이지만 Animal클래스인척 하고 있음
		a1.ex(); 
		a1.breath();
		a1.move();
		a1.eat();
		((Person)a1).getName();

		// 정적바인딩으로는 animal에 있던 이 함수들이 실행될 것 같지만
		// 동적바인딩이 실제로 되기 때문에 제대로 자식 타입으로 나온다
		// 자식 객체에서의 오버라이딩 된 것들이 우선이기 때문
		
		// Fish이지만 Animal클래스인척 하고 있음

		a2.ex();
		a2.breath();
		a2.move();
		a2.eat();

		
	}
	

}
