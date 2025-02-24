package edu.kh.oarr.model.service;

import java.util.Arrays;
import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {
	
	// 속성
	private Scanner sc = new Scanner(System.in);
	
	// 회원 가입한 사람의 멤버 정보 "들"을 저장해둘 참조 볁수	
	// 즉 Memeber타입 5칸짜리 객체배열의 선언 및 할당
	
	private Member[] memberArr = new Member[5];
	// 이 요소의 객체들은 주소이며 모두 초기값이 null
	// 하지만 객체를 생성한 것은 아직 아님!!
	
	
	// 5명 중 현재 로그인한 회원의 정보를 저장할 참조 변수 선언
	private Member loginMember = null;
	// 현재 로그인 한 회원 한명에 대한 정보를 저장할 참조변수를 선언한 것
	
	public MemberService() {
		// memberArr 배열의 0,1,2인덱스에는 초기화
		memberArr[0] = new Member("user01", "pass01", "최길동",30, "서울") ;// 드디어 진짜 멤버 객체를 생성
		memberArr[1] = new Member("user02", "pass02", "계보린",25, "경기") ;// 두번째 생성
		memberArr[2] = new Member("user03", "pass03", "고길동",45, "경기") ;// 세번째 멤버 생성

	}
	
	// 만드는 즉시 기본생성자만 만든 상황에서도 원래 3명의 정보가 있게끔 하기 위함

	
	
	
//	public void ex () {
//		
//		System.out.println(Arrays.toString(memberArr));
//
//	// Arrays 클래스의 toString은 해당 배열의 모든 원소들의 실제 값을 출력한다
//
//	}
	
	
	
	// 기능
	
	// 메뉴 출력용 메서드
	public void displayMenu () {
		// 메뉴 선택용 지역변수
		int menuNum = 0;
		do {
			System.out.println();
			System.out.println("=======회원정보 관리 프로그램 V2======");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원정보 조회");
			System.out.println("4. 회원정보 수정");
			System.out.println("5. 회원을 거주 지역으로 검색하기");
			System.out.println("0. 프로그램 종료");
	
			System.out.print("메뉴 입력: ");
			menuNum = sc.nextInt();
			// 입력 버퍼에 남은 개행문자를 제거한다. 
			sc.nextLine();
			
			
			switch (menuNum) {
			case 1:
				System.out.println(signUp());
				break;		
			case 2:
				System.out.println(login());

				break;
			case 3:
				System.out.println(selectMember());
				break;
			case 4:
				int result = updateMember();
				if(result ==-1) {
					System.out.println("수정 실패! 로그인이 되어 있지 않습니다.");
					
				}			
				else if (result == 0) {
					System.out.println("수정 실패! 비밀번호가 일치하지 않습니다");
				}
				
				else {
					// 성공했을 경우, 즉 1을 반환할 때
					System.out.println("수정에 성공하셨습니다!! ");
				}
				
				break;
			case 5:
				searchRegion();
				break;
			case 0:
				System.out.println("프로그램 종료...");
				break;
			default: 
				System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력하세요");			
			} // 스위치 종료 괄호
		} // do 종료 괄호

			while (menuNum !=0);
			
		// do 뒤에 while이 오는 셈
	}
		
		
		
		
	// memberArr 중에서 비어있는 인덱슬 번호를 반환하는 메서드 => 없다면 -1을 반환
		public int emptyIndex() {
			for(int i=0; i<memberArr.length; i++) {
				// memberArr배열을 인덱스 0부터 끝까지 접근하여 참조하는 값이 null인 경우에 index를 반환하게 한다.
				if(memberArr[i]==null)
					return i;
			}
			// for문을 다 돌아도 null이 배열에 없다는 말
			return -1;
			
		}
			
		
		public String signUp() {
			System.out.println("============회원 가입 파트============");
			// memberArr배열에 새로운 회원을 받아줄 수 있는지 여부
			// 빈 공간이 있다면 인덱스 번호를 얻어 오기 => 보조 메서드 emptyIndex

			int index = emptyIndex();
			// memberArr배열에서 비어 있는 인덱스를 반환 받는다 (없으면 -1)
			
			if(index == -1) {
				// 빈 공간이 없어 회원 가입이 불가능하다
				return "회원가입 불가 => 인원수 초과";
			}
			
			else {
				// 회원가입이 가능할 때 => 회원의 정보를 받게 됨
				System.out.print("아이디: ");
				String memberId = sc.next();
				System.out.println();
				System.out.print("비밀번호: ");
				String memberPw = sc.next();
				System.out.println();
				System.out.print("비밀번호 확인: ");
				String memberPw2 = sc.next();
				System.out.println();
				System.out.print("이름: ");
				String memberName = sc.next();
				System.out.println();
				System.out.print("나이: ");
				int memberAge = sc.nextInt();
				System.out.println();
				System.out.print("지역: ");
				String memberRegion = sc.next();
				
				// 비밀번호와 그에 대한 확인이 일치하면 성공, 아니면 실패
				if(memberPw.equals(memberPw2)) {
					// 아직까지 member 객체가 없는 셈
					

					// 비어있는 index의 결과를 int 지역변수에 저장해 뒀었음
					memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, memberRegion);
					// sc로 입력받은 값을 새로운 객체 생성을 통해 생성하며
					// 할당된 주소를 memberArr의 비어있는 index에 대입.
					return "회원가입이 완료 되었습니다.";

				}
				else {
					return "회원가입 실패. 비밀번호와 비밀번호 확인이다릅니다!!";
				}
				
				
			}
			
			
		}
	
		public String login() {
			System.out.println("============로그인============");
			System.out.println();
			// 1) 아이디와 비밀번호를 입력 받는다.
			// 2) memberArr배열에는 현재 회원가입 한 멤버 객체들이 전부 존재 (id, pw등) memberArr 배열 내 요소를 순서대로 접근한다
			// 2-1) 현재 접근한 요소가 null이 맞는지 아닌지 확인한다
			// 2-2) 회원 정보가 실제로 있을 경우에는 회원 정보의 id pw가 1)에서 로그인하려고 입력 받은 id, pw와 같은지 비교한다.
			// 2-3) 일치 한다면 로그인 회원 정보 객체를 참조할 변수 loginMember에 현재 접근 중인 member[i]번째 요소에 저장된 주소를 얕은 복사
			// 3) 만일 같지 않다면 로그인 실패, 성공 여부에 따라 결과 값을 다르게 반환한다.
			// 로그인 성공 시 현재 로그인 한 사람의 이름 + 님 환영합니다!
			// 로그인 실패 시 아이디 또는 비밀번호가 일치하지 않는다는 말을 한다
			
			System.out.print("아이디 입력: ");
			String memberId = sc.next();
			System.out.print("비밀번호 입력: ");
			String memberPw = sc.next();

			for(int i=0; i<memberArr.length; i++) {
				if(memberArr[i]!=null){ //2-1
					// for문 돌고 제일 처음 하는 것은 현재 접근한 주소가 null인지 아닌지 확인.
					// 제일 먼저 확인한 결과 null이 아니면 해당 배열에 비밀번호, 아이디가 실제로 같은 것이 있는지 확인
				
					if(memberId.equals(memberArr[i].getMemberId())  // 2-2: 회원정보가 일단 있긴 있다는 가정
							&& memberPw.equals(memberArr[i].getMemberPw())) {
						loginMember = memberArr[i]; //2-3
						// return "로그인 성공!" + loginMember.getMemberName()+"님 환영합니다!"; 
						break; // 더 이상 같은 아이디와 비밀번호를 가진 것이 없기에 for문을 진행할 필요가 없음
					}
					}
				
			}
			
			if(loginMember==null) {
				
				return "로그인 실패. 아이디나 비밀번호가 일치하지 않습니다.";
			}
			
			else {
				
				return "로그인 성공!! "+loginMember.getMemberName()+" 님 환영합니다.";
			}
			

			
			
	}
		
		// 지역으로 회원을 검색하기 위한 메서드
		public void searchRegion () {
			System.out.println("====== 회원검색 (지역) ======");
			System.out.print("검색할 지역을 입력하세요: ");
			String inputRegion = sc.next();
			boolean flag = true; // 일치하는 지역을 찾으면 false로 바꿈
			// 1) memberArr 배열의 모든 요소를 순차적으로 접근한다
			// 2) memberArr[i]번 요소가 null인 경우 바로 반복을 종료한다 (break)
			// 3) 만약 i번쨰 요소가 null이 아니라면 memeber[i]에 저장된 region변수로 저장된 지역이 지금 입력받은 inputRegion과 같은 경우
			// memberArr[i]번째 요소에 저장된 객체에 존재하는 회원의 ID, 그리고 이름을 출력한다.
			// 4) 입력한 지역과 일치하는 회원이 존재하지 않느다면 "일치하는 검색결과가 없다는 말을 반환"
			
			for(int i=0; i<memberArr.length; i++ ) {
				// 2번: null인 배열을 만나면 더이상 순회X
				if(memberArr[i] == null) { break; } // 이것을 continue라고 생각했는데 왜 break지?
				// 3번
				if(memberArr[i].getRegion().equals(inputRegion)) {
					System.out.printf("아이디: %s, 이름: %s\n", memberArr[i].getMemberId() ,memberArr[i].getMemberName());
					flag = false; // 찾았다는 신호 => 아래 if flag가 실행되지 않도록
				}
				
				
			} // break하면 여기로
			
			if(flag)
			{
				System.out.println("일치하는 검색 결과가 없습니다..");
			}
			
		}

				
		
		public String selectMember () {
			System.out.println("======회원 정보 조회======");
			if(loginMember == null) {
				// 필드에 있는 loginMember가 참조하는 객체가 있는지 확인
				return "로그인 후 이용 바람";
			}
		
			// else가 필요 없을지도
					String inform = "이름: "+ loginMember.getMemberName()+"\n아이디 : "+loginMember.getMemberId()+
							"\n나이 : "+loginMember.getMemberAge()+"\n지역 : "+ loginMember.getRegion();
					return inform;				
			
		}
		
		public int updateMember () {
			// 로그인이 되어있지 않으면 -1
			// 비밀번호가 맞지 않으면 0
			// 비밀번호가 같아 수정이 이루어 졌다면 1 
			System.out.println("\n======회원 정보 수정======");

			if(loginMember == null) {
				return -1;
				}
			
			System.out.print("수정할 이름을 입력: ");
			String inputName = sc.next();
			System.out.print("수정할 나이를 입력: ");
			int inputAge = sc.nextInt();
			System.out.print("수정할 지역을 입력: ");
			String inputRegion = sc.next();
			System.out.print("비밀번호 입력: ");
			String inputPw = sc.next();
			
			// 4) 비밀번호가 같을 경우 로그인 한 회원의 이름, 나이, 지역을 변경 후 1반환
			if(inputPw.equals(loginMember.getMemberPw())) {
				loginMember.setMemberName(inputName);
				loginMember.setMemberAge(inputAge);
				loginMember.setRegion(inputRegion);
				return 1;
			}
			
			else {
				return 0;
				}				
		}	
}
	
