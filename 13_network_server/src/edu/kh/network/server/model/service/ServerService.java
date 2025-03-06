package edu.kh.network.server.model.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.*;

//TCP Socket 프로그래밍
	// - TCP는 신뢰성 있는 연결을 보장하며
	// 소켓은 이 연결의 끝점 역할을 하며, 데이터 송수신 통로가 됨
	// 즉,  TCP 통신 = 소켓 간 연결 + 데이터 주고받기
	/*
	 * TCP
	 * - 서버, 클라이언트간 1:1 소켓통신 (연결 지향적 프로토콜)
	 * - 서버가 먼저 실행되어 있는 상태에서
	 *   클라이언트가 연결해야 함.
	 *  
	 *  
	 * - 데이터 전송 순서가 보장되고,
	 *   수신 여부를 판단하여 오류 발생 시 재전송함.
	 *  
	 *  
	 * * java.net 패키지에서 제공하는
	 *   Socket, ServerSocket 클래스를 사용해야함.
	 *  
	 *   Socket
	 * - 프로세스의 양 끝단(프로세스간의 통신을 담당)
	 * - Input/OutputStream 보유하고 있음.
	 *
	 *
	 *   ServerSocket
	 * - 포트와 연결되어 외부 요청을 기다리는 객체
	 * - 클라이언트의 연결 요청이 들어오면
	 *   클라이언트의 소켓을 얻어와 연결하게 된다.
	 *
	 * - 하나의 포트에는 하나의 ServerSocket만 연결 가능
	 * 
	 * */


public class ServerService {
	
	
	public void serverStart () {
		// 1) 서버의 포트번호 정함
		
		int port = 8500;
		// 포트는 1023을 초과하는 숫자라면 아무거나 가능함
		
		
		// 일단 다음 단계를 위한 소켓 용 참조변수의 선언
		ServerSocket serverSocket = null;
		Socket clieSocket = null; // 클라이언트용 소켓도 서버에 만들어야 한다 
		// => 클라이언트가 요청을 보낼 때 서버는 클라이언트의 소켓을 받는다. 
		// 그를 위해 클라이언트용 소켓을 담아줄 공간을 마련해 놔야 하기에 이렇게 선언한다
		
		// 입출력을 위한 참조변수가 필요
		InputStream is  = null;
		OutputStream os  = null;
		// 바이트 기반 최상위 클래스
		// 보조 스트림의 참조변수를 선언한다
		
		BufferedReader br = null;
		// 문자 보조스트림인데 위에서는 바이트 기반이었다. 따라서 바이트기반을 문자기반에 연결해야 한다
		
		PrintWriter pw  = null;
		// 문자 보조스트림인데 위에서는 바이트 기반이었다. 따라서 바이트기반을 문자기반에 연결해야 한다.
		
		// PrintWriter는 파일, 콘솔, 네트워크소켓 등 다양한 출력 스트림에서 데이터를 쉽게 출력 가능하게 함
		

		
		
		try {
			// 2) 서버용 소켓 객체 생성
			serverSocket = new ServerSocket(port); // 포트번호를 생성자에서 전달
			
			
			// 3) 클라이언트 쪽에서 접속 요청이 오길 기다림
			// 4) 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
			
			// 먼저 서버가 
			System.out.println("[Server]");
			System.out.println("client의 요청을 기다리는 중.....");

			clieSocket = serverSocket.accept(); // 수락
			// 이 함수는 client의 소켓을 반환 함
			//  클라이언트의 요청이 오고 수락이 될 때까지 무한 대기 -> 수락 시 클라이언트가 준 socket 전달 받음
			
			System.out.println("클라이언트가 접속에 성공했다!!");
			
			
			
			// 5) 연결된 클라이언트와 입출력 스트림 생성
			// 클라이언트는 서버 요청 시 소켓을 전달 => 그 안에 입출력 스트림을 위한 객체가 이미 담겨있다
			// 소켓에 입출력 스트림이 담겨있다
			is = clieSocket.getInputStream();
			os = clieSocket.getOutputStream();			

			// 6) 보조 스트림을 통해 성능 개선
			br = new BufferedReader( new InputStreamReader(is) );  // 문자 기반의 보조 스트림 
			// => is는 바이트기반인데 그를 바로 전달하면 안 됨
			// 문자 기반 BufferedReader와 바이트 기반인 InputStream을 연결할 수 있도록 InputStreamReader라는 함수를 함께 사용해야 함
			
			
			/*
			 * 문자 기반 BufferedReader와 바이트 기반인 InputStream을 연결할 수 있도록 InputStreamReader라는 함수를 함께 사용해야 함
			 * 바이트 기반 스트림을 인자로 주어 문자 기반으로 바꿈 
			 * => 이 보조 스트림을 통해 readLine등으로 읽어오기 편하게 하기 위해 이러한 스트림 변환 과정을 거쳐 바이트 기반을 문자 기반으로 바꾸는 것이다.
			 * */
			
			pw = new PrintWriter(os);
			// 7) 스트림을 통해 읽고 쓰기
			
			// 서버는 "너 서버에 접속 성공했어" 라는 메시지를 클라이언트에 보낸다
			
			// 2025년 03월 06일 12:17:30 [서버 접속에 성공하였습니다!]
			
			Date now = new Date(); // java.util.Date: 자바에서 시간을 나타내는 객체로 
			// new Date()라는 객체를 생성할 시 현재 시간이 저장
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss  ");
			String str = sdf.format(now) + "서버 접속에 성공하셨습니다! ";
			
			// 서버가 있으니 클라이언트에 출력
			pw.println(str); // PrintWriter.println(String ) 주어진 데이터를 문자 형태로 출력한 후 출력 후 줄바꿈 추가
			pw.flush(); // 스트림의 내용을 밀어낸다
			
			/***********************************************************/
			
			// 클라이언트 -> 서버 노드로 메시지를 전달 받는다
			// 메시지는 is를 전달받은 br을 통해 들어온다 
			String clientMessage = br.readLine();
			
			// 서버 노드 콘솔창에 클라이언트가 보낸 메시지와 클라이언트의 IP를 출력한다
			
			String clientIP = clieSocket.getInetAddress().getHostAddress(); //앞은 IP주소 제공 
			// getInetAddress()는 클라이언트에 대한 IP주소 정보를 포함하는 InetAddress를 반환
			// getHostAddress()는 InetAddress 객체에서 문자열 형식으로 반환하는 역할
			
			System.out.println(clientIP+"가 보낹 메시지는 "+ clientMessage);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
		
			
			try {
				// 8) 통신 종료
				
				// 스트림을 닫고
				if(br != null) br.close(); // -> is가 같이 닫힘
				if(pw != null) pw.close(); // -> os가 같이 닫힘
				
				// 소켓을 반드시 닫아야 함
				
				if(serverSocket !=null) serverSocket.close();
				if(clieSocket !=null) clieSocket.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	
		
		
		
		
		
	}
	
}
