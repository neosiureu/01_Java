package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.dto.Car;
import edu.kh.poly.ex1.model.dto.Spark;
import edu.kh.poly.ex1.model.dto.Tesla;

public class PolyService {
	public void ex1 () {
		System.out.println("다형성을 처음으로 확인해보는 예제입니다.");

		
		Car car = new Car(); // 부모 타입의 참조변수로 부모타입의 객체를 생성하는 기존의 객체생성 방식	
		Tesla tesla = new Tesla(); // 자식 타입의 참조변수로 자식타입의 객체를 생성하는 기존의 객체생성 방식	
		
		/*=========================================다형성==================================================*/
		
		// 부모 타입 참조변수로 자식 객체를 넣을 수 있는 업캐스팅 => 다운캐스팅을 위해서는 기존 업캐스팅이 필수
		
		Car car2= new Tesla(); // 원래 대입하면 다른 타입이라 에러가 났어야 정상
		// 하지만 다형성 때문에 그렇지 않다! 
		// Tesla객체를 참조하는 변수의 타입은 부모 타입인 Car이기에 Tesla 객체가 Car(부모)로 변화 함
	
		// 업캐스팅이 우선 되어야
		
		Car car3 = new Spark();
		// spark 객체를 참조하는 변수의 타입이 Car이기 때문에 Spark객체는 자연스럽게 그 안의 Car 객체로 변할 수 있다.
		
		// 중요!! 자식객체만의 고유한 객체의 속성메서드는 쓸 수 없다. 
		
		// 1)  자식 객체가 부모의 객체로 이미 변한 상태이기 때문에 자식만의 고유한 필드와 메서드를 사용할 수 없다!
		// 1-1) Car (부모참조변수에 부모 객체)
		car.setEngine("v6의 6기통 엔진"); car.setFuel("휘발유"); car.setWheel(4); // 본인만의 메서드 사용 가능
		// 1-2) Tesala
		tesla.setEngine("전기모터"); tesla.setFuel("전기"); tesla.setWheel(4);   // 본인만의 메서드+ 상속받은 것까지 사용 가능
		
		// 자식인 테슬라 객체를 다형성한 부모타입의 참조변수 car2 
		car2.setEngine("전기모터"); car2.setFuel("전기"); car2.setWheel(4); 
		// 자식에서 재정의한 batteryCapacity함수는 못 쓴다? 
		// 그러면 자식 타입으로 다시 변환하면 되겠네 => 다운 캐스팅
		((Tesla)car2).setBatteryCapacity(100);
		// 괄호를 잘 쳐야 함. 타입캐스팅 한 것 자체까지 하나로 묶어 하나의 참조변수 취급
		
		
		car3.setEngine("경차 엔진");
		car3.setFuel("휘발유");
		car3.setWheel(4);
		
		// 즉 car2와 car3는 참조변수가 Car이기에 부모 타입의 참조변수이기에 
		// 자식객체에 있는 고유한 필드와 메서드를 사용할 수 없다
		
		
		
		
		/*=======================================================*/
		
		// 2) 다형성을 이용한 객체배열
		
		// 기존에 객체배열이란? 같은 객체의 참조 자료형의 변수를 하나의 묶음으로 다루는 것	
		// 다형성을 이용한 객체배열이란? 부모 타입 참조 자료형의 변수를 하나의 묶음으로 다루는 것
		// => 말이 좀 어려운듯? carArr[0]은 Car타입이 들어올 수 있는 변수. 거기에 Tesla, Spark도 들어올 수 있다!
		
		Car[] arr = new Car[3]; 
		// 각 arr의 element들은 Car타입의 주소가 들어가는 참조변수
		arr[0] = car;
		// Car타입 주소만 들어갈 수 있는 변수. 당연히 들어갈 수 있다.
		arr[1] = car2; 
		// Car타입 주소만 들어갈 수 있는 변수. 자식인 Tesla 주소도 들어갈 수 있다. (Car인척하는 Tesla, 업캐스팅)
		arr[2] = car3;
		// Car타입 주소만 들어갈 수 있는 변수. 자식인 Spark 주소도 들어갈 수 있다. (Car인척하는 Spark, 업캐스팅)

		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+ "번째 인덱스의 엔진: " + arr[i].getEngine() );
		// 이 코드 역시 상속과 다형성이 있어서 가능
		// 상속이 있어서 모든 Car를 상속받은 클래스는 모두 getEngine()을 가지고 있다.
		// 다형성 (업캐스팅)도 이 안에 숨어있다? arr[i]로 접근할 수 있다는 것 자체가 다형성
		// 원래는 Car타입의 주소만 들어올 수 있는데 1번, 2번 인덱스는 다형성이 있어서 참조 가능한 것
		
		}
		
			
	}
	
	public void printCar (Car temp) { // 전달받은 Car 또는 Car의 자식 객체의 엔진 연료 바퀴를 출력하는 메서드
		//System.out.println(temp); 		// 이대로만 하면  
		// toString이 출력 됨 (원래라면 주소 값이지만 오버라이딩 했으니)

		// Car temp = c
		// Car temp = t
		// Car temp = s
		// 부모타입 참조변수인 temp에 자식타입 객체가 셋 들어 있음
		// 다형성과 업캐스팅 모양이 똑같음 => temp라는 Car타입이 들어갈 수 있던 매개변수에는 
		//Car, Tesla, Spark의 주소가 참조될 수 있다.
		System.out.println("엔진 :"+ temp.getEngine());
		// 이미 업캐스팅이 완료된 상태이기 떄문에 부모것만 이용 가능
		System.out.println("연료 :"+ temp.getFuel());
		System.out.println("바퀴 개수 :"+ temp.getWheel());
		System.out.println();

		// 같은 이름의 여러 함수를 안 만들어도 됨!!
		
	}
	
	
	public Car createCar(int num) { // 매개변수로 전달받은 정수 값에 따라 Car, Tesla, Spark의 객체를 만들어 반환하는 메서드
		Car result=null;
		switch (num) {
		case 1: result = new Car();
		break;
		
		case 2: result = new Tesla();
		break;
			
		case 3: result = new Spark();
		break;
		
		}
		return result;
		
		
	}
	
	public void ex2 () {
		// 다형성 업캐스팅을 이용한 매개변수 사용법
		Tesla t = new Tesla("전기모터", "전기 ", 4, 10000000);
		Spark s = new Spark("경차엔진", "휘발유",4,0.5);
		Car c = new Car("경유엔진","경유", 12);
		
		printCar(t);
		printCar(s);
		printCar(c);
		// 전달 인자 자체는 셋 다 다르지만 업캐스팅인 Car타입의 변수를 이용하면 셋 다 호출이 가능
	

		System.out.println("============================================");
		// 다형성을 이용한 반환형
		
		Car arrs[] = {new Car(), new Tesla(), new Spark()};
		// 위 모양을 메서드로 구현해보자
		
		Car[] arr = {createCar(1), createCar(2), createCar(3) };
		// Car 타입 Car객체 //Car타입 Tesla객체 // Car타입 Spark객체
		//즉 전달받은 숫자에 따라 리턴 하는 타입을 다르게 할 수 있겠는가?
		
		
		// 객체의 타입이 어떤 자료형인지 검사
		
		// instanceof 연산자: 객체의 자료형을 검사: 참조하는 객체가 특정 자료형이거나 상속관계가 맞는지 확인
		// true나 false를 반환
		System.out.println(arr[1] instanceof Tesla); // 해당 객체가 본인이거나 상속관계이냐? 자기 자신이니 맞음
		System.out.println(arr[1] instanceof Spark); // 해당 객체는 객체가 본인도 아니고 상속관계도 아님
		System.out.println(arr[1] instanceof Car); // 해당 객체가 본인이거나 상속관계이냐? 자신은 아니지만 부모임
		// 다운캐스팅 시 실수를 방지하기 위하여 if문으로 쓰임
	}
	
	public void ex3 () {
		// 다운캐스팅을 확인해보자
		
		// what is downcasting? 부모 타입의 참조변수가 자식의 객체를 참조하는 업캐스팅
		// 그 상태에서 다시 자식의 메서드를 되돌리는 것이 downcasting
		// 부모 타입을 자식타입으로 "강제 형변환"하여 자식 객체의 본래 필드와 메서드를 이용가능하게 하는 것
		
		Car c1= new Tesla("전기모터", "전기", 4, 50000);
		// 자동으로 업캐스팅 된 상태 => Tesla지만 Car타입인척 함
		// c1은 batteryCapacity가 뭔지 모름
		System.out.println( ( (Tesla)c1 ).getBatteryCapacity()  );
		// .이라는 메서드 연산자 보다 형변환 연산자보다 우선순위가 높음
		// => 괄호로 형변환을 먼저 하면 c1이 그제서야 Tesla 타입이 됨
		// 그 다음에야 getBatteryCapacity()가 됨.
		
		
		// 헷갈리면 이렇게 해봐
		Tesla t1 =  (Tesla) c1;
		// t1은 테슬라 타입이 되므로 그를 이용해 get 가능
		System.out.println(t1.getBatteryCapacity());
	}
	
	public void ex4 () {
		// 다운캐스팅 시 주의 사항
		
		Car c1= new Tesla();
		// Tesla 객체를 만들어 업캐스팅한 Car타입 참조변수에 담음
		
		Spark s1 = (Spark) c1 ; 
		// 아무 관계가 없는 테슬라와 스파크인데 오류가 안남!
		// 다운 캐스팅 잘못해도 컴파일 에러는 발생하지 않음 => 런타임 에러이기 때문
		
		/*Exception in thread "main" java.lang.ClassCastException: class edu.kh.poly.ex1.model.dto.Tesla cannot be cast to class edu.kh.poly.ex1.model.dto.Spark (edu.kh.poly.ex1.model.dto.Tesla and edu.kh.poly.ex1.model.dto.Spark are in unnamed module of loader 'app')
	at edu.kh.poly.ex1.model.service.PolyService.ex4(PolyService.java:184)
	at edu.kh.poly.ex1.run.PolyRun.main(PolyRun.java:8)*/
	/* 해석하면 */	
		
		// ClassCastException: 형변환 예외
		// c1을 관계없는 Spark타입으로 다운캐스팅하여 나는 에러
		
		// 따라서 instanceof로 방지한다
		
		// 해결책: instanceof 와 같이 사용한다 => runtime error 시의 exception handling
		
		if(c1 instanceof Spark) {
			// c1이 Spark이거나 상속관계인가?
			//Spark s1 = (Spark) c1;
			System.out.println("성공");
		}
		
		else {
			System.out.println("실패 (Spark타입이 아니며 상속관계도 아닌데 형변환을 시도하고 있다!)");
		}
		
	}
	
	public void ex5 () {
		// 바인딩 확인 예제
		// Binding => 실제 실행할 메서드의 코드와 호출하는 코드를 연결시키는 것
		
		Car c1= new Car("경유 엔진", "경유", 8); // 아무것도 건들지 않은 Car 객체 c1
		System.out.println(c1.toString()); // 컴파일 단계에서 Car 클래스의 toString이라는 것을 알려 줌
		// Car 객체에 있는 toString 메서드를 호출한 것
		// 정적 바인딩: 런타임이 일어나기 전에, 즉 실행전에 컴파일러가 컴파일 단계에서 toString을 Car에 있는 함수로 연결함.
		// 이 페이지에 있는 toString() 호출 코드와 String edu.kh.poly.ex1.model.dto.Car.toString ()를 연결한다.
		
		
		Car c2= new Spark("경차엔진", "휘발유", 4, 0.5); // 하지만 다형성이 적용된 객체라면 바인딩이 어떻게 될까?
		// 업캐스팅 적용 상태 => Spark는 Car인척 하고 있음. 즉 컴파일러는 현재 Car부분에 있는 속성 기능만 참조 가능
		System.out.println(c2.toString()); //  따라서 아직 toString()은 Car의 것인 줄 안다
		// String edu.kh.poly.ex1.model.dto.Car.toString ()라고 한다 => 컴파일 단계에서는 Car타입이라 한다
		// toString 호출코드와 Car의 toString()메서드 코드를 연결했으므로 정적 바인딩이라 할 수 있음
		
		
		// 출력 결과
		// 경차엔진 / 휘발유 / 4 / 0.5 
		// 컴파일러는 Car의 toString을 실행한다고 생각하지만 런타임 시 Spark의 toString이 실제로 수행된 것
		// 즉 컴파일러는 속은 것
		// 실행 당시에 호출될 메서드가 결정되는 것이 동적 바인딩
		
		
		// 자식이 Spark의 toStirng()메서드가 실제로 호출 됨 
		// 정리:  컴파일 시에는 부모 타입인 Car의 toString의 바인딩 == 정적 바인딩
		// 그러나 실행시에는 정적바인딩보다 자식인 Spark에서 오버라이딩 된 toString 메서드가 우선시되어 
		// Spark의 메서드와 바인딩되므로 실제 실행되는 것은 자식의 toString으로 된다.
		// 이 파트가 동적 바인딩
		
			
	}
	


	
	
	
	
}
