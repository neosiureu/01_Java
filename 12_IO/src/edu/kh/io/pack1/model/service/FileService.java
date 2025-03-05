package edu.kh.io.pack1.model.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
/* File 클래스
	 *
	 * - java.io 패키지
	 *
	 * - 파일/디렉토리(폴더)를 관리하는 클래스
	 *   (파일/디렉토리 존재 유무 관계 없음)
	 *
	 * - 파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 등의 기능 제공
	 *
	 * - File 클래스 메서드
	 *
	 * boolean  mkdir()          : 디렉토리 생성
	 * boolean  mkdirs()         : 경로상의 모든 디렉토리 생성
	 * boolean  createNewFile()  : 파일 생성
	 * boolean  delete()         : 파일/디렉토리 삭제
	 * String   getName()        : 파일 이름 반환
	 * String   parent()         : 파일이 저장된 디렉토리 반환
	 * String   getPath()        : 전체 경로 반환
	 * boolean  isFile()         : 현재 File 객체가 관리하는게 파일이면 true
	 * boolean  isDirectory()    : 현재 File 객체가 관리하는게 디렉토리 true
	 * boolean  exists()         : 파일/디렉토리가 존재하면 true, 아님 false
	 * long     length()         : 파일 크기 반환
	 * long     lastModified()   : 파일 마지막 수정일 (1970.01.01 09:00 부터 현재까지 지난 시간을 ms 단위로 반환)
	 * String[] list()          : 디렉토리 내 파일 목록을 String[] 배열로 반환
	 * File[]   listFiles()     : 디렉토리 내 파일 목록을 File[] 배열로 반환
	 */
	
	/* [개발자 상식!]
	 *
	 * OS : 운영 체제
	 *
	 *  (Windows)    /     (Linux, Mac)
	 *    폴더       /      디렉토리
	 *
	 * - 경로 표기 방법(하위 폴더, 파일 표시)
	 *
	 * 백슬래시 (\, Windows)     -> C:\workspace\01_Java => 여기에서는 경로를 표시하기 위해 \를 이용한다!
	 *  
	 * 
	 * C드라이브 하위에 user1이 있고 그 하위에 Pictures 그 하위에 Screenshots
	 * 
	 * 슬래시   (/, Linux, Mac ) -> C:/workspace/01_Java
	 *
	 *
	 * - Java 언어의 특징 : 플랫폼(OS)에 독립적
	 * -> OS 관계 없이 똑같은 코드 작성이 가능
	 *
	 * -> 이 특징을 유지하기 위해 /, \ 둘다 호환 가능
	 *   (런타임 시 실행되는 OS에 맞게 자동으로 변경)
	 *
	 *
	 * -------------------------------------------------------------
	 *
	 * - 경로 표기 방법
	 *
	 * 1) 절대 경로 : 하나의(절대적인) 기준으로 부터
	 * 				 목표까지의 경로를 모두 표기하는 방법
	 *
	 * - 기준
	 * [Windows] :   C:/  , D:/
	 * [Linux, Mac] : /Users ,   /
	 *
	 *
	 * 2) 상대 경로 : 현재 위치를 기준으로 목표까지의 경로를 표기하는 방법
	 *
	 *
	 * */




public class FileService {
	
