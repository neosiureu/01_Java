package edu.kh.io.pack1.model.service;

public class StreamPrepare {
	
	
	/*
	 * **정답 코드 흐름 문제1
1) StringBuffer(또는 StringBuilder) 선언 →

2) sb.append()로 문자열 추가

3) FileOutputStream 생성 → 파일과 연결

4) sb.toString().getBytes() 변환 → 문자열을 바이트 배열로 변환

5) fos.write() 사용 → 변환한 바이트 데이터를 파일에 출력

6) 스트림 닫기 (close()) → 자원 해제**


	 * */
	
	

	
	/*
	 * 정답 코드 흐름 정리 (BufferedOutputStream 사용)
	 * 문제2
1) 기반 스트림(FileOutputStream) 생성 → 파일과 연결
2) 보조 스트림(BufferedOutputStream) 생성 → fos를 감싸서 버퍼링 기능 추가
3) StringBuilder를 사용하여 문자열 저장 → sb.append()로 데이터 추가
4) sb.toString().getBytes() 변환 → 문자열을 바이트 배열로 변환
5) bos.write(배열)을 이용하여 파일에 출력 → 버퍼에 저장 후 한 번에 출력
6) bos.flush() 호출 → 버퍼에 남은 데이터까지 모두 파일에 밀어냄
스트림 닫기 (bos.close()) → bos를 닫으면 fos도 자동으로 닫힘
	 * 
	 * */

	
	/*
	 * 정답 코드 흐름 정리 (fileByteInput2() 사용)
	 * 문제3
1) 기반 스트림(FileInputStream) 생성 → 파일과 연결

2) readAllBytes()로 파일 내용을 한 번에 읽음 → byte[] 형태로 반환

3) new String(byte[])을 통해 문자열로 변환 → 모든 파일 내용을 문자열로 얻음

4) 변환된 문자열 출력 (System.out.println(content))

5) 스트림 닫기 (fis.close()) → 자원 해제
	 * 
	 * 
	 * */
	
	
	/*
	 * 정답 코드 흐름 정리 (BufferedInputStream 사용)
	 * 문제4
1) 기반 스트림(FileInputStream) 생성 → 파일과 직접 연결

2) 보조 스트림(BufferedInputStream) 생성 → fis를 감싸서 버퍼링 기능 추가

3) readAllBytes()를 이용해 파일 내용을 한 번에 읽음 → byte[]로 반환

4) new String(byte[])을 통해 문자열로 변환 → 모든 파일 내용을 문자열로 얻음

5) 변환된 문자열 출력 (System.out.println(content))

6) 보조 스트림 닫기 (bis.close()) → bis를 닫으면 fis도 자동으로 닫힘
	 * 
	 * 
	 * */
	
	
	/*
	 * 
	 * 정답 코드 흐름 정리 (fileByteOutput() - 바이트 기반 파일 쓰기)
	 * 문제5

1) 기반 스트림(FileOutputStream) 생성 → 파일과 연결

2) StringBuilder를 사용하여 문자열 저장 → sb.append()로 데이터 추가

3) sb.toString().getBytes() 변환 → 문자열을 바이트 배열로 변환

4) fos.write(byte[]) 사용 → 변환한 바이트 데이터를 파일에 출력

5) fos.flush() 호출 → 버퍼에 남은 데이터까지 모두 파일에 밀어냄
스트림 닫기 (fos.close()) → 자원 해제
	 * */
	
	
	/*
	 * 정답 코드 흐름 정리 (fileByteInput2() - 바이트 기반 파일 읽기)
	 * 문제6

1) 기반 스트림(FileInputStream) 생성 → 파일과 연결

2) readAllBytes()를 이용해 파일 내용을 한 번에 읽음 → byte[] 형태로 반환

3) new String(byte[])을 통해 문자열로 변환 → 모든 파일 내용을 문자열로 얻음

4) 변환된 문자열 출력 (System.out.println(content))

5) 스트림 닫기 (fis.close()) → 자원 해제
	 * */

	
	
	
	
	/*
	 * 정답 코드 흐름 정리 (bufferedFileByteInput() - 보조 스트림을 이용한 파일 읽기)
	 * 문제7

1) 기반 스트림(FileInputStream) 생성 → 파일과 직접 연결

2) 보조 스트림(BufferedInputStream) 생성 → fis를 감싸서 버퍼링 기능 추가

3) readAllBytes()를 이용해 파일 내용을 한 번에 읽음 → byte[] 형태로 반환

4) new String(byte[])을 통해 문자열로 변환 → 모든 파일 내용을 문자열로 얻음

5) 변환된 문자열 출력 (System.out.println(content))

6) 보조 스트림 닫기 (bis.close()) → bis를 닫으면 fis도 자동으로 닫힘
	 * */
	
	

	
// 기반 스트림만 이용해서	
	
	

