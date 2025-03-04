package edu.kh.collection.pack3.model.service;

import edu.kh.collection.pack3.model.dto.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapService {
	
	/* Map이란? Key와 Value한 쌍이 데이터가 되어 이를 모아둔 객체를 의미
	 * key: value를 모은 한 쌍을 entry라고 함
	 * key의 특징은 Set (중복 허용 X)
	 * value의 특징은 List (중복 허용 O)
	 * */
	
	public void ex1 () {
		// HashMap<키의 제네릭, 벨류의 제네릭 > Map인터페이스의 대표 자식
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		/*
		 * Map에서의 추가 기능 => Key Value를 모두 전달한다.
		 * 
		 * Map.put(Integer Key, String Value) => 추가
		 * */
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동"); 
		
		
		// 키 중복 테스트
		map.put(1, "이주원");// 중복 허용 X, 새로운 내용이 value를 덮어 쓴다
		// 값 중복 테스트
		map.put(7,"최길동");// 중복 허용 O, 같은 값은 여럿 있을 수 있다
		
		System.out.println(map); // map.toString 오버라이딩 되어 있음

		
		
		
	}


	public void ex2 () {
		/* Map을 이용해야만 하는 예시
		* vo/ dto (값을 저장하기 위한 객체)는 특정 데이터 묶음의 재사용이 많은 경우에 사용
		* 멤버라는 id pw age라는 값을 저장할 회원이 특히 많다면 하나의 클래스를 만들어 사용한다 
		* 다만 딱 회원 한사람에 대한 데이터를 다룬다면 이는 메모리의 낭비
		* 그러한 상황이 Map의 존재 이유 => vo와 유사한 코드를 Map으로 만들자
		* 
		*/
		
		// dto예시
		
		Member member = new Member();
		member.setId("user01");
		member.setPw("pass01");
		member.setAge(30);
		
		// 값을 출력
		
		System.out.println(member.getId());
		System.out.println(member.getPw());
		System.out.println(member.getAge());

		
		// Map예시
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
		
		/* 값의 출력 => Key를 (여기서는 String 타입) 매개변수를 전달 시  
		* Value 자체를 반환, 여기서는 Object객체를 반환
		*/
		System.out.println( map.get("id"));
		System.out.println( map.get("pw"));
		System.out.println( map.get("age"));
		
		System.out.println("===========================");
		System.out.println("맵에 저장된 데이터를 순차적으로 접근해보아요");
		System.out.println();
		/*
		 * 실제 맵의 저장된 데이터를 보면 ["id"= pass02]와 같이 저장되어 있다
		 * for문 등을 이용하여 순차적으로 접근하는 방법은 없다. 특히 key가 문자열이기 때문
		 * for (String key: map)을 할 수는 없음 => 근본적으로 맵에서는 Interator를 쓸 수 없다!
		 * Map에서 Key만 모아두면 Set의 특징을 가지고, Value만 모아두면 List의 특징을 갖는다
		 * 특히 Key만 모아두면 Set이므로 keySet()이라는 메서드를 내장하고 있다
		 * 이 메서드는 인자로 들어온 Map의 key만 모아서 set 형식으로 반환해주는 메서드
		 * 따라서 미리 그를 담을 String타입 제네릭 Set타입 참조변수가 있어야
		 * */
		
		Set<String> set = map.keySet(); // id pw age가 저장된 set 반환
		
		System.out.println("keySet으로 반환한 형태:" + set);
		
		// 이제 이를 이용해 키 내용을 반복적으로 출력
		
		for(String k: set ) {
			System.out.println("키: "+k);
			System.out.println("값: "+map.get(k));
		}
		
		/*
		 * map에 저장된 데이터가 많거나 (반복 필요)
		 * 
		 * 어떤 키가 있는지 불분명할 때 (향상된 for문을 사용한다)
		 * 어떤 key가 있는지 몰라도 set객체를 만들고 k라는 이름으로 뽑아오면 순차접근 가능해서 편하다
		 * 
		 * 또는 Map에 저장된 모든 데이터에 반드시 접근해야 할 때
		 * keySet()을 key만 묶어둔 set객체를 만들고 향상된 for문을 사용하면 됨
		 * */

	}


	public void ex3 () {
		/* 리스트 안에 여러 맵이 있는 경우
		 * */
		List<Map<String, Object> > list =  new ArrayList<Map<String,Object>>();
		 /*맵은 이 상황에서 만들어지지 않음 큰 List의 틀만 생성한 것.
		 new가 있어야 객체가 생성된 것이다. List 내에 들어올 타입이 Map이라는 것만 지정한 것이다.
		 List 객체만 생성 되었고 해당 List에는 Map만 들어올 수 있음을 제한해 둔 것이고 
		 이제부터 Map객체를 만들 것이다*/
		for(int i=0; i<10; i++) {
			// 반복 시마다 Map객체를 생성한다
			Map<String, Object>  map = new LinkedHashMap<String, Object>();
			// Map객체가 하나씩 만들어진 순간 => 데이터의 추가
			map.put("id", "user0"+i);
			map.put("pw", "pass"+i);
			
			// Map을 이제 리스트에 추가
			list.add(map);
			// HashMap은 순서를 보장하지 않는 자료구조!
			// 순서를 유지하고 싶으면 LinkedHashMap을 이용하면 된다!
			// LinkedHashMap은 put한 순서를 유지 시켜주기 때문
		}
		
		System.out.println(list);

		// 향상된 for문을 이용하면 key가 id에 대응되는 value의 값을 전부 출력한다
		for(Map<String,Object> tmp : list) {
			System.out.println(tmp.get("id"));
		}
		
		
	// ex3의 끝 괄호
		}


}
