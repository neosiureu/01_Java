package edu.kh.control.practice;
import java.util.*;
public class ConditionPractice {
	Scanner sc=new Scanner(System.in);
	
	public void practice1 () {
		System.out.print("숫자를 한 개 입력하세요. 꼭 양수여야 합니다: ");
		int myNum = sc.nextInt();
		String resultString;
		if(myNum<=0) {
			resultString= "양수만 입력해 주세요!!";
		}
		else {
			if(myNum%2==0) {
				resultString="짝수 입니다.";
			}
			else {
				resultString="홀수 입니다.";
				
				
			}			
		}
		
		System.out.println(resultString);

		
	}

	public void practice2 () {
		int kor, math, eng;
		String result;

		System.out.print("국어 점수: ");
		kor= sc.nextInt();
		System.out.print("수학 점수: ");
		math= sc.nextInt();
		System.out.print("영어 점수: ");
		eng= sc.nextInt();
		int sum= kor + math + eng;
		float avg = (sum /3.0f);
		if(kor<40 || math< 40 || eng<40) {
			result = "불합격입니다";
		}
		else {
			if(avg<60.0) {
				result = "불합격입니다";
			}
			
			else {
				result = "축하드립니다 합격입니다! ";
				System.out.println(sum);
				System.out.println(avg);
				

				
			}
			
		}

		System.out.println(result);


		
	}

	public void practice3 () {
		System.out.print("1월에서 12월 까지 중의 정수만 입력하세요: ");
		int month = sc.nextInt() ;
	
		switch (month) {
		case 1,3,5,7,8,10,12:
		{
			System.out.println(month+"월은 31일까지 있습니다");
			break;
		}
		case 2: {
			System.out.println(month+"월은 28일까지 있습니다");
			break;

		}
		case 4,6,9,11:
		{
			System.out.println(month+"월은 30일까지 있습니다");
			break;

		}
		default:
			System.out.println(month+" 월이라는 달은 없습니다. ");
		}
		
	}
	public void practice4 () {
		System.out.print("키 (m)을 입력해주세요: ");
		double height = sc.nextDouble() ;		
		System.out.print("몸무게 (kg)을 입력해주세요: ");
		double weight = sc.nextDouble() ;
		double bmi=  weight / (height * height);
		
		String result;
		
		if(bmi>=30.0) {
			result= "고도비만";
		}
		else if (bmi>=25.0) {
			result = "비만";
		}
		else if (bmi>=23.0) {
			result = "과체중";
		}
		
		else if (bmi>=18.5) {
			result = "정상 체중";
		}
		else {result = "저체중";}

		System.out.println("BMI지수: " + bmi);

		System.out.println(result);
	

	}
	
	public void practice5 () {
	
		String result;
		System.out.print("중간고사 점수: ");
		double mid= sc.nextDouble();
		System.out.print("기말고사 점수: ");
		double fin= sc.nextDouble();
		System.out.print("과제 점수: ");
		double hw= sc.nextDouble();
		System.out.print("출석 횟수: ");
		double attend= sc.nextDouble();
		mid *= 0.2;
		fin *= 0.3;
		hw*=0.3;
		// 복합 대입 연산자는 forced type casting을 할 수 있음
		// 따라서 위에서 int mid = sc.nextInt()로 받았다가 double을 곱해도 
		// 강제 형변환이 암시되어 있기 때문에 문제가 없음
		// 다만 위에서 int로 선언해놓고 int * 0.3으로 해놓고 mid에 넣어버리면 오류가 남
		
		final int TOTAL_CLASSES = 20;
		final double limit = 0.3;
		if(attend<= TOTAL_CLASSES*(1-limit)) {
			result = "Fail [출석횟수부족("+ (int) attend+"/20)]";
		}	
		else {
			System.out.println(" ================= 결과=================\r\n");
			System.out.printf("중간고사 점수 (20): %.1f\n",mid);
			System.out.printf("기말고사 점수 (30): %.1f\n", fin);
			System.out.printf("과제 점수 (30): %.1f\n" ,hw);
			System.out.printf("출석 점수 (20): %.1f\n",attend);
		
			double total = (mid+ fin+hw+attend);
			if (total<70) {
				result =  "총점:" +total +"\nFail [점수미달]"; 
			}
			
			else {
				result =  "총점:" +total +"\nPASS"; 
			}
		}
		System.out.println(result);
	}
	// 1 Set 예제 
	public void practice6() {
        Set<String> cities = new HashSet<>();
        cities.add("Seoul");
        cities.add("Busan");
        cities.add("Incheon");
        cities.add("Seoul"); // 중복 추가

        System.out.println(" Cities (Set): " + cities);

        // Set 요소 출력
        for (String city : cities) {
            System.out.println("- " + city);
        }
       
    }

    // 2️⃣ List 예제
    public void practice7() {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");
        animals.add("Dog"); // 중복 허용

        System.out.println("Animals (List): " + animals);

        // List 인덱스 기반 접근
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Animal " + i + ": " + animals.get(i));
        }
    }

    // 3️⃣ Map 예제
    public void practice8() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 78);
        scores.put("Bob", 95); // Key 중복 시 덮어쓰기

        System.out.println(" Scores (Map): " + scores);

        // Map 순회
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + "'s score: " + entry.getValue());
        }
    }
}


