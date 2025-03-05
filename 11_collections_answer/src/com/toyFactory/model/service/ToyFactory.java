package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {

	// 필드

	// 입력용 객체
	private Scanner sc = new Scanner(System.in);
	// 중복된 Toy 객체가 없도록 저장할 컬렉션 중 Set
	private Set<Toy> toySet = new HashSet<Toy>();
	// 재료가 저장되어있는 map
	private Map<Integer, String> materialMap = new HashMap<Integer, String>();

	// 메서드
	public ToyFactory() { // 기본생성자
		// 기본 등록된 재료
//		materialMap.put(1, "면직물");
//		materialMap.put(2, "플라스틱");
//		materialMap.put(3, "유리");
//		materialMap.put(4, "고무");

		// 현재 제작된 장난감

		// 1. 일반 배열 사용
		// toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(new
		// int[] {1,4})));

		// 2. List.of() 사용
		// toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805",
		// addMaterials(List.of(1, 4))));

		// 3. Arrays.asList() 사용
		// toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805",
		// addMaterials(Arrays.asList(1, 4))));

		// 4. 가변인자 사용
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1, 4)));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", addMaterials(1, 2)));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", addMaterials(1, 2)));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", addMaterials(1, 2)));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addMaterials(1, 2, 4)));

	}

	/**
	 * 매개변수로 전달받은 값들을 재료저장 Map에 있는지 확인하고 Set형태로 반환하는 메서드
	 * 
	 * 가변인자 작성법 : 자료형...변수명 -> 매개변수의 수가 정확히 몇개인지 특정할 수 없을 때 사용
	 * 
	 * @return
	 */
	public Set<String> addMaterials(Integer... materials /* List<Integer> materials */ /* int[] materials */) {

		// 매개변수로 전달받은 재료를 저장하여 반환할 Set객체를 생성
		Set<String> addedMaterials = new HashSet<String>();

		for (Integer meterialKey : materials) {

			// Map에서 재료 고유 번호(key)에 대응하는 재료명(value)을 가져와서
			// addedMaterials에 추가
			String materialValue = materialMap.get(meterialKey);

			// map에 없는 key를 입력하여 value를 얻어왔을 때 == null

			if (materialValue != null) { // 재료 목록에 이미 있다고 가정하면
				addedMaterials.add(materialValue); // 그 재료를 Toy 생성자에서 추가한다.
			}

		}

		return addedMaterials; //추가한 materials를 반환한다.
	}

	
	public void displayMenu() {

		int menuNum = 0;

		do {
			System.out.println("\n<< 플레이타임 공장 >>\n");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");

			try {

				menuNum = sc.nextInt();

				switch (menuNum) {
				case 1: displayAllToys(); break;
				case 2: createNewToy(); break;
				case 3: deleteToy(); break;
				case 4: displayToysByManufactureDate(); break;
				case 5: displayToysByAge(); break;
				case 6: addMaterial(); break;
				case 7: removeMaterialByName(); break;
				case 0:
					System.out.println("프로그램을 종료합니다");
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요!");

				}

			} catch (Exception e) {
				System.out.println("알맞은 입력을 해라...(경고)..");
				e.printStackTrace();

				sc.nextLine(); // 입력 버퍼에 남은 잘못된 문자 비우기

				menuNum = -1;
				// 첫 반복에서 예외 발생 시 종료되지 않도록 menuNum 값을 임의의 값으로 세팅
			}

		} while (menuNum != 0);

	}
	
	public void displayAllToys() {
	    System.out.println("\n<전체 장난감 목록>");
	    if(toySet.isEmpty()) { //toySet이 비어있다면 
	        System.out.println("생성된 장난감이 없습니다.");
	        return;
	    }
	    int index = 1;
	    for(Toy toy : toySet) { // for each문을 활용하되 index를 늘릴 수 없으므로 따로 변수를 선언해야 한다.
	        System.out.println(index + ". " + toy);
	        index++;
	    }
	}

	public void createNewToy() throws Exception { //혹시 모를 예외처리를 대비해
	    System.out.println("\n<새로운 장난감 추가>");
	    System.out.print("장난감 이름 : "); 
	    String name = sc.next();
	    for(Toy existingToy : toySet) { // 각 toySet 원소에 대해
	        if(existingToy.getName().equals(name)) { // 순회해가며 getName을 하면 각 장난감의 이름이 나온다. 
	        	// String.equals로 입력받은 name과 비교한다
	            System.out.println("이미 같은 이름을 가진 장난감이 존재합니다.");
	            return; //이미 같은 이름의 장난감이 있다면 더 이상 입력받지 않는다.
	            // Set은 완전히 똑같은 객체는 걸러주지만 이름만 똑같고 다른 정보가 다른 객체는 중복 확인에 있어 거를 수 없으므로 이렇게 해야 함
	        }
	    }
	    System.out.print("사용 가능 연령 : ");
	    int age = sc.nextInt();
	    System.out.print("가격 : ");
	    int price = sc.nextInt();
	    System.out.print("색상 : ");
	    String color = sc.next();
	    System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
	    String manufactureDate = sc.next();
	    Set<String> materials = new HashSet<String>(); // materials는 문자열만 들어와야 하므로 제네릭
	    // 또한 중복되는 재료는 없어야 하므로 
	    // 여기에서 materials라는 이름의 HashSet을 생성한다. (원래 재료 목록은 materialMap이라는 Map에 있었다는 것을 잊지 말자)
	    System.out.println("사용 가능한 재료 목록");
	    for(Entry<Integer, String> entry  : materialMap.entrySet()) { //  Entry라는 객체는 내부 인터페이스의 일종
	        System.out.println(entry.getKey() + " : " + entry.getValue());  // entry.getKey() entry.getValue()메서드로 
	        // 키와 값을 뽑아온다 
	    }
	    
	    /*Entry 객체를 따로 생성한 것이 아니라 
	     * materialMap.entrySet()을 통해 Map이 가지고 있는 key-value 쌍을 Entry 형태로 가져와 사용하는 것. 
	     * 따라서 Entry를 직접 생성하지 않아도 entrySet()을 통해 활용할 수 있다.
	     * */
	    while(true) {
	        System.out.print("추가할 재료의 번호를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
	        try {
	            String input = sc.next(); //입력받는 타입은 문자열
	            if(input.equals("q")) {
	                break;
	            }
	            int materialKey = Integer.parseInt(input); // parseInt를 할 때 q가 아닌 다른 문자열이 온다면 예외 발생
	            String material = materialMap.get(materialKey); // 받은 문자열을 키 삼아 값을 반환하여 String material에 저장
	            if(material != null) {
	                if(materials.contains(material)) {
	                    System.out.println("이미 추가된 재료입니다. 다른 재료를 선택하세요"); // 문자열의 contains 메서드로 비교
	                } else {
	                    materials.add(material);
	                    System.out.println("재료가 추가되었습니다 : " + material); // 재료 추가 성공 시 
	                }
	            } else {
	                System.out.println("잘못된 번호입니다. 다시 입력해주세요."); // 재료의 번호가 없으면 이를 출력
	            }
	        } catch(NumberFormatException e) {
	            System.out.println("숫자를 입력하거나 q를 입력하세요."); // 숫자나 q를 제외한 다른 문자열을 입력할 때
	            // int materialKey = Integer.parseInt(input) 과정에서 발생하는 오류를 catch
	            //
	        }
	    }
	    Toy newToy = new Toy(name, age, price, color, manufactureDate, materials); // materials라는 Set 객체를 마지막 인자로 
	    // (필드에 있는 맵 객체 materialMap과는 다름. materials는 중복이 없어야하며 무조건 문자열만 들어와여야 함)
	    toySet.add(newToy);
	    // 해당 Toy객체를 add로 set에 저장.
	    System.out.println("새로운 장난감이 추가되었습니다!");
	}

	public void deleteToy() throws Exception {
	    System.out.println("\n<장난감 삭제하기>");
	    if(toySet.isEmpty()) {
	        System.out.println("생성된 장난감이 없습니다.");
	        return;
	    }
	    System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
	    String toyName = sc.next();
	    boolean flag = false;
	    for(Toy toy : toySet) {
	        if(toy.getName().equals(toyName)) {
	            toySet.remove(toy);
	            flag = true;
	            break;
	        }
	    }
	    if(flag) {
	        System.out.println("장난감이 삭제되었습니다.");
	    } else {
	        System.out.println("해당하는 이름의 장난감을 찾을 수 없습니다.");
	    }
	}

	public void addMaterial() throws Exception {
	    System.out.println("\n<재료 추가>");
	    System.out.println("---현재 등록된 재료---");
	    if(materialMap.isEmpty()) {
	        System.out.println("등록된 재료가 없습니다.");
	        return;
	    }
	    for(Entry<Integer, String> entry : materialMap.entrySet()) {
	        System.out.println(entry.getKey() + " : " + entry.getValue());
	    }
	    System.out.println("-------------------------------------");
	    System.out.print("재료 고유번호(Key) 입력 : ");
	    int key = sc.nextInt();
	    System.out.print("재료명 입력 : ");
	    String material = sc.next();
	    if(materialMap.containsKey(key)) {
	        System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
	        System.out.print("덮어쓰시겠습니까? (Y/N) : ");
	        String input = sc.next();
	        if(input.equalsIgnoreCase("Y")) {
	            materialMap.put(key, material);
	        } else {
	            System.out.println("재료 추가가 취소되었습니다.");
	        }
	    } else {
	        materialMap.put(key, material);
	        System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
	    }
	}

	public void removeMaterialByName() throws Exception {
	    System.out.println("\n<재료 삭제>");
	    System.out.println("---현재 등록된 재료---");
	    if(materialMap.isEmpty()) {
	        System.out.println("등록된 재료가 없습니다.");
	        return;
	    }
	    for(Entry<Integer, String> entry : materialMap.entrySet()) {
	        System.out.println(entry.getKey() + " : " + entry.getValue());
	    }
	    System.out.println("-------------------------------------");
	    System.out.print("삭제할 재료명 입력 : ");
	    String materialName = sc.next();
	    boolean flag = false;
	    for(Entry<Integer, String> entry : materialMap.entrySet()) {
	        if(entry.getValue().equals(materialName)) {
	            materialMap.remove(entry.getKey());
	            System.out.println("재료 '" +  materialName + "' 가 성공적으로 제거되었습니다.");
	            flag = true;
	            break;
	        }
	    }
	    if(!flag) {
	        System.out.println("해당 이름의 재료가 존재하지 않습니다.");
	    }
	}
	
	public void displayToysByManufactureDate() {
	    System.out.println("\n<제조일 순으로 장난감을 정렬>");
	    if(toySet.isEmpty()) {
	        System.out.println("생성된 장난감이 없습니다.");
	        return;
	    }
	    List<Toy> toyList = new ArrayList<Toy>(toySet);
	    Collections.sort(toyList, new Comparator<Toy>() {
	        @Override
	        public int compare(Toy o1, Toy o2) {
	            return o1.getManufactureDate().compareTo(o2.getManufactureDate());
	        }
	    });
	    int index = 1;
	    for(Toy toy : toyList) {
	        System.out.println(index + ". " + toy);
	        index++;
	    }
	}

	public void displayToysByAge() {
	    System.out.println("\n<연령별로 사용 가능한 장난감>");
	    Map<Integer , List<Toy>> toysByAge = new HashMap<Integer, List<Toy>>();
	    for(Toy toy : toySet) {
	        int age = toy.getAge();
	        toysByAge.putIfAbsent(age, new ArrayList<Toy>());
	        toysByAge.get(age).add(toy);
	    }
	    for(Entry<Integer, List<Toy>> entry : toysByAge.entrySet()) {
	        int age = entry.getKey();
	        List<Toy> toyList = entry.getValue();
	        System.out.println("[연령 : " + age + "세]");
	        int index = 1;
	        for(Toy toy : toyList) {
	            System.out.println(index + ". " + toy);
	            index++;
	        }
	    }
	}


	
	
	

}