package edu.kh.variable.ex1;


public class VariableExample1 {
	
	public static void main(String[] args) {
		
		System.out.println("반지름이 5인 원의 둘레는" + 2*3.141592*5);
		System.out.println("반지름이 5인 원의 넓이는" + 3.141592*5*5);
		System.out.println("반지름이 5인 원기둥의 부피는" + 3.141592*5*5*20);
		System.out.println("반지름이 5인 구의 겉넓이는" + 4* 3.141592*5*5);

		System.out.println("-------------------------------------");

		double pi = 3.141592; // 원주율의 변수화
		int r=5;
		int h = 20;
		
		/* variable
		 * 정의: 메모리 (RAM)에서 값을 기록하는 space
		 * 해당 값이 변할 수 있기 때문에 변수라고 함
		 * 변수는 여럿 존재하며 저장되는 값의 형태(8가지)와 크기(바이트)는 다를 수 있음
		 * 변수를 왜 사용?
		 * 가독성과 재사용성 -> 코드 관리의 감소와 유지 보수성의 증가
		 * 선언) 메모리 공간에 얼만큼의 데이터 저장 공간을 할당한다는 것
		 * */
		
		/* bit && byte
		 * 2^bit승 가지의 정보를 담을 수 있음
		 * 2바이트 (65536)면 모든 문자를 표현 가능
		 * unicode를 이용
		 * */
		
		/* 선언 방법
		 * 자료형 변수명;
		 * 총 8가지 1 + 1 + 2 + 4
		 * */
		
		/*참조형은 메모리에 있는 값을 가져 오라고 하는 것으로 값 자체가 아닌 메모리의 특정 주소가 저장 되어 있음*/
		
		
		
		System.out.println("둘레"+2*pi*r);
		System.out.println("넓이"+pi*r*r);
		System.out.println("원기둥 부피"+pi*r*r*h);
		System.out.println("구 겉넓이"+4*pi*r*r);
		




		
	}
	

}
