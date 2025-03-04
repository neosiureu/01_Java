package com.toyFactory.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;


public class ToyService {
	
	Scanner sc = new Scanner(System.in);
	
	// 필드는 셋 
	// 1) Scanner 
	// 2) 중복된 Toy객체가 없도록 저장할 컬렉션 Set
	// 3) 재료가 저장될 Map => 재료는 Map <Integer,String>
	// 가령 1= "면직물" 2= "플라스틱"과 같이 저장

	
	Set<Toy> toysets = new HashSet<Toy>();
	
	Map<Integer, String> materialMap = new HashMap<Integer, String>();
	
	public ToyService() {
		materialMap.put(1,"면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");
		
		Toy toy1 = new Toy("키시미시", 5, 15000, "분홍색", "19940505");
		toy1.getMaterial().add("면직물");
		toy1.getMaterial().add("플라스틱");
		
		
		Toy toy2 = new Toy("캣냅", 8, 27000, "보라색", "19960128");
		toy2.getMaterial().add("면직물");
		toy2.getMaterial().add("플라스틱");
		
		
		Toy toy3 = new Toy("파피", 12, 57000, "빨간색", "19931215");
		toy3.getMaterial().add("면직물");
		toy3.getMaterial().add("고무");
		toy3.getMaterial().add("플라스틱");
		
		
		
		Toy toy4 = new Toy("허기위기", 5, 12000, "보라색", "19940312");
		toy4.getMaterial().add("면직물");
		toy4.getMaterial().add("플라스틱");
		
		
		
		Toy toy5=new Toy("마이룸레그", 8, 36000, "분홍색", "19950805");
		toy5.getMaterial().add("고무");
		toy5.getMaterial().add("면직물");
		
		
		toysets.add(toy1);
		toysets.add(toy2);
		toysets.add(toy3);
		toysets.add(toy4);
		toysets.add(toy5);
	}
	
	
	
	
	
	
	public void displayMenu() {
		int choice=-1;
		do {
			System.out.println("<<<<    플레이타임 공장  >>>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
	
			
			System.out.print("메뉴를 입력 하세요: " );
			

			choice = sc.nextInt();
			
			switch (choice) {
			case 1: selectToy();
			System.out.println();

				break;
			case 2: createToy();
			System.out.println();

				break;
			case 3: deleteToy();
			System.out.println();

				break;
			case 4: selectToyByDate();
			System.out.println();

				break;
			case 5:  selectToyByAge() ;
			System.out.println();

			// 그 다음으로 어려웠던 문제 (위에서 이미 정렬 기준을 뒀기 때문에 익명 클래스를 사용해야 했으며, 이중 for문까지 반 필수적으로 강제되어 어려웠다)
				break;
			case 6: 
				Set<Integer> set = materialMap.keySet();
				for(Integer k: set) {
					System.out.print("키: "+k);
					System.out.println("- 값: "+materialMap.get(k));
				}
				
				System.out.print("재료 고유번호(key) 입력: ");
				int tmpNum = sc.nextInt();
				System.out.print("재료 입력: ");
				String tmpMaterial = sc.next();
				addMaterials(tmpMaterial, tmpNum);
				break;
				// 가장 어려웠던 문제
			case 7:  deleteMaterials();
			System.out.println();

				break;
		
			case 0: System.out.println("프로그램을 종료하셨습니다. ");
				break;
			default:
				System.out.println("메뉴에 맞지 않은 선택지입니다.. 0에서 7까지 중 하나만 선택 해주세요");
			} 
	
		}
		while (choice!=0);
		System.out.println("프로그램 종료");
		
	// display메뉴의 끝 중괄호	
	}
	
	public void selectToy() {
		System.out.println("전체 장난감 조회하기");
		for(Toy t: toysets ) {
			System.out.println( t.toString()
					);
		}
		
	}


	public void createToy () {
		System.out.println("새로운 장난감 추가");

		System.out.print("장난감 이름: ");
		String tmpName = sc.next();
		System.out.print("사용 가능 연령: ");
		int ableAge = sc.nextInt();
		System.out.print("가격: ");
		int tmpPrice = sc.nextInt();
		System.out.print("색상: ");
		String tmpColor = sc.next();
		System.out.print("제조일 (YYYYMMDD 형식으로 입력): ");
		String tmpDate = sc.next();
	
		Toy toyTmp = new Toy(tmpName, ableAge, tmpPrice, tmpColor, tmpDate);
		toysets.add(toyTmp);
		String choice;
		do {
			System.out.print("재료를 입력하세요 (그만 입력하고 종료하려면 q를 입력하세요)");
			choice =sc.next();
			if(!(choice.equals("q"))) {
				Set<Integer> set = materialMap.keySet();
				
				for(int k:set) {
					if(materialMap.get(k).equals(choice)) {
						toyTmp.getMaterial().add(choice);
					}
				} //하이라이트!!
			
				
			}	
		} while (!(choice.equals("q")) );
		
	}
	


	
	public void deleteToy () {
		System.out.print("삭제할 장난감의 이름을 입력하세요: ");
		String tmp = sc.next();
		for(Toy t:toysets ) {
			if(tmp.equals(t.getName())) {
				System.out.println(t.getName()+ " 가 삭제됩니다!");
				toysets.remove(t);
				return ;
			} 
		}
		System.out.println("일치하는 이름의 장난감이 없어 삭제할 수 없습니다. 다시 시도해주세요.");

		
	}
	
	public void selectToyByDate () {
		List <Toy> tmpList = new ArrayList<>(toysets);
		// System.out.println(tmpList);
		Collections.sort(tmpList);
		
		for(Toy t:tmpList) {
			System.out.println(t.toString());
		}	
	}

	
	public void selectToyByAge(){
		List<Toy> tmpList = new LinkedList<Toy>(toysets);
		
		Collections.sort(tmpList, new Comparator<Toy>() {
			@Override
			public int compare(Toy o1, Toy o2) {
				return o1.getAge() - o2.getAge();
			}
		}); 
		
		List <Integer> ageList = new LinkedList<Integer>();

		for(Toy i: tmpList) {
			ageList.add(i.getAge());
		}
		
		// System.out.println(ageList);
		
		Set <Integer> ageSet = new LinkedHashSet<Integer>(ageList);
		
		// System.out.println(ageSet);

		for(Integer i: ageSet) {
			System.out.println("연령"+i+"세");
			for(Toy j: tmpList) {
				if(j.getAge()== i) {
					System.out.println(j.toString());
				}
			}

		}		
	} 
	





	public Set<Toy> getToysets() {
		return toysets;
	}






	public void setToysets(Set<Toy> toysets) {
		this.toysets = toysets;
	}






	public Map<Integer, String> getMaterialMap() {
		return materialMap;
	}






	public void setMaterialMap(Map<Integer, String> materialMap) {
		this.materialMap = materialMap;
	}
	


		
		


		
	
	public void addMaterials(String tmpMaterial, int... tmpNum) {
	    boolean flag = true;
	    
	    // 여러 개의 tmpNum을 처리하기 위해 for문 사용
	    for (int num : tmpNum) { 
	        if (materialMap.containsKey(num)) { // 이미 등록된 키인지 확인
	            System.out.println("키 " + num + " 에는 이미 재료가 등록되어 있습니다.");
	            System.out.print("덮어쓰시겠습니까? (y/n): ");
	            char choice = sc.next().toLowerCase().charAt(0);
	            
	            if (choice == 'y') {
	                materialMap.put(num, tmpMaterial);
	                System.out.println("키 " + num + " 에 " + tmpMaterial + "가 덮어쓰여 등록되었습니다.");
	                flag = false;
	            } else {
	                System.out.println("덮어쓰기가 취소되었습니다.");
	                flag = false;
	            }
	        }
	        
	        if (flag) { // 기존에 존재하지 않는 경우 추가
	            materialMap.put(num, tmpMaterial);
	            System.out.println("키 " + num + " 에 " + tmpMaterial + "가 등록되었습니다.");
	        }
	    }
	}
	
	public void deleteMaterials() {
		System.out.println("=====재료 삭제=====");
		System.out.println("현재 등록된 재료");
		Set<Integer> set = materialMap.keySet();
		for(Integer k: set) {
			System.out.print("키: "+k);
			System.out.println("- 값: "+materialMap.get(k));
		}
		
		System.out.print("삭제할 재료명 입력: ");
		String deleter =  sc.next();
		boolean flag = true;
		for(Integer k: set) {
			if(deleter.equals(materialMap.get(k))) {
			 System.out.println(materialMap.remove(k)+"가 성공적으로 사라졌습니다");
				System.out.println();
				flag = false;
			}
		}
		if(flag) {
			System.out.println(deleter+"라는 재료는 존재하지 않습니다. 다시 한번 확인해주세요");
			System.out.println();

		}


	}

}
