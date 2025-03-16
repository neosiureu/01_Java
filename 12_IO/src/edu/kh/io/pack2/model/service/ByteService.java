package edu.kh.io.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class ByteService {
	/*
	 * > what is Stream?

데이터가 이동하는 통로, 밖-> 안 또는 안 -> 밖의 단방향으로만 이동한다.

> 바이트 기반 스트림  

1바이트 단위로 데이터를 입출력하는 스트림

최상위 클래스로는 입력시에 쓰는 InputStream 출력시에 쓰는 OutputStream

문자열이나 이미지 영상 오디오 pdf와 같은 데이터가 모두 입출력 가능. 즉 지나갈 수는 있음

다만 통로가 좁다 = 전달 속도가 느리고 2바이트 문자의 경우 깨질 우려가 큼

> IO관련된 코드는 IOException을 발생시킬 가능성이 높다!

따라서 IO관련 코드는 거의 모든 메서드가 정의될 때 이미 thorws IOException이 붙어 생성되어 있다.


IOException 관련 된 예외처리 구문을 반드시 작성해야 정상 종료될 수 있다
	 * */
	
	
	/**
	 * 바이트 기반 스트림을 이용하여 파일을 출력하고
	 * 데이터를 그 파일에 쓴다
	 */
	public void fileByteOutput () {
		// FileOutputStream의 참조변수 선언
		 // outputStream을 상속받은 자식 클래스에 해당
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("/io/test/20250305/바이트기반_테스트.txt");
			// 경로에 작성된 파일과 연결된 파일 출력 스트림 객체가 생성
			// 만일 출력 스트림에 연결된 파일이 존재하지 않으면 자동 생성해준다
			// 다만 폴더는 생성해주지 않기 때문에 이미 C:\io\test\20250305까지는 존재한다는 가정이 있어야 함
			// 다만 같은 이름의 파일이 이미 존재한다면 지금 하려고 하는 코드의 명령으로 덮어쓰기 된다.
			
			// txt파일이 생성되긴 했지만 아직 내용은 없음
			// StringBuilder로 비동기 가변적 텍스트 파일을 만들어보자.
			
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World!\n"); // append는 printf메서드와 똑같다. 즉 자동 개행 기능은  없음
			sb.append("1234567890\n");
			sb.append("!@#$%^&*()\n");
			sb.append("가나다라마바사아자차카타파하\n");
			sb.append("ㅋㅋ?\n");
			sb.append("ㅇㅇ\n");
			sb.append("진짜로!! 정말로 !! 화이팅!!\n");
			
			// 출력방법1: 한 글자 (2바이트)씩 한 글자로 쪼개어 파일로 출력
			// 하지만 StringBuilder를 가변성 객체이기에 Char는 안 되고 String으로 다시 변환해야 한다.
			// 즉 StringBuilder => String => charAt으로 다시 char
			// 라는 과정을 거치겠다는 것
			
			String content = sb.toString();
//			for(int i=0; i< content.length(); i++) {
//				char ch = content.charAt(i);// ch에 한 글자씩 for문 끝날때까지 반복하여 저장 
//				fos.write(ch); // 1바이트 출력 스트림이 연결 된 파일에 인자로 들어온 ch를 쓴다
//			}
			
			// 2바이트 범주의 문자 (영어와 기본 특수문자를 제외한 것)들은 바이트 스트림 통과 시 데이터 손실이 필히 발생하여
			// 글자가 깨지는 문제가 발생
			
			// 출력방법2: String을 byte[]변환 후 출력
			
			
			/*
			 * 수행 시간을 확인하는 방법
			 * write()함수가 수행되는 시간을 측정한다
			 * System.nanoTime메서드 이용: 1970년 1월 1일 오전 9시 0분 0초부터 현재시간까지의 차이를 ns라는 숫자로 반환한다.
			 * ns는 10억분의 1초단위
			 * */
			
			//write이전 시각
			
			//long startTime = System.nanoTime();
			
			fos.write(content.getBytes()); //content는 StringBuilder에 썼던 것을 String형으로 변환한 것이었다.
			
			//long endTime = System.nanoTime();
			
			//System.out.println(" 기반스트림인 fileByteOutput에 의한 파일 출력의 수행시간 "+ (endTime-startTime) + "나노 초 입니다." );
			
			
			//write이후 시각
			// 해당 String 내 모든 문자열을 byte[]의 배열로 만들어 반환해준다.
			// for문 마무리 후에는 flush
			
			fos.flush(); // 스트링 안에 남아있는 모든 데이터를 밀어내는 과정
			System.out.println("출력 완료");


		} catch (IOException e) {
			e.printStackTrace();

		}
		// try 내의 예외와 관계 없이 무조건 수행하는 코드 => 사용 완료한 스트림을 제거 (닫기, 메모리반환)하는 코드 작성
		// 메모리 누수 방지
		finally {
			try {
				if(fos!=null) fos.close();
				
				/*
				 * close 메서드도 IOException을 발생시키기에 trt-catch로 예외처리 필수!
				 * 다만 fos가 실제 객체를 참조하고 있다는 가정 하에서만 stream을 닫는다고 가정
				 * Stream이 정상적으로 생성되었을 때 한정으로 그 스트림을 닫는다 => NullPointerException방지. 
				 * */
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		
		
	}
	
	/**
	 * 버퍼를 이용한 파일 출력
	 * + BufferedOutputStream이라는 이름의 보조 스트림을 이용한다.
	 * 
	 */
	public void bufferedFileByteOutput () {
		/*
		 * Buffer = 데이터를 모아두는 메모리 바구니 공간


입력이나 출력을 하는 통로가 좁다 => 보조적으로 버퍼에 입력되는 값을 모아두다가 한번에 내보낸다는 원리

기본적 스트림을 사용하지 않고 성능을 높이게 됨


BufferedOutputStream (바이트 기반 스트림에서 사용하는 출력용 보조 스트림) 또는 

BufferedInputStream(바이트 기반 스트림에서 사용하는 입력용 보조 스트림)이 존재

FileOutputStream은 1바이트씩 데이터를 입출력하기 때문에
통로가 좁아 데이터 입출력 시 속도가 미세하게 느림

-> 보조스트림 이용 시 버퍼에 입출력할 내용을 모아서 한 번에 입출력할 수 있다

* 내부 버퍼에 데이터를 모아뒀다가 일정 크기가 넘어서면 한번에 출력하는 식으로 작동

=> 성능이 떨어지는 기반 스트림을 이용하는 횟수가 적어짐 
=> 성능과 시간 효율이 상승
		 * */
		
		FileOutputStream fos = null; // 기반 스트림에 대한 참조변수를 선언해 둠
		BufferedOutputStream bos = null; // 보조 스트림에 대한 참조변수를 선언
		
		
		try {
			// 기반 스트림부터
			fos = new FileOutputStream("/io/test/20250305/바이트기반_테스트_Buffered.txt");
			// 없다면 파일을 만들어주고 프로그램과의 연결을 만든 것
			
			
			// 기반 스트림인 fos를 이용 -> 보조 스트림인 bos를 생성
			bos = new BufferedOutputStream(fos);
			
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World!\n"); // append는 printf메서드와 똑같다. 즉 자동 개행 기능은  없음
			sb.append("1234567890\n");
			sb.append("!@#$%^&*()\n");
			sb.append("가나다라마바사아자차카타파하\n");
			sb.append("ㅋㅋ?\n");
			sb.append("ㅇㅇ\n");
			sb.append("진짜로!! 정말로 !! 화이팅!!\n");
			
			String content = sb.toString();
			// 이제 fos와 bos를 둘 다 이용해야 함
			
			long startTime = System.nanoTime();

			
			bos.write(content.getBytes());
			// getBytes하자마자 바로 쓰기에 flush가 없어도 됨
			// 하지만 buffer는 write해도 버퍼 내에 저장만 되고 파일에 기록되는 것이 아님!
			
			long endTime = System.nanoTime();
			
			System.out.println(" 보조스트림인 버퍼에 의한 파일 출력의 수행시간 "+ (endTime-startTime) + "나노 초 입니다." );
			
			
			bos.flush(); // 스트림 내의 모든 데이터를 밀어낸다
			// BufferedOutputStream 사용 시에는 flush가 필수다
			System.out.println("출력 완료! ");

			
			fos.write(content.getBytes()); //content는 StringBuilder에 썼던 것을 String형으로 변환한 것이었다.
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(bos!=null) bos.close();
				// fos는 안 닫아도 된다 => 보조 스트림인 bos를 닫으면 
				// 보조 스트림 생성에 사용된 기반스트림인 fos역시 자동으로 close됨
			} catch (Exception e) {
			}
			
		}
		
		
	}
	
	
	
	/**
	 * 바이트 기반 파일 입력 해보기
	 */
	public void fileByteInput () {
		// 파일 입력용 바이트 기반 스트림을 선언해보자
		
		FileInputStream fis = null;
		
		try {
			fis= new FileInputStream("\\io\\test\\20250305\\노래가사.txt");
			// input의 경우 디렉토리 뿐 아니라 반드시 파일까지 존재해야만 함
			// 존재하지 않으면 FileNotFoundException이 발생
			
			// 방법1. 파일 내부 내용을 1바이트씩 끊어서 읽어오는 것을 시도해보자
			// 가사가 한글로 되어있으므로 아마 전부 깨질 것으로 예상
			// byte => 자바에서 정수형의 일종
			// 다루기 힘들기 때문에 int로 byte를 변환하여 사용하려 한다.
			int value = 0; // 읽어 온 바이트 값을 저장할 변수이다.
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				value = fis.read(); // 파일 입력 스트림을 통해 1바이트씩 끊어 읽어온 문자를 정수값으로 변환하여 저장
				// 단 더이상 읽어 올 값이 없으면 read메서드는 항상 -1을 반환
				if(value==-1) {
					break; // 읽어올 것이 더 이상 없다면 반복을 멈춤
				}
				sb.append((char) value);
			}
			
			System.out.println(sb.toString()); //반복문을 빠져나오면 이를 수행
			// inputStream은 flush라는 함수가 없다. 출력 시에만 버퍼에 있는 것들을 빼줄 필요가 있는 것이다.

			
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		finally {
			try {
				if(fis!=null) fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	public void fileByteInput2 () {
		FileInputStream fis = null;

	// 파일 입력용 바이트 기반 스트림을 선언해보자
		
		// 또 다른 방법: 파일 내 모든 바이트 값을 모두 읽어와 byte[]라는 형태로 반환 받는 방식이 있다
		// byte[]를 new연산자에서 String만들 때 인자로 전달하면 String으로 자동 형변환 됨
				
		
		try {
			fis=new FileInputStream("C:\\io\\test\\20250305\\노래가사.txt");
			byte[] bytes=fis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);


			
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		finally {
			try {
				if(fis!=null) fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	/**
	 * BufferedInputStream이라는 보조스트림을 이용한 성능 향상
	 */
	
	public void bufferedFileByteInput () {
		// 파일 입력용 바이트 기반 스트림을 선언
		FileInputStream fis= null;		
		// 파일 입력용 바이트 보조 스트림을 선언
		BufferedInputStream bis = null;
		
		try {
			// 기반 스트림 생성
			fis = new FileInputStream("C:\\io\\test\\20250305\\노래가사.txt");
			// 보조 스트림 생성
			bis = new BufferedInputStream(fis);
			// 이 bis만 이용하게 된다
			
			
			byte [] bytes = bis.readAllBytes();
			String content = new String(bytes);
			System.out.println(content);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				// 보조 스트림만 close()해도 기반 스트림도 동시에 닫힌다
				if(bis != null) bis.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}
	
	
	/**
	 * 외부에 있는 config.properties를 입력하고 출력하자
	 * -> Map 계열인 Properties 클래스
	 * 
	 */
	public void readProperties () {
		/*
		 * properties 클래스는 HashTable의 하위클래스로 Map계열 클래스 중 하나
		 * <K,V> = <String, String>
		 * Properties 객체 생성
		 * */
		
		// Properties 객체를 생성
		Properties properties = new Properties();
		// 바이트 기반 파일 입력 스트림 참조변수를 선언한다
		FileInputStream fis = null;
		// 바이트 기반 파일 출력 스트림 참조변수를 선언한다
		FileOutputStream fos = null;
		
		
		try {
			fis = new FileInputStream("C:\\io\\test\\20250305\\config.properties");
			properties.load(fis);
			// properties 객체를 통해서 fis라는 경로에 담긴 파일 데이터를 로드한다
	
			System.out.println("username: " + properties.getProperty("username"));
			System.out.println("password: " + properties.getProperty("password"));
			System.out.println("language: " + properties.getProperty("language"));
			//properties.getProperty(key) => key에 대응되는 value값을 반환해준다.
			System.out.println();


			// properties 파일에 쓰기OutputStream 사용
			fos = new FileOutputStream("C:\\io\\test\\20250305\\config.properties");
	        properties.setProperty("theme", "dark"); // 새로운 속성 추가
	        properties.store(fos, "업데이트 완료"); 
			


			System.out.println("username: " + properties.getProperty("username"));
			System.out.println("password: " + properties.getProperty("password"));
			System.out.println("language: " + properties.getProperty("language"));
			System.out.println("theme:"+ properties.getProperty("theme"));

			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		finally {
			try {
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

	
	
	
	/**
	 * 파일 경로를 입력받아
	 * 지정된 파일과 같은 경로에 복사된 파일을 출력한다.
	 * 
	 * [실행화면]
	 * 파일경로 입력: /io/test/20250305/노래가사.txt
	 * 복사완료: /io/test/20250305/노래가사_copy.txt
	 * 
	 * 1) 입력된 경로에 실제로 파일이 있는가?
	 * 2) 있다면 파일 내용을 모두 읽어온다. FileInputStream + BufferedInputsream
	 * 3) 읽어온 내용을 같은 경로 위치에 "노래가사_copy.txt"라는 이름으로 출력한다
	 * 4) 이 때는 FileOutputStream에 + BufferedOutputStream을 추가한다.
	 * 5) Scanner 대신 키보드 입력을 받을 수 있는 BufferedReader를 이용한다. 이는 문자열 입력용 스트림의 일종이다
	 * -> BufferedReader는 보조스트림으로 단독사용할 수 없다
	 * -> BufferedReder 생성 시 기반 스트림의 일종인 InputStreamReader를 사용하게 된다.
	 */
	public void fileCopy () {
		//"C:\\io\\test\\20250305\\config.properties"
		
		// 스트림 참조변수를 총 5개 선언해야 함
		
		BufferedReader br =null; // 문자열을 입력하기 위한 스트림
		
		FileInputStream fis=null; // 파일을 입력하기 위한 기반 스트림 
		BufferedInputStream bis = null; // 파일을 입력하기 위한 보조 스트림으로 성능향상이 목적		
		
		FileOutputStream fos=null;// 파일을 출력하기 위한 기반 스트림 
		BufferedOutputStream bos = null; // 파일을 출력하기 위한 보조 스트림으로 성능향상이 목적		

		
		try {
			// 키보드 입력을 받기 위한 스트림 객체를 생성
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("파일 경로 입력:");
			String target = br.readLine();

			// 해당 경로에 파일이 존재하는지 검사
			
			File file = new File(target);
			// "C:\\io\\test\\20250305\\노래가사.txt"가 입력된 것
			
			if(! file.exists()) { // 해당 경로에 파일이 존재하지 "않으면: 예외처리를 해주고 싶다
				System.out.println("해당 경로에 파일이 존재하지 않습니다. ");
				return ; // 더 이상 아무것도 수행하지 않고 함수를 종료
			}
			
			// 해당 경로에 파일이 존재하면 
			// target이 가리키는 파일의 내용인 String을 입력받을 수 있도록 입력용 스트림 생성
			// 그를 복사해서 나중에 밖으로 출력할 것임 (이 때는 출력용 스트림)
			
			fis = new FileInputStream(target);
			bis = new BufferedInputStream(fis);
			// 기반스트림을 인자로 전달하여 보조스트림을 생성
			
			//여기까지가 통로를 여는 과정
			
			// 입력용 스트림을 이용하여 target파일의 내용을 입력받는다
			
			byte[] bytes = bis.readAllBytes();
			// 모든 내용을 읽어들여 바이트 배열로 반환하겠다
			// 프로그램 내부에 bytes라는 이름으로 byte배열로 저장된 상황
			
			// 이제는 출력 스트림
			
			// 출력할 파일의 경로 + _copy가 붙은 파일 이름
			// "C:\\io\\test\\20250305\\노래가사.txt"
			// "C:\\io\\test\\20250305\\노래가사_copy.txt"라는 이름으로 파일을 만들자
			
			// 새로운 StringBuilder가 필요
			StringBuilder sb = new StringBuilder();
			
			sb.append(target);
			
			// sb에는 "C:\\io\\test\\20250305\\노래가사.txt"가 저장되어 있음
			
			
			// Int String.lastIndexof( String str)
			// 주어진 str이 마지막으로 등장하는 인덱스를 찾아 해당 인덱스 번호를 int형으로 반환
			
			int insertPoint = target.lastIndexOf("."); // target에서 마지막으로 .이 나오는 인덱스를 찾아서 반한
			
			System.out.println(insertPoint);

			// insert메서드를 이용하여 .앞에 _copy를 넣는다
			
			sb.insert(insertPoint, "_copy");
			// .이 있던 자리에 _copy를 추가하겠다. 나머지 .txt는 뒤로 밀리게 된다.
			String copy = sb.toString(); // 복사할 파일의 경로를 String형으로 변환
			
			// 출력용 스트림 생성
			fos = new FileOutputStream(copy); // 해당 경로에 파일이 없더라도 만들어 줌. 
			// 따라서 copy라는 문자열에 저장된 값이 만들어질 것
			bos = new BufferedOutputStream(fos);
			// 여기까지는 파일 자체를 만든 것이 전부. 내용을 추가로 써야만 함
			// 원본에서 읽어 온 내용이 bytes에 저장되어 있으니 bos를 이용하여 쓰기까지 해야 함 (출력)
			bos.write(bytes);
			bos.flush(); // 스트림에 남아있던 데이터를 모두 밀어낸다
			System.out.println("복사 완료!: "+ copy);

			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				// 사용한 Stream 메모리를 모두 반환한다.
				if(br!=null) br.close();
				if(bis!=null) bis.close(); // fis는 자동으로 닫힘
				if(bos!=null) bos.close(); // fos는 자동으로 닫힘
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
