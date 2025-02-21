package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;
import edu.kh.oop.method.model.service.MethodExample;

public class MethodRun {
	public static void main(String[] args) {
		MemberService memser= new MemberService();
		
		memser.displayMenu();
		memser.signUp();
		
		
		// method2()의 호출
		// 메인 위에서 method1()의 호출
		// 메인 메서드의 실행 
		// stack에 쌓이는 중 => 메서드를 호출한 이력이 이 위에 쌓임
		// stack의 특징: Last In First Out LIFO
		
		
		
		// 스택에서 함수가 나가고 들어오는 것은 return과 관련 있다.
		// 반환: method2()를 호출한 쪽으로 sum, 즉 8이라는 숫자를 가지고 코드의 흐름이 되돌아 감
		// 이제 코드의 흐름은 8을 가지고 반환 됨. method2는 스택에서 빠지게 되며 result로 대입된다.
		// 이제 method1도 되돌아가긴 함. 물론 void라서 return이 없다고 생각할 수 있지만
		// return; 이 자동으로 생략되어 있다고 생각하면 된다.
		// 그렇다면 method1을 호출한 곳으로 특별한 값을 전하지 않고 흐름만 되돌아가게 되며 method1은 스택에서 빠지게 된다.

		
		
	}

}
