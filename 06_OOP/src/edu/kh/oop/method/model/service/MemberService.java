// 4번의 2-2-1을 주목

package edu.kh.oop.method.model.service;

import java.time.Year;
import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService { // 멤버 객체 자체와는 다름
	
	// filed area
	
	private Member memberInfo = null; // 가입한 회원의 정보를 전역적으로 저장해줄 정보
	// 일시적으로 가입할 사람에 대한 정보임. arrayList를 이용하면 여럿 저장할 수 있음
	private Member loginMember = null; // 로그인한 회원의 정보를 저장할 변수
	// 회원가입 한 사람 중 로그인 한 사람에 대한 정보를 기억
	
	private Scanner sc = new Scanner(System.in); // 필드로 만든 함수임에도 getter setter X
	// 외부에서 이 sc에 접근할 일이 없으므로 만들지 않아도 좋음
	
	// 일종의 클래스이므로 기능과 속성이 있어야 함
	
	
	// constructor area

	
	// method area

	// 1) 메뉴 화면을 출력한다. 1번부터 5번까지
	public void displayMenu () {
		// 특정 횟수에 상관 없이 반복을 해야 하므로 do while을 쓰기로 한다.
		// 최초 한번은 do를 실행해야 적절하기 때문
		int menuNum =0; // 메뉴 선택용 변수
		do {
			System.out.println("==========회원 정보를 관리하는 프로그램==========");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원탈퇴");
			System.out.print("메뉴 입력 : ");
			menuNum= sc.nextInt();
			// 위에 정수를 입력하고 뭘 하던 nextLine()을 받을 것이므로 개행문자 하나를 제거한다.
		sc.nextLine(); // 입력버퍼에 개행 문자가 사라짐

			
			
			switch (menuNum) {
			case 1: 
				// signUp을 호출
				System.out.println(signUp());				
				// 내가 호출한 메서드가 리턴 하는 값을 잘 고려하자!
				break;
							
			case 2: 
				System.out.println(login());
				break;
			
			case 3: 
				System.out.println(selectMember());
				break;
			
			case 4: 
				int result = updateMember();
				if(result==-1) {
					System.out.println("로그인을 안했는데 어떻게 수정을 합니까");
				}
				
				else if (result == 0) {
					System.out.println("회원정보 수정 실패 (비밀번호 불일치)");
				}
				else { //1이 반환되는 경우
					System.out.println("회원정보가 수정되었습니다.");

				}
				
				break;
				
			case 5:
				System.out.println("회원 탈퇴 과정: ");
				int result2 = outMember();
				if(result2==-1) {
					System.out.println("로그인을 안했는데 어떻게 탈퇴를 합니까?");
				}
				
				else if (result2 == 0) {
					System.out.println("회원정보 수정 실패 (비밀번호 불일치)");
				}
				else if (result2 == 1) { //1이 반환되는 경우
					System.out.println("회원을 탙퇴하셨습니다. 지금까지 감사했습니다.");

				}
				else {
					System.out.println("그래요. 잘 생각했어요"); 
					System.out.println("회원 탈퇴가 취소되었습니다.");

					
				}
				
				
				break;
			case 0: System.out.println("프로그램 종료.."); break;
			default:
			System.out.println("잘못 입력하셨습니다. 메뉴에 있는 번호만 입력해주세요");
			} 
		
		}
		while (menuNum!=0);
		
	}
	
	// 회원가입을 맡는 기능
	public String signUp () { // 반환형이 생각이 안 나면 일단 void로
		System.out.println("\n*****회원가입*****");
		System.out.print("아이디: ");
		String memberId = sc.next();
		System.out.print("비밀번호: ");
		String memberPw = sc.next();
		System.out.print("비밀번호를 다시 입력해주세요 (확인): ");
		String memberPw2 = sc.next();
		
		System.out.print("실제 이름: ");
		String memberName = sc.next();

		System.out.print("나이: ");
		int memberAge = sc.nextInt();
		
		if(memberPw.equals(memberPw2) ) {
			// 두 비밀번호가 일치하여 계정이 생성되는 경우
		memberInfo	= new Member(memberId, memberPw, memberName, memberAge); 
			// 새로운 회원 객체가 생성되어야 함=> by 다른 파일에서 만든 생성자
			// 멤버 클래스를 이용하여 진짜 회원이라는 객체를 생성해야 함
			// 객체 생성 시 매개변수 생성자를 이용해야 편리
			return "회원가입에 성공하셨습니다. 축하드립니다!!";
			// 일관적인 반환형을 위해 println대신 
			// String으로 통일 된 분기구조를 갖게 한다. 
		
		
		}
		
		else {
			// 두 비밀번호가 달라서 실패하는 경우
			
			return "회원가입 실패: (비밀번호 불일치)" ;
			
		}
		
	}
	

	public String login() {
		// 회원 가입 여부를 확인하는 것
		// 내가 입력한 아이디와 비밀번호로 가입한 사람의 정보가 존재하는지 검사
		
		System.out.println("\n********로그인********");
		
		// 일단 회원가입을 진행하지 않았다면 먼저 회원가입부터 하라고 떠야

		if(memberInfo == null) { // 회원 정보가 존재하는지 여부가 null이면
			// null: 아무것도 참조하고 있지 않음
		
			// early return
			return "회원가입부터 진행해주세요! ";
		}
		// else를 굳이 할 필요가 없음 return의 뜻은 
		// 현재 메서드를 종료하고 값을 가진 상태로 
		// 해당 메서드를 호출한 곳으로 곧바로 돌아가겠다. 
		
		System.out.print("아이디: ");
		String memberId =  sc.next();
		System.out.print("비밀번호: ");
		String memberPw =  sc.next();
		// 이 번호를 memberInfo가 기억하는 id와 pw와 지금 받은 것들이 일치하는지 조사
		// 즉 위에서 입력한 지역변수.equals해서 memberInfo가 참조하는 Member객체에 저장된 값이랑 같은지 파악
		
		if(memberId.equals(memberInfo.getMemberId()) 
				&& memberPw.equals(memberInfo.getMemberPw())) {
			// 아이디 비번이 모두 일치하면 로그인한 사람의 정보를 기억
			// 회원정보를 수정하거나 하려면 기억을 해야 함
			// loginMember에 현재 로그인한 사람의 정보를 기억시키기
			// 회원은 한 명밖에 없지만 loginMember에 memberInfo가 참조하고있는 객체의 주소를 대입한다.
			loginMember = memberInfo; // 얕은 복사
			// 타입이 member로 똑같으므로 이렇게 할 수 있음
			// 회원가입 정보를 loginMember에 대입하여 어떤 회원이 로그인했는지 구분 가능하게 한다.
			return loginMember.getMemberName() +"님 환영합니다"; 
			// loginMemeber의 주소는 memberInfo를 가리키고 있으므로 이미 이 값을 기억하고 있음
			// 그러므로 회원가입 당시에 입력했던 객체의 정보를 가져올 수 있음
		}
		
		else {
			return "아이디, 비밀번호가 일치하지 않습니다."; 
		}
		
		// 즉 null이면 여기까지 올 일이 없고 회원가입 할때만 이것이 나옴
		
		// 회원가입 했다면 아이디와 비밀번호를 물어 봄
	
	}
	
	// 회원정보 조회 기능
	// 먼저 로그인을 했는지 하지 않았는지 탐색해야 함
	// 현재 로그인한 사람의 정보를 저장하고 있는 객체에서 이름, 아이디, 나이를 getting하여 출력한다.
	// 하지만 로그인을 하지 않은 경우 로그인 후 이용하라는 메시지를 띄운다
	
	@Override
	public String toString() {
		return "이름: "+loginMember.getMemberName()+"\n아이디: "+loginMember.getMemberId()+"\n나이: "+loginMember.getMemberAge()+"세";
	}
	
	public String selectMember () {
		
		System.out.println("\n******회원정보 조회******");

		if(loginMember==null) {
			return "로그인부터 진행하고 조회를 하세요^^" ;

		}
		
		return toString();
	}
	
	public int updateMember() {
		// 로그인을 안하면 거절
		// 이름과 나이만 수정 가능하고
		// 하려면 비밀번호를 입력 받게 함
		// 다만 비밀번호를 잘 입력한 경우와 잘 입력한 경우
		
		System.out.println("\n********회원정보 수정*********");
		// 1) 로그인 여부의 판별
		// 만일 로그인이 되어있지 않으면 -1을 반환한다.
		if(loginMember==null) {
			return -1;
		}
		
		// 2) 만일 로그인이 되어있을 때
		// 2-1) 수정할 회원 정보를 입력 받는다. 
		// 수정 가능한 것은 이름과 나이 뿐이며 어떤 것을 수정할지 정한다. 
	
		System.out.print("수정할 이름을 입력: ");
		// 한다면 새로 둘 다 입력하게 하자.
		String inputName = sc.next();
		System.out.print("수정할 나이를 입력: ");
		int inputAge = sc.nextInt();

		
		
		
		// 2-2) 비밀번호를 입력받아 현재 로그인한 회원의 비밀번호와 일치하는지 확인해라
		System.out.print("비밀번호를 아시는지 묻고싶습니다: " );
		String inputPw = sc.next();

		
		
		// 2-2-1) 비밀번호가 일치하는 경우에는 로그인 한 회원의 이름과 나이 정보를 방금 입력받은 값으로 변경
		// 변경을 성공적으로 완료 했다면 1을 반환
		
		
		if(inputPw.equals(loginMember.getMemberPw())) {
			
			// 로그인한 회원의 나이와 이름을 변경
			loginMember.setMemberName(inputName);
			loginMember.setMemberAge(inputAge);
			return 1;

			
			
		}
		// 2-2-2) 비밀번호가 다를 경우라면 0을 반환
		
		else {
			
			return 0;
		}
		

	}
	
	// CRUD => create read update delete (delete는 아직 없음)

	public int outMember() {
		// 로그인을 안하면 거절
				// 하려면 비밀번호를 입력 받게 함
				// 다만 비밀번호를 잘 입력한 경우와 잘못 입력한 경우로 나눠야
				
				System.out.println("\n********회원탈퇴*********");
				// 1) 로그인 여부의 판별
				// 만일 로그인이 되어있지 않으면 -1을 반환한다.
				if(loginMember==null) {
					return -1;
				}
				
			
				
				
				// 2-1) 비밀번호를 입력받아 현재 로그인한 회원의 비밀번호와 일치하는지 확인해라
				System.out.print("비밀번호를 아시는지 묻고싶습니다: " );
				String inputPw = sc.next();

				
				
				// 2-2) 비밀번호가 일치하는 경우에는 로그인 한 회원의 이름과 나이 정보를 방금 입력받은 값으로 변경
				// 탈퇴를 성공적으로 완료 했다면 1을 반환
				
				
				if(inputPw.equals(loginMember.getMemberPw())) {
					System.out.print("마지막으로 물을게요. 정말 탈퇴할거에요?: ");
				    String answer = sc.next(); // 한 번만 입력받기

//					if(sc.next().charAt(0)== 'Y'||sc.next().charAt(0)== 'y' ) 
				    // 위의 명령어대로 하면 scanner를 두 번 써서 두 번 쳐야 하기 때문에 원하는대로 동작하지 않음
				    if(answer.charAt(0) == 'Y' || answer.charAt(0) == 'y') 

				    {
						loginMember = null;
						memberInfo = null;
						// 회원의 로그인 정보를 null로 만들며, 가입 여부도 null로 만든다.
						return 1;

					}
					
					else {					
					return 2;}
					
					
				}
				// 2-2-2) 비밀번호가 다를 경우라면 0을 반환
				
				else {
					
					return 0;
				}
				
		
	}
	
	
	
	

}
