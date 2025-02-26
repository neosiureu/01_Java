package edu.kh.poly.ex2.run;

import edu.kh.poly.ex2.model.service.Calculator;
import edu.kh.poly.ex2.model.service.HGDcalculator;
import edu.kh.poly.ex2.model.service.LJWcalculator;

public class AbstractRun {

	public static void main(String[] args) {
		
		Calculator cal = new LJWcalculator();
		System.out.println( "합: " + cal.plus(20, 30) );
		System.out.println( "차: " + cal.minus(20, 30) );
		System.out.println( "곱: " + cal.multiple(20, 30) );
		System.out.println( "몫: " + cal.divide(20, 30) );


		/*
		 * 
		 * 인터페이스 = 미완성 설계도 , 즉 객체 생성은 직접 해당 타입으로 불가능하다.
하지만 참조변수의 타입으로는 사용 가능하다.

코드의 큰 수정 없이 객체를 생성할때의 코드만 바꾸면 새로운 클래스에 대한 코드를 수행할 수 있다.

인터페이스의 장점이자 특징

1) 인터페이스를 부모 참조변수로 사용하면 다형성 중 업캐스팅이 적용되어 (앞에 이니셜만 바꾸면 다른 객체를 가리키게 됨) 상속받은 모든 클래스를 자식 객체로 사용할 수 있다.
=> 이를 이용하여 메인 코드의 수정은 최소화


<br>

2) 자식 클래스에게 공통된 메서드들을 주기 때문에 모든 자식클래스 형태에 통일성이 생김
이를 이용하여 팀프로젝트에 필요한 개발 환경을 조성할 수 있다.

만약 추상클래스이기만 했다면 abstract가 아닌 메서드나 변수가 있을 수 있으므로 자식들이 아무렇게나 구현할 수 있다. 그러면 여러 자식이 상속받을수록 통일성이 떨어질 것이다.

		 * */
		
	}

}
