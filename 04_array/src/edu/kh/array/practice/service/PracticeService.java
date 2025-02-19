

package edu.kh.array.practice.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;



public class PracticeService {
	Scanner sc = new Scanner(System.in);
	
	public void practice1 () {
		int [] arr = new int[9];
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for (int i=0; i<arr.length; i=i+2) {		
			sum+=arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print( arr[i]+" ");
		}
		System.out.println();
		System.out.println("짝수번째 인덱스 합: "+sum);

		
	}
	

	public void practice2 () {
		int [] arr = new int[9];
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			arr[i] = arr.length-i;
		}
		
		for (int i=1; i<arr.length; i=i+2) {		
			sum+=arr[i];
		}
		

		for(int i=0; i<arr.length; i++) {
			System.out.print( arr[i]+" ");
		}
		System.out.println();
		System.out.println("홀수번째 인덱스 합: "+sum);

		
	}
	

	public void practice3 () {
		System.out.print("양의 정수 입력:");
		int input = sc.nextInt();
		int [] arr = new int[input];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1+" ");

		}
		
	}


	public void practice4 () {
		int num=5;
		
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			System.out.printf("입력 %d: ", i);
			arr[i] = sc.nextInt();
		}

		
		System.out.print("검색할 값: ");
		
		int input = sc.nextInt();
		int index=100;

		for(int i=0; i<arr.length;i++) {
			if(input==arr[i]) {
				index=i;
				System.out.println("인덱스"+index);
				break;
			}
			
		}

		if(index==100) {
			System.out.println("일치하는 값이 존재하지 않습니다");
		}

		
		
		
	}


	public void practice5 () {
		int cnt=0;
		System.out.print("문자열: ");
		String str = sc.nextLine();
		
		System.out.print("문자: ");
		char myChar = sc.nextLine().charAt(0);
		System.out.printf("%s에 %c가 존재하는 위치 (인덱스): ", str, myChar );
		for(int i=0; i< str.length() ;i++) {
			if(str.charAt(i) ==myChar) {
				cnt++;
				System.out.print(i+" ");

			}
		}
		System.out.println();

		System.out.println(myChar +"의 개수"+cnt);

		
		// 1) 사용자에게 문자열 입력을 받는다 (sc와 cnt 필요)
		// 2) 사용자가 입력한 문자열을 하나하나 char에 넣자
		// 3) 검색할 문자를 입력 받자
		// 4) 검색할 문자가 문자열에 몇 개 존재하는지, 어떤 인덱스에 있는지 파악.
		
		
	}

	public void practice6 () {
	System.out.print("배열에 할당 할 정수: ");
	int num = sc.nextInt();
	int [] arr =new int[num];
	for(int i=0; i<arr.length; i++) {
		System.out.printf("배열 %d번째 인덱스에 넣을 값은: ", i);
		arr[i] = sc.nextInt();
	
	}
	
	int sum =0;
	for(int i=0; i<arr.length ;i++) {
		sum+=arr[i];
		
	}
	
	for(int i=0; i<arr.length ;i++) {
		System.out.println(arr[i]+" ");
	}
	
	
	System.out.println("총합: " + sum);


		
}

	
	public void practice7 () {
	
		System.out.println("주민등록 번호 (-포함): " );
		String num = sc.nextLine();

		char [] charArr = new char[num.length()];
		char dash = '-';

		for(int i=0; i<num.length(); i++) {
			charArr[i] = num.charAt(i);
		}
		int starNum = num.indexOf(dash);
		for(int i= starNum+2; i<num.length() ; i++) {
			charArr[i] = '*';
		}

		for(int i =0; i<charArr.length; i++) {
			System.out.print(charArr[i]);

		}

	
		
}



	public void practice8 () {
		int input;
		while (true) {
		System.out.print("정수: ");
		input= sc.nextInt();
		if(input%2==1) {
			break;
		}
		System.out.println("다시 입력하세요!! 3보다 커야 합니다. ");

		
		} 
		
		
		int num=1;

		while ( num< (input/2)+1) {
			System.out.print(num+ ", ");
			num++;
	
		}
		
		while(num>=1) { 
			if(num==1) System.out.print(num--);
			else
			System.out.print(num--+", ");
			
;}

		
	}


	public void practice9 () {
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
			
		}
		System.out.print("발생한 난수: ");
		for(int i=0; i<arr.length; i++) {
			 System.out.print(arr[i]+ " ");

			
		}

	}


	public void practice10 () {
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
			
		}
		System.out.print("발생한 난수: ");
		for(int i=0; i<arr.length; i++) {
			 System.out.print(arr[i]+ " ");
			 }
		
		int max=0, min=11;
		for(int i=0; i<arr.length; i++) {

			if(max<arr[i]) {
				max= arr[i];
				
			} 
			if(min>arr[i]) {
				min= arr[i];
				
			} 
		}
		System.out.println();

		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);

		
		
	}


	public void practice11  () {
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
			for(int x=0; x<i; x++) {
				if(arr[x]== arr[i]) {
					i--;
					break;
				}
			}
			
		}
		
		
		System.out.print("발생한 난수: ");
		for(int i=0; i<arr.length; i++) {
			 System.out.print(arr[i]+ " ");

		}
	}


	public void practice12 () {
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*45+1);
			for(int x=0; x<i; x++) {
				if(arr[x]== arr[i]) {
					i--;
					break;
				}
			}
			
		}
		
		Arrays.sort(arr);
		System.out.print("로또의 번호는: ");
		for(int i=0; i<arr.length; i++) {
			 System.out.print(arr[i]+ " ");

		}
	}


	public void practice13 () {
		System.out.print("문자열: ");
	
		int charcnt=0;
		String str = sc.nextLine();
		int cnt = str.length();
		char [] charString = new char[cnt];


		for(int i=0; i<cnt; i++ ) {		
				charString[i]= str.charAt(i);
		}
		
		
		for(int i=0; i<charString.length; i++) {
			boolean flag = true;
			for(int x=0; x<i; x++) {
				if(charString[i]== charString[x]) {
					flag = false;
					break;
				}
				
			}
			if(flag) {
				if(charcnt!=0)
					{System.out.print(",");
					System.out.print( charString[i]);}
				else
					System.out.print( charString[i]);
					
				charcnt++;
			}
			
			
			}
		System.out.println();

		System.out.println("문자개수: "+ charcnt);

	}

	
	public void practice13_2 () {
		// 1) 사용자에게 문자열을 입력 받는다
		// 2) 해당 문자열의 문자들을 char[]에 담는다
		// 3) char 배열에서 중복값이 존재할 경우 출력하지 않는다
		
		
		// 1단계
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		
		
		//2단계
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= str.charAt(i);
			
		}
		
		
		int cnt=0;
		
		System.out.print("문자열에 있는 문자: ");

		for(int i=0; i<arr.length; i++) {
			boolean flag = true;
		//"중복체크용 플래그 변수"
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					flag = false; // 중복이 발생
				}
				
			}
			if(flag) // 중복이 발생하지 않았을 경우
			{
				if(i==0) {
					// 첫번째 글자. 첫번째가 아닌 경우와 차이. 쉼표 출력 여부가 다름
					System.out.print(arr[i]);
				}
				else {
					System.out.print(", "+arr[i]);
				}
				
				cnt++; //중복이 아닌 경우
			}
		}
		
		System.out.println();
		System.out.print("문자의 개수: "+cnt);

		
	}
	
	
	public void practice13_3 () {
		System.out.print("문자열: ");
	    String input= sc.nextLine();
	    int cnt=0;
	    char chString[]=new char[input.length()];
	    for(int i=0; i<input.length(); i++ ) {
	    	boolean flag= true; 
	    	// 이 플래그가 true일 때 한정으로 String을 문자로 된 배열로 옮기겠다.
	    	// 어떤 i라는 문자가 있을 때 그 전에 있던 문자들과 비교해야 하는데 그 j가 flag를 만족시키면 문자열에 넣자. 
	    	// 따라서 해당 플래그는 두번째 for문과 비교하기 전에는 항상 true였다가 혹시 같은 것이 있으면 false로 바뀌어야 한다
	    	   for(int j=0; j<i; j++ ) {
	   	    	if( input.charAt(i) == input.charAt(j)) {
	   	    		flag = false;
	   	    	}
	   	    }
	    	   // i번째 문자열을 넣을 건지 말건지를 판단해야 함
	    	   if(flag) {
	    		   chString[i] = input.charAt(i);
	    		   cnt++;
	    	   }
	   		
	    	
	    }
		

	    for(int i=0; i<chString.length;i++)
		{System.out.print(chString[i]);}
System.out.println();

	    System.out.println(cnt);

	}
	
	public void practice14 () {
		System.out.print("배열의 크기를 입력하세요: ");
		int arrSize = sc.nextInt();
		sc.nextLine(); 

		String[] last = new String[0]; // 초기 배열
		char ch = 'y';
		int total = 0;

		while (ch == 'y' || ch == 'Y') {
		    String[] temp = new String[total + arrSize]; 
		    System.arraycopy(last, 0, temp, 0, total); // 이전 입력값 복사
		    
		    for (int i = 0; i < arrSize; i++, total++) {
		        System.out.print((total + 1) + "번째 문자열: ");
		        temp[total] = sc.nextLine();
		    }
		    last = temp; // 새 배열을 last배열에 할당하여 마지막에 출력할 수 있도록
		    
		    System.out.print("계속 입력하시겠습니까?(y/n): ");
		    ch = sc.next().charAt(0);
		    sc.nextLine();
		    if(ch=='n'||ch=='N') {continue;} // while문을 끝까지 가지 않았으니 ch값이 무엇인지 알 수 없다 
		    System.out.print("몇개를 더 입력하실거죠?: ");
		    arrSize = sc.nextInt();
		    sc.nextLine();


		}
		
		System.out.println("입력 완료");
		System.out.println(Arrays.toString(last));


		
	}
	
	public void practice14_2 () {
		// 배열의 크기를 변경할 수 없는 배열의 특성 상 어떻게 배열 자체의 크기를 늘릴 수 있을지 고려
		// 1) 첫 배열의 크기 지정
		// 2) 첫 배열에 저장할 문자열을 입력받기
		// 3) 반복이 시작되는 구간부터 while문을 작성하여 내부에 종료 조건을 만들어 break함
		// 특히 더 값을 입력하시겠습니까? 부터 while을 써서 얼마나 입력해야하는지 몰라도 되게끔
		System.out.print("배열의 크기를 입력하세요: ");

		int size = sc.nextInt(); // 첫 배열의 크기
		String arr[]=new String[size];
		sc.nextLine();
		//첫 배열에 저장할 문자열을 입력받기
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 문자열: ");
			arr[i] = sc.nextLine(); // 공백까지 포함되게 문자열을 받아야 하기 때문
			// 엔터를 이것이 빼았아가기 때문에
			// sc.nextLine(); // 개행문자 하나를 더 -> 위의 Line을 먹게 해 줌
			
		}
		
		// 반복이 시작되는 구간부터 while문을 작성하여 내부에 종료 조건을 만들어 break함
		
		while(true) {	
			System.out.println("더 값을 입력하시겠습니까? (Y/N)");
			char ch = sc.next().charAt(0);
			// ch 값에 따라 값을 더 입력한다고 할 수 있으며 그렇지 않겠다고 할 수 있음. 또는 잘못 입력할 수 있어 그 캐이스도 구분해야 함

			if(ch=='y'|| ch== 'Y'){
					
				// 더 입력 받을 개수를 입력 받자
				System.out.print("더 입력하고 싶은 개수: ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 개행문자를 또 제거해줘야 함
				
				// 6) 새로운 크기의 배열을 만들어야 함. 배열의 기존 크기 + 새로운 배열의 크기
	
				String newArr[]=  new String[arr.length+addSize]; // 여기까지는 새로운 배열이 생긴것 뿐, 
				// 그 string은 아무것도 가리키지 않음 (null)
				// 7) 기존 배열을 복사하는 방식. 또한 새로운 문자열을 입력받아야 한다.
				for(int i=0; i<newArr.length; i++) {
					if( i< arr.length) // 인덱스의 크기가 기존 배열보다 작은 경우와 기존 배열보다 큰 경우가 다름!!!
					{
						// 작은 경우에는 깊은 복사 해줘야 함
						newArr[i] = arr[i];
					}
					else {
						// 클 경우에는 새로운 값을 입력 받아야 함, 새로운 값들을 받기
						System.out.print((i+1)+"번째 문자열: ");
						newArr[i] = sc.nextLine();
						
					}
				}
				
			// 나머지는 간단
			
			
			// 기본 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소인 newArr이 대입되는 얉은 복사가 필요
			// 누적되는 크기가 계산되어야 함. 즉 arr.length + addSize의 이전 값이 계속 더해져야 함
			
			arr = newArr;
			// 위 코들르 반복할 때 기존 배열인 arr의 길이를 기준으로 새 배열인 newArr을 할당하기 때문에 얉은 복사가 된다는 것이 핵심
	
			}
			else if(ch=='n' || ch=='N') {
				break;
			}
			
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
	

			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
public void practice14_3() {
		
		// 1. 첫 배열 크기 지정
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거
		
		String[] arr = new String[size];
		
		// 2. 첫 배열에 저장할 문자열 입력받기
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		// 3. 반복이 시작되는 구간부터 while 작성하여 내부에 종료조건 만들어서 break;
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);
			
			// 4. 값을 더 입력할 경우
			if(ch == 'y' || ch == 'Y') {
				
				// 5. 더 입력받을 개수 입력받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
				
				// 6. 새로 값을 입력받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
				String[] newArr = new String[arr.length + addSize];
				
				// 7. 배열 복사 + 새로운 문자열 입력받기
				for(int i = 0; i < newArr.length; i++) {
					
					if(i < arr.length) { // 인덱스의 크기가 기존 배열보다 작을 경우 (깊은복사)
						newArr[i] = arr[i]; // 기존 배열 요소 값 복사
						
					} else { // 인덱스의 크기가 기존배열 보다 클 경우 (새로운 값 입력받기)
						System.out.print((i+1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
						
				}
				
				// 8. 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입 (얕은 복사)
				// 더 입력? y 
				// 위 코드를 반복할때 기존 배열인 arr의 길이를 기준으로 
				// 새 배열(newArr)의 크기를 할당하기 때문에
				arr = newArr;
				
			} else if(ch == 'n' || ch == 'N') { // 값을 더 입력하지 않을 경우
				break; // while 반복문 종료
				
			} else { // 잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
			
		}
		
		// 10. 배열값 모두 출력
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}
	
	
	
}

