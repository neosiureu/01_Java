package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {
	/*
	 * 2차원 배열: 자료형이 같은 1차원 배열을 묶음으로 다루는 것
	 * -> 행과 열의 개념이 추가, 큰 묶음이 행, 세세한 묶음이 열
	 * */

	public void ex1 () {
		//2차원 배열의 선언
		int[] arr [];
		// int에 대한 2차원 배열을 참조하는 리모컨 arr을 선언하겠다
		// 참조변수 == 참조형 == 레퍼런스 변수 == 레퍼런스 == 리모컨
		
		// 2차원 배열의 할당 
		
		
		arr = new int[2][3];
		// heap영역에 2차원배열 2행 3열 공간을 할당한다. 그 주소를 arr이라는 참조변수에 대입
		
		
		// 초기화 방식은 세 가지
		
		// 1) 행과 열의 인덱스를 이용한 직접 초기화
		
		/*
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		System.out.println(Arrays.toString(arr)); //참조하고 있는 1차원 배열의 value를 문자열로 반환할 뿐
		// arr자체는 주소를 가리키고 있으므로 주소 값이 출력. 따라서 deepToString을 써야 함
		System.out.println("실제 값이 있는 곳까지 가서 값을 가져오는 deepToString");
		System.out.println(Arrays.deepToString(arr)); 

		*/
		
		// 2) 
		System.out.println("이중 for문을 이용한 초기화");

		int num=10; // element 초기화에 사용할 것
		System.out.println("arr이 참조하고 있는 배열의 길이, 주소가 들어 있음: " + arr.length); 
		System.out.println("arr[0]이 참조하고 있는 배열의 길이, 값이 들어 있음: " + arr[0].length); 
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col] = num;
				
				num+=10;
			}
			
		}
		System.out.println(Arrays.deepToString(arr) );

		
		
		
		// 3) 선언과 동시에 초기화 가능
		
		int [] arr2[] = { {10,20,30 }, 
						{40,50,60} };
		
		System.out.println(Arrays.deepToString(arr2) );

		
	}
	
	public void ex2 () {
		// 3x3의 int형 2차원 배열 선언과 동시에 초기화하는 방식
		// 1에서 9까지의 값이 들어가도록
		// 각 행별로 합을 출력한다.
		
		int [] arr[]= { {1,2,3   },
						{4,5,6   },
						{7,8,9   }  };
		for(int row=0; row<arr.length; row++) {
			int sum=0; //변수의 선언 위치를 잘 생각해보자. sum이 안쪽 for에 들어가기 전에 항상 0으로 초기화되어야 하므로 
			//for에 들어가기 전에 0으로 초기화해놓고 안쪽 for문 아래에 작은 배열을 다 합친 sum을 출력하면 됨
			for(int col=0; col<arr[row].length; col++) {
				sum+= arr[row][col] ;

			}
			//for문 아래에 작은 배열을 다 합친 sum을 출력하면 됨
			System.out.printf("%d 행을 다 합치면: %d \n", row, sum);

		}
		
		
		System.out.println("---------------------------------------");

		// 00+ 10+ 20 => 줄을 바꾸기
				
		for(int i=0; i<arr.length; i++) {
			int sum =0;
			for(int j=0; j<arr[i].length;j++) {
				sum+=arr[j][i];
			}
			System.out.println(i+" 열을 다 합치면: "+sum);



		}
		

		}
	public void ex3 () {
		System.out.println("가변 배열의 개념. 진짜 배열의 크기는 지정하지 않아 유동적으로 값을 처리할 수 있음. ");
		// - 2차원 배열의 생성 시 마지막 배열 차수 (열)을 지정하지 않고 
		// 나중에 서로 크기가 다른 1차원 배열을 생성하여 참조하는 배열
		
		char [] arr [] = new char [4] []; // 진짜 char가 들어가는 부분의 크기는 모름
		
		// 따로 할당할 타이밍에 열의 크기를 지정해 줌
		
		arr[0] = new char[3]; // 0행에 3열짜리 배열을 생성하여 주소 값을 저장한다.
		arr[1] = new char[4]; // 1행에 4열짜리 배열을 생성하여 주소 값을 저장한다.
		arr[2] = new char[5]; // 2행에 5열짜리 배열을 생성하여 주소 값을 저장한다.
		arr[3] = new char[350]; // 3행에 2열짜리 배열을 생성하여 주소 값을 저장한다.
		

		char ch='a';
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) { // row의 역할이 중요. row에 따라 전체 길이가 얼마나 증가할지 정해 짐
				arr[row][col] = ch++;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));

	}
		
		
		
	}
	
	

