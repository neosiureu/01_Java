package edu.kh.op.ex;

public class ExampleRun {
// 실행용 클래스
	public static void main(String[] args) {
		OpExample opEx = new OpExample();
		// 같은 패키지에 있는 OpExample은 import하지 않아도 좋음
		// 둘 다 edu.kh.op.ex 패키지에 있기 때문
		//opEx.ex1();
		// OpExample이라는 설계도를 이용하여 객체를 생성
		// OpExample 객체에 대한 opEx라는 참조변수를 만들어 
		// 그 참조변수라는 리모컨으로 OpExample의 기능 중 
		// ex1()이라는 기능을 소환한 셈
		opEx.ex4();
		

}
/*
 * 메소드명: publicvoid practice1(){}
모든사람이사탕을골고루나눠가지려고한다. 인원수와사탕개수를키보드로입력받고
1인당동일하게나눠가진사탕개수와나눠주고남은사탕의개수를출력하세요
 [실행화면]
인원수: 29
사탕개수: 100
 1인당사탕개수: 3
남는사탕개수: 13

 * 
 * */
}