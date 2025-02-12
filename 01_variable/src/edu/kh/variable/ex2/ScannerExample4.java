package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		// nextInt 후 nextLine을 쓰면 무엇이 안 될까?
		System.out.println("nextInt에 대한 입력");
		int intNum= sc.nextInt();
		
		sc.nextLine();

		//5를 입력하고 엔터를 쳤다. nextInt는 5만 가져 감
		// 키보드와 OS 사이에는 사실 입력 버퍼가 존재
		// 키보드로 들어간 값은 입력 버퍼를 거쳐 자바 프로그램으로 들어 감 
		// 5와 \n이 버퍼에 있음
		// 5+enter가 버퍼에 들어감. enter 치는 순간 nextInt에 의해 프로그램으로 5만 들어간 상태라 입력 버퍼에는 엔터는 혼자 버퍼에 남음		
		// 입력 버퍼에 남아있던 \n은 nextLine가 읽고나서 끝남. 따라서 nextLine을 키보드에서 처리할 수 있는 기회는 사라짐
		System.out.println("nextLine에 대한 입력");
		String word= sc.nextLine();
		
		System.out.println(intNum+word);


	}

}