	/*
	 *
	 * 정답 코드 흐름 정리 (fileByteOutput() - 바이트 기반 파일 쓰기)

1) 기반 스트림(FileOutputStream) 생성 → 파일과 연결

2) StringBuilder를 사용하여 문자열 저장 → sb.append()로 데이터 추가

3) sb.toString().getBytes() 변환 → 문자열을 바이트 배열로 변환

4) fos.write(byte[]) 사용 → 변환한 바이트 데이터를 파일에 출력

5) fos.flush() 호출 → 버퍼에 남은 데이터까지 모두 파일에 밀어냄
스트림 닫기 (fos.close()) → 자원 해제




정답 코드 흐름 정리 (fileByteInput2() - 바이트 기반 파일 읽기)

1) 기반 스트림(FileInputStream) 생성 → 파일과 연결

2) readAllBytes()를 이용해 파일 내용을 한 번에 읽음 → byte[] 형태로 반환

3) new String(byte[])을 통해 문자열로 변환 → 모든 파일 내용을 문자열로 얻음

4) 변환된 문자열 출력 (System.out.println(content))

5) 스트림 닫기 (fis.close()) → 자원 해제
	 * 
	 * */
	
	
// 보조스트림까지 이용해서	
	
/*
 * 
 * 1) 기반 스트림(FileOutputStream) 생성 → 파일과 직접 연결

2) 보조 스트림(BufferedOutputStream) 생성 → fos를 감싸서 버퍼링 기능 추가

3) StringBuilder를 사용하여 문자열 저장 → sb.append()로 데이터 추가

4) sb.toString().getBytes() 변환 → 문자열을 바이트 배열로 변환

5) bos.write(byte[]) 사용 → 변환한 바이트 데이터를 버퍼를 통해 파일에 출력

6) bos.flush() 호출 → 버퍼에 남은 데이터까지 모두 파일에 밀어냄

7) 보조 스트림 닫기 (bos.close()) → bos를 닫으면 fos도 자동으로 닫힘










정답 코드 흐름 정리 (bufferedFileByteInput() - 보조 스트림을 이용한 파일 읽기)

1) 기반 스트림(FileInputStream) 생성 → 파일과 직접 연결

2) 보조 스트림(BufferedInputStream) 생성 → fis를 감싸서 버퍼링 기능 추가

3) readAllBytes()를 이용해 파일 내용을 한 번에 읽음 → byte[] 형태로 반환

4) new String(byte[])을 통해 문자열로 변환 → 모든 파일 내용을 문자열로 얻음

5) 변환된 문자열 출력 (System.out.println(content))

6) 보조 스트림 닫기 (bis.close()) → bis를 닫으면 fis도 자동으로 닫힘


 * 
 * 
 * */
	
	
//기초 123단계 요약
	
	
	
/*
 * 
 * 생성

단계1: 파일이 존재할 경로를 지정

File 타입으로 File(주소)로 경로 생성

=> File directory = new File("/io/test/20250305");
이는 경로만 지정해 둔 것이므로 진짜 생성하는건 아래에서

if( !directory.exists()) {
	// 존재하지 않으면 => 부정 연산자
		directory.mkdirs();
		// 경로상의 모든 디렉토리를 /를 사이에 둔 것 포함해 전부 생성하는 명령어
		// 여러 디렉토리를 경로상 전부 생성해야 하므로 s가 붙어야 함
단계2: 파일을 진짜로 생성

File file = new File("\io\test\20250305\파일생성.txt");

if(!file.exists()) { // 저 절대경로에 파일이 존재하지 않으면
// 파일을 직접 생성

try- catch





쓰기

write(char)

char String.getBytes

bos = new BufferedOutputStream(fos)

if(bos!=null) bos.close() -> 이것도 try catch내





읽기

byte[] FileInputStream.readAllbytes()

bis = new BufferedInputStream(fis)

if(bis!=null) bis.close() -> 이것도 try catch내

기타 함수

다음은 File 클래스에서 사용된 메서드들을 정리한 표입니다. 각 메서드의 반환형, 인자, 기능을 포함하였습니다.

메서드	반환형	인자	기능
exists()	boolean	없음	파일 또는 디렉토리가 존재하는지 확인
mkdirs()	boolean	없음	경로 상의 모든 디렉토리를 생성
listFiles()	File[]	없음	디렉토리 내 모든 파일 및 서브디렉토리를 File 배열로 반환
getName()	String	없음	파일 또는 디렉토리의 이름을 반환
lastModified()	long	없음	파일 또는 디렉토리의 마지막 수정 시간을 밀리초(ms) 단위로 반환
isFile()	boolean	없음	파일인지 확인 (파일이면 true, 아니면 false)
isDirectory()	boolean	없음	디렉토리인지 확인 (디렉토리면 true, 아니면 false)
length()	long	없음	파일 크기를 바이트(Byte) 단위로 반환 (디렉토리인 경우 0 반환)
추가 설명
listFiles()는 디렉토리인 경우에만 File[] 배열을 반환하며, 파일인 경우 null을 반환하므로 null 체크가 필요할 수도 있음.
length()는 파일 크기만 반환하고, 디렉토리 크기는 계산되지 않음.
lastModified()는 SimpleDateFormat을 사용하여 사람이 읽을 수 있는 날짜 형식으로 변환해야 함.
이 코드를 통해 특정 디렉토리 내의 파일과 폴더 목록을 정리된 형식으로 출력
 * 
 * */	
	
	
	
	
}
