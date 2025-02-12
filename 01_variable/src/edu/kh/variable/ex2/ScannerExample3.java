package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		// 이번에는 문자열을 입력해보자
		//문자열을 세 번 입력 받아 한 줄로 출력해보자
		Scanner sc=new Scanner(System.in);
		String str1, str2, str3;
		System.out.println("문자열을 아무거나 세 개 입력하세요");
		System.out.print("입력1: ");
		str1 = sc.next();
		System.out.print("입력2: ");
		str2 = sc.next();
		System.out.print("입력3: ");
		str3 = sc.next();
		System.out.printf("%s %s %s",str1,str2,str3);
		// next는 다음으로 입력 된 한 단어만 읽어 옴 공백 (space tab)을 만나면 입력을 중단하게 됨. 
		// 반면 nextline은 공백과 함께 입력 된 한 줄의 모든 내용을 입력 받는다 
		// 여기서는 띄어 쓰기를 하지 말라는 말이 없으니 nextLine이 적절할 듯 


	}

}
