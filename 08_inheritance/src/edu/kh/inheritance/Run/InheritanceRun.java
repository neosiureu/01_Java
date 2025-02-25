package edu.kh.inheritance.Run;

import edu.kh.inheritance.model.service.InheritanceService;

public class InheritanceRun {

	public static void main(String[] args) {
		InheritanceService service = new InheritanceService();
		service.ex4(); 
		// print 구문 수행 시 참조변수명을 작성하면 자동으로 toStirng()메서드를 호출해서 출력
	
	}

}
