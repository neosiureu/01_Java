package edu.kh.exception.model.service;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {
	// 예외(exception): 소스코드의 수정으로 해결 가능한 오류
	// 예외는 두 종류를 구분됨 
	/*
	 * 1) unchecked Exception : 선택적으로 예외를 처리. Runtime Exception 등
	 * 2) Check Exception: 필수적으로 예외 처리 IOException 등
	 * */
	
	
	private Scanner sc = new Scanner(System.in);
	
	
	public void ex1 () {
		// 사용자로부터 두 정수를 입력 받아 나누기 한 몫을 출력받는 메서드
		// 이 메서드에서는 어떤 오류가 발생할 수 있을까?
		
		System.out.print("정수1 입력: "); //  InputMismatchException
		int input1= sc.nextInt();
		
		System.out.print("정수2 입력: "); //  InputMismatchException && ArithmeticException
		int input2= sc.nextInt();  // input2에 0이 들어온다면 0으로 나눌 수 없다 (산술적 예외)
			
				

		if(input2!=0) {
			System.out.println("결과: 정수1 / 정수2= "+ input1 /input2 );
		}
		
		else {
			System.out.println("INFINITY");
			
		}
		
		
		try {
			// 예외가 발생할 우려가 있는 코드
			System.out.println("결과: 정수1 / 정수2= "+ input1 /input2 ); //ArithmeticException
			
		} 
		
		catch (ArithmeticException e) {
			// try에서 던져진 예외를 catch문의 매개변수 e로 잡은 상황
			// 이 e를 사용하여 예외를 추적하는 코드를 작성하거나 내가 원하는 코드를 작성한다
			System.out.println("INFINITY");
			e.printStackTrace(); // 발생한 예외에 대한 메서드와 위치에 대한 모든 내용을 출력한다
			// 예외 발생 지점 추적 메서드
			
		
		}
		
		// 발생하는 예외 중 일부 예외 , 그 중에서도 unchecked exception은  try - catch 없이 if문으로 처리 가능
		
		System.out.println("안녕");

		
	}
	



	public void ex2 () {
		// 여러 예외 상황들을 처리해보자.
		
		try {
			System.out.print("정수1 입력: "); //  InputMismatchException
			int input1= sc.nextInt();
			
			System.out.print("정수2 입력: "); //  InputMismatchException 
			int input2= sc.nextInt();  // input2에 0이 들어온다면 0으로 나눌 수 없다 (산술적 예외)
			
			System.out.println("결과: "+ input1 / input2); // ArithmeticException
			
			// 총 두 예외를 던질 수 있다.
			
			/*
			 * InputMismatchException ArithmeticException 둘 다 RuntimeException의 후손
			 * RuntimeException은 Exception의 후손
			 * Exception
			 * 		ㄴ RuntimeException
			 * 					ㄴ InputMismatchException, ArithmeticException
			 * */
			
			// 형제 관계인 두 예외 클래스는 무엇을 먼저 쓰던 상관이 없다!
			
			String str = null;
			System.out.println(str.charAt(1));

			
			
		}
		catch (InputMismatchException e) {
			System.out.println("타입에 맞는 값만 입력하세요! ");
			e.printStackTrace();
		
		}
		// 이거 사이에 다른 메서드가 올 수는 없음
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
			e.printStackTrace();

		}
		catch (RuntimeException e) {
			System.out.println("무언가 다른 런타임 에러가 났습니다");
			e.printStackTrace();			
		}
		
		catch (Exception e) {
			System.out.println("알 수 없는 다른 에러가 났습니다");
			e.printStackTrace();

		}
		
		
		/*
		 * Exception 클래스: 모든 예외의 최상위 부모
		 * Exception e는 다형성의 업캐스팅에 의해 모든 예외를 전부 캐치할 수 있다.
		 * 부모타입의 참조변수로 자식의 객체 주소를 가져오므로 e는 모든 예외를 처리한다는 것
		 * Exception e = new RuntimeException(); 이라고 할 수 있는 셈
		 * 상위 타입의 예외 클래스를 catch문에 작성하면 다형성 업캐스팅에 의해 모두 잡아서 처리 가능
		 * 귀찮다면 아래에 Exception 하나만 적어도 된다.
		 * 하지만 어떤 예외인지 잘 모르므로 뭉뚱그려 catch하는 경우 printStackTrace를 해야 알 수 있다
		 * 
		 * */
		
		System.out.println("안녕");

		
	}


	public void ex3 () {
		try {
			System.out.print("정수1 입력: "); //  InputMismatchException
			int input1= sc.nextInt();
			
			System.out.print("정수2 입력: "); //  InputMismatchException && ArithmeticException
			int input2= sc.nextInt();  // input2에 0이 들어온다면 0으로 나눌 수 없다 (산술적 예외)
				
					

			
				System.out.println("결과: 정수1 / 정수2= "+ input1 /input2 );
							
			
			
			
		} catch (ArithmeticException e) {
			System.out.println("산술적 예외 처리가 된다");
			// 매개변수 e가 이용되는 다양한 객체 내 메서드
			// 예외관련 정보와 예외 관련 기능의 이용
			System.out.println(e.getClass());// 어떤 예외 클래스인지 사용
			// 출력 결괴: class java.lang.ArithmeticException
			// getClass는 오브젝트 클래스 내 메서드이기에 모든 클래스에서 사용 가능
			System.out.println(e.getMessage());
			// / 출력 결과: by zero
			// Exception의 부모
			
			System.out.println(e);


		}
		catch (InputMismatchException e) {
			System.out.println("입력 가능한 것은 정수 뿐!");
		}
		
		finally {
			System.out.println("이 구문은 try catch를 쓰고 예외 여부와 상관 없이 무조건 마지막에 수행되는 문장입니다");
			sc.close();
		} // 앞에서 예외 발생 여부에 관련 없이 수행한다.
		
		
		
	}

	
	public void ex4 () {
		
		try {
			methodA();
		} 
		catch (Exception e) {
			System.out.println("메서드 C로부터 발생한 예외를 ex4까지 와서 처리한 경우");
		}
		
	}
	
	public void methodA () throws Exception {
		methodB();
		
	}
	
	public void methodB () throws Exception {
		methodC();
		
	}
	
	// throws: 호출한 메서드에게 예외를 던짐. 즉 호출한 메서드에게 예외를 처리하라며 책임을 떠넘기는 행위
	
	public void methodC () throws IOException {
		throw new FileNotFoundException();
		// throw를 이용한 예외 강제 발생
		
	}
	
	

	public void ex5 () throws UserException {
		// 사용자 정의 예외 클래스 UserException으로 강제 예외 발생
		throw new UserException("사용자가 정의한 예외가 발생하셨습니다.");
		// 빨간줄이 발생하는 이유? checked exception이라 반드시 예외를 해결하고 가야 한다. 
	}

}
