package edu.kh.io.pack3.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {
	
	/*  ObjectOutputStream vs ObjectInputStream

java객체를 입출력할 때 사용하는 바이트 기반 보조 스트림 => 단독 사용 불가

직렬화 (Serializable): 객체를 직선 형태로 변환

직렬화란 객체의 상태 (필드 값)를 바이트 스트림으로 변환하는 과정

이를 통해 객체는 메모리에서만 존재하는 것 뿐 아니라 객체 자체를 파일로 저장 또는 네트워크로 전송

역직렬화: 바이트 스트림을 다시 객체 형태로 복원하는 과정. 즉 저장되거나 전송된 데이터를 원래의 객체 형태로 되돌리는 작업
 */

	/**
	 * 객체를 외부 파일로 출력
	 * 자바 프로그램 내부에서 회부로 출력
	 * 직렬화가 일단 필요
	 */
	public void objectOutput () {
		// 스트림을 위한 참조변수의 선언
		
		// 일단 기반 스트림부터
		FileOutputStream fos = null;
		ObjectOutput oos = null;
		
		try {
			fos=new FileOutputStream("/io/test/20250305/Member.dat ");
			// .dat확장자: data를 담고 있는 파일을 나타내는 확장자
			
			oos = new ObjectOutputStream(fos);
			
			// 여기에서 멤버 객체 생성
			Member member = new Member("member01","pass01","김회원",30);
			
			// ObjcetOutputStream 이용하여 Member객체를 출력하기
			oos.writeObject(member); // member라는 객체를 연결된 경로의 파일에 write하겠다
			// java.io.NotSerializableException: edu.kh.io.pack3.model.dto.Member

			// Member class를 직렬화하면 된다
			// 직렬화를 하기 위해 내보내려는 객체에 Serializable이라는 인터페이스를 구현해야 한다
			
			System.out.println("회원 데이터 출력 완료");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 외부 파일로부터 객체 입력받기
	 * 외부 -> 내부
	 * 따라서 역직렬화 필요
	 */
	public void objectInput () {
		// 스트림 참조변수의 선언
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			// 파일 입력 기반 스트림 생성
			fis = new FileInputStream("C:\\io\\test\\20250305\\Member.dat");
			// 실제 이 파일이 없으면 오류
			// 객체 입력 보조스트림의 생성
			ois = new ObjectInputStream(fis);
			
			// 스트림을 이용해서 파일에 작성된 직렬화된 Member객체를 읽어와 
			// 역직렬화를 수행하여 정상적인 Member객체로 변경
	
			// 반환하는 형태는 Objcet 
			// => 직렬화 되어있는 객체를 읽어와 역직렬화하여 Object타입을 반환하는 메서드
			
			Member member = (Member) ois.readObject();
			
			System.out.println(member);

			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		finally {
			try {
				if(ois!=null) ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
}