	/**
	 * File 클래스로 객체 생성
	 * +폴더가 존재하지 않으면 폴더 생성
	 */
	public void method1 () {
		// C: io/test/20250305 폴더를 지정
		
		File directory = new File("/io/test/20250305");
	
		//  그냥 /만 쓰면 되는 이유?
		// /는 최상위 폴더 (== rooot, 절대 경로의 기준점)
		// 리눅스나 맥에서는 Users/, 윈도우에서는 C:/나 D:/를 의미
		
		// 현재는 주소만 지정해준 것. 파일이 생성된게 아님!
		
		// 존재하지 않는 폴더를 관리하는 File객체 생성
		
		if( !directory.exists()) {
		// 존재하지 않으면 => 부정 연산자
			directory.mkdirs();
			// 경로상의 모든 디렉토리를 /를 사이에 둔 것 포함해 전부 생성하는 명령어
			// io와 test와 20250305를 전부 생성해야 하므로 s가 붙어야 함
			System.out.println(directory.getName());
			System.out.println(directory.getPath());
			
		}
		
	}
	
	
	/**
	 * File객체를 이용하여
	 * 지정된 위치에 진짜 파일을 생성 (디렉토리가 아니라)
	 */
	public void method2 () {
		File file = new File("\\io\\test\\20250305\\파일생성.txt"); //절대 경로 => 슬래시나 역슬래시는 같은 것 => 담나 문자열에서 \를 표기하는 방법은 \\
				// 이스케이프 문자 \가 있기 때문에 진짜 \를 사용하고 싶다면 \\로 써 놓아야 한다.
				// \\역시 /와 마찬가지이므로 루트 디렉토리인 C를 말하는 것
		

		if(!file.exists()) { // 저 절대경로에 파일이 존재하지 않으면
			// 파일을 직접 생성
			
			try {
				if(file.createNewFile()) {
					// 파일이 정상적으로 생성된 경우
					System.out.println(file.getName()+"이라는 이름의 파일이 정상적으로 생성되었습니다.");
				} 
				// 대부분의 파일 클래스 내 메서드는 IO예외를 발생시키기 때문에 예외처리를 반드시 해야 한다.
				// IOException의 경우 반드시 예외 처리를 해 주어야 하는 checked Exception이기에 try -catch나 throws가 있어야 한다.
			} catch (IOException e) {
				e.printStackTrace(); // 예외의 정보 + 발생 위치까지 추적하는 메서드
			}
			
			// 파일을 직접 생성하는 메서드
		}

		
	}
	
	public void method3 () {
		// 파일 클래스에서 제공하는 메서드 활용하기
		File directory = new File("/workspace/01_Java/12_IO");
		// 지정된 경로 내 모든 파일과 디렉토리를 파일 배열의 형태로 얻어오려 한다.
		File[] files = directory.listFiles();
		System.out.println(Arrays.toString(files));

		for(File f : files) {
			// 파일명 각각을 출력
			String fileName = f.getName();
			long lastmodified = f.lastModified(); // ms단위로 시간을 보여줌
			// System.out.println(lastmodified); 보여줘도 사실 잘 모름	
			// java.text 패키지에는 SimpleDateFormat이라는 클래스가 존재
			// 간단히 날짜 형식을 지정할 수 있는 객체를 생성
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm"); //특정 날짜의 형식을 지정하는 패턴
			// a는 오전이나 오후를 의미
			// 생성자에서 해당 패턴을 지정
		
			// String simpleDateFormat.foramt(long ) 메서드를 이용하자
			
			// 이 함수를 이용하면 매개변수 long값을 지정된 패턴 형식으로 반환하여 문자열 형태로 반환
			String date = sdf.format(lastmodified); 
			/*
			 * 1741135058933
			 * 1741135058928
			 * 1741135058931
			 * 1741135114714
			 * 1741135114526
			 * */

			System.out.println(date);
			/*
			 * 2025-03-05 오전 9:37
			 * 2025-03-05 오전 9:37
			 * 2025-03-05 오전 9:37
			 * 2025-03-05 오전 9:38
			 * 2025-03-05 오전 9:38
			 * 사람이 읽을 수 있게
			 * */			
			
			
			// 파일의 유형을 구해보자.
			System.out.println();

			String type =null; //아무것도 지정하지 않은 문자열
			if(f.isFile()) type = "파일";
			else type = "폴더";
			
			// 파일 크기를 바이트로, 반면 폴더의 크기를 구할 수는 없다 
			// 만일 폴더의 크기를 구하려면 폴더 내 모든 파일을 순회하여 각 파일을 합산하는 수 밖엔
			String size = f.length() + "Byte";
			if(f.isDirectory()) size=" "; // 만약 폴더가 맞다면 그냥 빈 문자열로 변경. 폴더의 크기를 구할수는 없기 때문
			
			String result = String.format("%-20s  %-20s %-5s %10s", fileName, date, type, size);
			// -는 좌측 정렬
			System.out.println(result);

			
			//for문의 끝
			}
		
		
		
		// 스트림은 안 쓰나? 파일, 폴더에 실제 데이터를 읽거나 쓸 때만 스트림을 사용한다 => 이미 존재하는 폴더나 파일에 대한 데이터를 읽거나, 폴더와 파일을 생성하는 것은 스트림이 필요가 없음
		
	}
	
	

	
	
	
	

}
