package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.dto.Person;

/**
 * 
 */
public class SetService {
	/*
	 *   set은 집합 또는 주머니
  기본적으로 순서를 유지하지 않는다
  index가 없기에 get메서드가 없다. 따라서 구분하여 꺼내오기 힘들다
  중복 데이터는 저장되지 않는다
  set 인터페이스의 자식클래스는 총 셋
  
 > HashSet
  모든 set의 대표로 처리 속도가 빠르다

 > LinkedHashSet
  순서는 유지하면서 중복은 없애고 싶다면
  
> TreeSet
 자동 정렬이 되는 set
	 * **/
	

	public void method1 () {
		// HashSet 객체를 생성
		Set<String> set = new HashSet<String>(); // 순서유지가 안 되는 hashSet
		// Set<String> set = new TreeSet<String>(); // 자동 정렬이 오름차순으로 되는 TreeSet
		// Set<String> set = new LinkedHashSet<String>();
		
		// 1. boolean add(E e) : 추가
		set.add("네이버"); 
		set.add("카카오"); 
		set.add("라인"); 
		set.add("쿠팡"); 
		set.add("배달의 민족"); 
		set.add("배달의 민족"); 
		set.add("배달의 민족"); 
		set.add("배달의 민족"); // 중복 저장이 되지 않는다
		set.add("배달의 민족"); 
		set.add("배달의 민족"); 
		set.add(null);
		set.add(null);
		set.add(null);
		set.add("당근 마켓"); 
		set.add("토스"); 
		set.add("직방"); 
		set.add("야놀자"); 
		
		System.out.println(set);

		// 2. int size(): set에 저장된 객체의 수를 반환한다
		System.out.println("set의 size() : " +set.size());
		
		// 3. boolean remove (E e)
		// 전달받은 매개변수 e를 Set에서 제거
		// 제거에 성공하면 true, 객체가 없으면 false
		
		System.out.println(set.remove("배달의 민족"));
		System.out.println(set.remove("엘쥐"));
		
		// 4. boolean contains(E e)
		  // 전달받은 e가 Set에 있으면 true, 없으면 false

		System.out.println("쿠팡이 있는지 검사: " +set.contains("쿠팡"));
		System.out.println("한화가 있는지 검사: " +set.contains("한화"));



		// 5. void clear(): Set에 저장된 내용을 모두 삭제
		
		set.clear();
		
		//6. boolean isEmpty(): Set이 비어있으면 true, 아니면 false를 반환
		 System.out.println("이 Set은 비어있나요?"+ set.isEmpty());
		
	}
	
	public void method2 () {
		/*set에 저장된 객체를 접근하려면?
  
  1) iterator를 사용한다
  2) set을 list로 변환하여 list에서 get을 이용하는 방법
  3) enhanced for loop를 이용하는 방법*/
		HashSet<String> set = new HashSet<String>();
		
		set.add("몽쉘");
		set.add("꼬북칩");
		set.add("쿠크다스");
		set.add("빈츠");
		set.add("포카칩");
		// 1) iterator 사용
		/*
		 *   iterator: 컬렉션 객체에 저장된 요소를 하나씩 순차적으로 접근하는 객체
  
  iterator set.iterator() :
  현재 set을 순차접근할 수 있는 iterator 객체를 반환
		 * */
		System.out.println("======1) 이터레이터를 이용한다========");

		Iterator<String> it = set.iterator(); 
		/*  이 Iterator는 그 자체로 메서드가 있다.
  
  boolean Iterator.hasNext();
  
  그 다음으로 순차 접근할 요소가 있으면 true, 없으면 false. 주로 while조건을 이용
		 * */
		
		while(it.hasNext()) {
			// hasNext() 다음 요소가 있으면 반복, 없으면 false가 나와 멈춤
			String tmp = it.next(); // 이터레이터 요소 하나를 꺼내서 tmp에 넣은 셈
			System.out.println(tmp); 
		}
		
		
		
		System.out.println("======2) List로 집합을 변경한다========");

		// 일단 list를 생성한다
		List<String> list = new ArrayList<String>(set);
		// 빈 List를 하나 생성
		// addAll과 같은 메서드, 생성자를 이용해 set안에 있는 요소들을 차례차례 리스트에 추가한다

		// 일반 for문을 이용해 진짜 리스트에 잘 옮겨졌는지 파악
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("======3) 향상된 for문을 이용한다========");

		for( String snack : set) {
			System.out.println(snack);
		}
	}
	
