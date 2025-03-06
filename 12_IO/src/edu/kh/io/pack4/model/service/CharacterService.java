package edu.kh.io.pack4.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterService {
	/*
	 문자 기반 스트림


2바이트 문자 단위로 입출력하는 스트림을 의미

Reader라는 입력 관련  최상위 클래스
Writer라는 입력 관련  최상위 클래스


문자만 작성된 파일이나 채팅, 인터넷 요청 시 데이터를 전달한다
이미지, 영상, 파일 등은 바이트 기반으로 쪼개서 오가야 한다
	 * */

	
	/**
	 * Reader Writer라는 문자 기반 파일 입력 해보기
	 * 보조 스트림인 Buffered까지 같이 쓰기
	 */
	public void fileInput () {
		// 스트림에 대한 참조 변수의 선언
		FileReader fr = null;
		// 문자 기반인 파일을 읽어오는 역할을 하는 기반 스트림
		BufferedReader br = null;
		// FileReader에 대한 보조 스트림
		
		
		try {
			// 문자 기반 스트림 객체 생성
			fr = new FileReader("C:\\io\\test\\20250305\\노래가사.txt");
			// 보조 스트림 생성
			br = new BufferedReader(fr);
			String line =null;
			
			
			while(true) {
				// BufferedReader.readLine(): 한 줄 씩 문자열을 줄 단위로 읽어 옴. 즉 개행문자가 나올때까지의 문자열을 읽는다
				line = br.readLine();
				
				if (line == null) { break;}
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if (br!=null) br.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	/**
	 * 문자기반의 파일 출력 (문자열을 파일에 써서 내보낸다.)
	 * Writer뿐 아니라 보조 스트림인 Buffered 사용
	 */
	public void fileOutput () {
		// 스트림 참조변수의 선언
		FileWriter fw= null; //문자기반 파일 출력 스트림
		BufferedWriter bw = null;
		
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("오늘은 3월 6일 목요일입니다..\n");
			sb.append("벌써 목요일이라니 기분이 좋(?)네요..\n");
			sb.append("다들 힘내서 공부합시다\n");
			sb.append("그리고 오늘 쪽지시험이 있습니다\n");
			sb.append("저는 학교에 가야해서 못봐요 이만~\n");
			
			String content = sb.toString();
			// content에 저장된 문자열을 C:\io\test\20250305\출력테스트.txt파일로 출력하자
			// 파일과 출력스트림 연결 (파일이 없으면 생성해준다)
			fw = new FileWriter("C:\\io\\test\\20250305\\출력테스트.txt");		
			bw=new BufferedWriter(fw); // 보조 스트림 생성
			bw.write(content);
			// bw.flush(); // 버퍼가 있으면 플러쉬를 뺴먹지 않아야 한다. 물론 close가 있어야 한다.
			System.out.println("출력 완료");

		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(bw!=null) bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
