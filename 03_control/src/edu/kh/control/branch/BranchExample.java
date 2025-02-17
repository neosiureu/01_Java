package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	Scanner sc=new Scanner(System.in);
	
	public void ex1 () {
		// 1부터 10까지 1씩 증가하며 출력하되 다만 5 출력 시 반복문 종료
		
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
			if(i==5) {
				break;
				}

		}
		
	}
	
	public void ex2 () {
		// 입력 받은 모든 문자열의 누적, 단 "exit@"라는 문자열이 입력되면 문자열 누적을 종료 후 결과 출력
		String str = "";
	
		
		while(true) {
			System.out.println("문자열 입력, 다만 종료하려면 exit@를 입력");
			String input = sc.nextLine();
			// 여기서와 같은 nextLine은 다음 한 줄이라는 의미로 공백을 포함하여 읽어 온다. 
			// 반면 next는 다음 한 단어이며 공백을 포함하지 않는다.
		if(input.equals("exit@")) {
			// 자바에서 String형의 비교는 ==이 사용 되지 않는다. primitive가 아니기 때문
			// ==은 기본 자료형끼리의 연산에서만 사용 가능하다.
			// 따라서 기본적인 String 제공 메서드인 equals메서드를 사용할 것
			break;
		}
		str += input + "\n";
		}		
		System.out.println(str);	
	}
	
	public void ex3 () {
		// 1에서 부터 10까지 1씩 증가하며 출력하지만 3의 배수는 제외하고 출력하는 코드
		// 1 2 3 4 5 6 8 10 등등
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i+" ");

		}
		
	}
	
	public void ex4 () {
		// 1부터 100까지 반복하되, 5의 배수는 건너뛰어라. 또한 40이 되면 반복이 멈춰라
		for(int i=1; i<=100; i++) {
			
			
			if(i%5==0) {
				continue;
			}
			
			if(i==40) {
				break;
			}
		
			
			System.out.println(i);
		}
	}
	
	
	public void RSP () {
		// 가위바위보 게임에서 처음에는 몇 판을 할지 입력받는다. 입력받은 판 수 만큼 반복하게 된다.
		System.out.println("가위 바위 보 게임을 시작합니다.");
		System.out.println("몇 판의 게임을 진행하시겠습니까?");
		int round= sc.nextInt();
		// 승패를 누적하여 기록하기 위한 변수
		int win =0, draw =0, lose =0;
		
		for(int i=1; i<=round; i++) { // 입력받은 판 수만큼 반복
			System.out.println("\n현재 판 수: "+ i+ "번째 게임");
			System.out.print("가위 바위 보 중 하나를 입력하세요: ");
			String input = sc.next();
			int random = (int) (Math.random()*3+1); //123 중 하나를 반환한다.
			// 0.0이상 3.0 미만 => 1.0이상 4.0미만 => int로 타입 캐스팅하면 123 중 하나를 반환
			
			// 사람은 123이 아닌 가위 바위 보로 입력. 따라서 switch case를 이용하여 1,2,3을 문자열로 바꾸기로 한다
			String com = null;
			// null은 그 어떤 주소 값도 갖지 않는 주소 리터럴
			
			switch (random) {
			case 1: 
				com = "가위";
				break;
			
			
			case 2: 
				com = "바위";
				break;
			

			case 3:
				com= "보";
				break;
			
			}
			// 랜덤은 123만 나올 것이 분명하므로 디폴트를 써 주지 않음. 
			// 하지만 초기 값이 없을 때 오류가 발생할 수 있으므로 초기 값을 null로 하여 디폴트 없이도 가능하도록
			System.out.printf("컴퓨터는 [%s]를 선택했습니다\n",com);

			// 컴퓨터와 플레이어의 가위바위보 판별
			// 비긴 경우 -> 이기거나 진 경우
			if(input.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
			}
			
			else {
				boolean win1, win2, win3; // 플레이어가 이기는 경우
				win1 = input.equals("가위") && com.equals("보");
				win2 = input.equals("바위") && com.equals("가위");
				win3 = input.equals("보") && com.equals("바위");
				
				if(win1 || win2 || win3) {
					System.out.println("플레이어의 승리");
					win++;
				}
				
				else {
					System.out.println("졌습니다.");
					lose++;
				}
				
			}
			System.out.printf("현재 기록: [%d 승 %d 무 %d 패]",win,draw,lose);
			
			
		// 여기가 반복문의 마무리	
		}
		System.out.println("\n\n게임 끝");
		

		// 컴퓨터는 Math.random 메서드를 통해 1에서 3 사이의 난수를 생성한다. 
		// 다만 이 random 메서드는 0.0과 1.0사이 난수를 반환하므로 연산을 해야 함
		// 1이면 가위 2라면 바위, 3이라면 보를 판별한다.
		// 매 판마다 현재 기록을 누적하여 보여주며, 승무패 여부를 알려 줌.
		
		
		
	}

	public void RSP2 () {
		System.out.println("가위 바위 보 게임을 시작합니다. ");
		System.out.print("몇 판의 게임을 진행하시겠습니까?: ");
		int round = sc.nextInt();
		
		int win=0, draw=0, lose=0;

		for(int i=1; i<=round; i++) {
			System.out.printf("현재 판수: %d번째 게임\n", i);
			System.out.print("가위 바위 보 중 하나를 입력하세요: ");
			String choice = sc.next();
			String com = null;
			int comnum = (int) (Math.random()*3+1);

			switch (comnum) {
			case 1: 
				com="가위";
				break;
				
			case 2: 
				com="바위";
				break;
			case 3: 
				com="보";
				break;
			}
			// com이 항상 보로 저장되는 오류가 존재 했었는데 break를 쓰지 않아서 그랬다.
			// switch case break까지 한 번에 기억하자 (스코브, soc로 기억)
			
			System.out.printf("컴퓨터는 %s를 선택했습니다\n",com);

			if(com.equals(choice)) {
				draw++;
				System.out.println("무승부를 거두었군요!\n");
			}
			
			else {
				boolean myWin = (com.equals("가위") && choice.equals("바위")) 
					|| (com=="바위" && choice =="보") 
					||(com.equals("보") && choice.equals("가위"));
				
				if(myWin) {
					System.out.println("플레이어의 승리입니다.\n");
					win++;

				}
				else {
					System.out.println("컴퓨터의 승리입니다.\n");
					lose++;

					
				}
				
			}
			
			System.out.printf("현재 기록: %d승 %d무 %d패 ",win, draw, lose);

			
			
		}
		
	System.out.println("게임 종료");
	
		
	}
	public void ex0 () {
		String input1 = "exit@";
		String input2 = "exit@";
		System.out.println("exit@를 입력하라");
		String input3= sc.nextLine();
		System.out.println(input1==input2);
		System.out.println(input1==input3);
		System.out.println(input2==input3);

	}
	
	

}