	/**
	 * 직접 만든 클래스 person을 이용하여
	 * 만든 객체를 set에 저장하되 
	 * 중복 제거가 안 되는 이유를 알아보도록 한다
	 */
	public void method3 () {
		Person p1= new Person("홍길동",25,'남');
		Person p2= new Person("홍길동",25,'남');
		Person p3= new Person("홍길동",30,'남');
		Person p4= new Person("김길순",20,'여');
		
		Set<Person> personSet = new HashSet<Person>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		
		for(Person p: personSet) {
			System.out.println(p);
		}
		
		// System.out.println("========hash가 포함된 컬렉션 이용 시 반드시 hashCode()와 equlas()를 이용한 오버라이딩은 필수===========");

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
		
		System.out.println("p1과 p2가 완전히 동일하다? "+p1.equals(p2));
		System.out.println("p1과 p3이 완전히 동일하다? "+p1.equals(p3));

		// 동일한 필드 값을 가진 객체는 해시코드의 번호가 같다
		
		// A.equlas(B) => A와 B가 가지고 있는 필드값이 전부 같다면 true, 조금이라도 다르면 false
 	}
	


	
	/**
	 * TreeSet을 이용한 로또번호 생성기
	 * 기본적으로 오름차순으로 정렬해 줌
	 * 
	 * TreeSet안에 저장되는 객체는 반드시 Comparable interface 상속이 필수적이다
	 * wrapper클래스인 interger는 이미 Comparable이 선제적 overriding되어있으므로 이용만 하면 된다
	 * 
	 */
	public void method4 () {
		// interger 저장할 TreeSet 객체 생성
		Set<Integer> lotto = new TreeSet<Integer>();
		// 난수를 생성하는 방법은 Math.random말고도 Random이라는 클래스가 Random.nextInt()가 있다
		// int Random.nextInt(int n) => 0부터 n-1까지의 정수 중 하나를 랜덤으로 반환한다.
		Random r = new Random();
		
		// 로또에 저장된 값이 6개 미만이면 반복하고 6개가 되는 순간 멈추는 loop
		
		// set을 이용하면 중복된 값이 나와도 어차피 저장이 안됨!
		
		while (lotto.size()<6) {
			// 1~45
			lotto.add(r.nextInt(45)+1);	
		}
		System.out.println(lotto.toString());
				
	}


	/**
	 * <h1>로또 번호 생성기</h1>
	 * 이 안에서 html 태그를 사용 가능하다! <br>
	 *
	 * 금액을 입력받아 (천원 단위)
	 * 1000원당 1회씩 번호를 생성해서 (set으로 만든 내용을) List에 저장한 후 
	 * 생성 종료 시 한번에 출력
	 * 
	 * <pre>
	 * 금액입력 : 3000원
	 * 1회 : [11, 20, 34, 35, 42, 43]
	 * 2회 : [1, 12, 22, 33, 35, 44]
	 * 3회 : [5, 6, 24, 43, 44, 45]
	 * ....
	 * </pre>
	 */
	public void lottoNumberGenerator () {
		Scanner sc = new Scanner(System.in);
		Random r= new Random();
		System.out.print("금액 입력: ");
		int amount = sc.nextInt();
		System.out.println(amount+ "원을 입력하셨습니다");

		/* TreeSet을 각각 만들어서 각 객체들을 List로 만든다 List<>안에 Set<Integer>의 형태로	
		 생성된 로또 번호 묶음 List 객체 생성
		 즉 컬렉션 안에 또 다른 컬렉션
		*/
		
		 List<Set<Integer>> lottList = new ArrayList<Set<Integer>>();
		 
			// for가 반복될 때마다 새로운 TreeSet의 객체가 생성 됨
		 for(int i=0; i<amount/1000; i++) {
			 Set<Integer> lottoSet = new TreeSet<Integer>(); // 오름차순
			 // Set<Integer> lottoSet = new TreeSet<Integer>(Comparator.reverseOrder()); // 내림차순
			 	 
			 	 while(lottoSet.size()<6) {
			 		 lottoSet.add(r.nextInt(45)+1); // 1에서 45까지의 난수가 발생한다
			 	 }
			 	 // TreeSet 객체들이 for문 한번마다 생성 됨
			 	 // 그 Set들을 add해주면 됨
			 	 lottList.add(lottoSet);
		 }
		 
		 for(int i=0; i<lottList.size(); i++) {
			 System.out.println((i+1)+"회: " + lottList.get(i) );
		 }


	}
}
