package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {
	public void shallowCopy () {
		// 얕은 복사: 그냥 주소 값만 새로운 참조변수에 할당한다. 	
		// 주소를 복사하여 서로 다른 두 참조변수가 하나의 객체를 참조하는 상태를 만드는 복사 방식
			
		int arr[] = {1,2,3,4,5 };		
		int copyArr[] = arr;
		// copyArr에게 arr이 가리키는 곳을 가리키게할 뿐
		System.out.println("변경 전");
		System.out.println("arr의 주소 : " + arr);
		System.out.println("copyArr의 주소 : " + copyArr);
		System.out.println("arr의 값들 : " + Arrays.toString(arr));
		System.out.println("copyArr의 값들 : " + Arrays.toString(copyArr));
		
		// 얕은복사한 배열의 값을 변경

		copyArr[2] = 999;
		System.out.println("변경 후에는: ");

		System.out.println("변경후 arr의 값들 : " + Arrays.toString(arr));
		System.out.println("copyArr의 값들 : " + Arrays.toString(copyArr));

		
		
	}

	
	public void deepCopy () {
		// 깊은 복사: 같은 자료형의 새로운 배열을 만들어 기존 배열의 데이터를 모두 복사하는 방법
		int [] arr = {1,2,3,4,5};
		
		// 깊은복사 방법1: for문을 이용해 element를 복사
		
		int [] copyArr1 = new int[arr.length]; //복사를 하기 위한 준비를 한 상태로 copyArr1에는 지금 0만 들어 있다
		
		for (int i=0; i<arr.length; i++ ) {
			copyArr1[i] = arr[i];
		}
		System.out.println("깊은복사 방법1: for문을 이용해 각 element를 복사한 결과: ");

		System.out.println("arr의 주소: " + arr);
		System.out.println("copyArr의 주소: " + copyArr1);

		
		System.out.println("arr의 내용 "+ Arrays.toString(arr));
		System.out.println("copyArr의 내용 "+ Arrays.toString(copyArr1));
		
		// 깊은복사 방법2: System.arrayCopy
		// (원본 배열 이름, 원본 배열의 시작 인덱스 번호, 복사 배열 이름, 복사 배열의 삽입 시작 인덱스 번호, 복사 할 길이)
		
		System.out.println("깊은복사 방법2: System.arrayCopy\r\n"
				+ "	 (원본 배열 이름, 원본 배열의 시작 인덱스 번호, 복사 배열 이름, 복사 배열의 삽입 시작 인덱스 번호, 복사 할 길이)\r\n"
				+ "		");

		int copyArr2[] = new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		System.out.println("copyArr2의 내용: " + Arrays.toString(copyArr2));
		
		// 복사할 배열의 참조변수
		
		
		// 깊은 복사 방법3: 복사할 배열 참조변수 = Arrays.copyOf(원본 배열, 복사할 길이)
		System.out.println("깊은 복사 방법3: 복사할 배열 참조변수 = Arrays.copyOf(원본 배열, 복사할 길이)\r\n"
				+ "");

		int copyArr3 []= Arrays.copyOf(arr, arr.length);
		System.out.println("copyArr3의 내용: "+Arrays.toString(copyArr3));
		System.out.println("new를 통해 할당을 안 해도 됨");

		copyArr1[4] = 0;
		copyArr2[4] = 999;
		copyArr3[4] = 5000;
		
		System.out.println("arr: "+ Arrays.toString(arr));
		System.out.println("copyArr1: "+ Arrays.toString(copyArr1));
		System.out.println("copyArr2: "+ Arrays.toString(copyArr2));
		System.out.println("copyArr3: "+ Arrays.toString(copyArr3));
		
	}

	public void createLottoNumber () {
		// 배열을 이용하여 중복 데이터를 제거하고 정렬한다.
		// 1부터 45사이 중복 숫자가 없으며 오름차순으로 정렬. 생성된 난수가 오름차순으로 정렬 되게끔 한다.
	// 출력 예시: 로또 번호는 [5,11,13,18,24,25]
		
		System.out.println("단계 별 풀이");
		int [] lotto = new int[6];
		// step1) 정수 6개를 저장할 배열을 선언 및 할당
		// step2) 순차적으로 생성된 배열을 접근하는 for문
		for(int i=0; i< lotto.length; i++) {
			// step3) 1에서 45사이의 난수를 생성
			int random = (int) (Math.random()*45+1);
			// step4) 생성된 난수는 순서대로 배열 element에 대입 됨
			lotto[i] = random;
			// step 4.5) 물론 아직까지 오름차순도, 중복 여부도 고려하지 않음.
		
			// step 5) 중복 검사를 위한 for문의 생성
			for(int x=0; x< i; x++) {
				// step6) 현재 생성된 난수와 같은 수가 앞쪽 element중에 존재하는지 검사
				if(random == lotto[x]) {
					// 첫 턴에서는 for문 자체를 타지 않음
					// 두번째 루프에서는 한번, 세번째 부터는 두번 비교해야 함
					// 중복 값이 있으면 난수를 새로 하나 더 생성한다.
					i--; 
					// step6)  바깥쪽 for loop를 소모하지 않기 위한 조치. 따라서 난수 발생의 기회를 한 번 더 주기만 하면 됨
					break; 
					// step7)  이미 중복 데이터를 발견했으면 이제 random과 lotto[x]를 더 이상 비교하지 않고 안쪽 loop는 끝 냄.
				}
			}	
			
		}
		
		// 중복은 제거되지 않지만 아직까지 오름차순 정렬은 안 됨.
		// step8) 정렬은 위한 자바 내장 메서드 사용
		Arrays.sort(lotto); // 그 이름은 Arrays.sort()
		
	
		
		// 결과 출력
		System.out.println("로또 번호는 "+Arrays.toString(lotto));		
	}
}
