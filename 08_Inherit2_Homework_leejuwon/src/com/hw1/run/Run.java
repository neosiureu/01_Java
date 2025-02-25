package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
   public static void main(String[] args) {
      System.out.println("======학생들의 정보 출력======");
      
      
      Student std [] = new Student[3];
      std[0]= new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과") ;
      std[1]= new Student("김말똥",21,187.3,80.0,2,"경영학과") ;
      std[2]= new Student("강개순",23,167.0,45.0,4,"정보통신공학과") ;
      
      // 자바에서 array collection과 같은 데이터를 순차적으로 간단히 반복할 수 있는 for문
      for(Student i : std ) {
          System.out.println(i.information() );
      }
      // 포 - 타입 - element : 배열
      
  

      System.out.println();
      System.out.println();
      
      Employee[] emp = new Employee[10];
      
//      for(int i=0; i<emp.length; i++) {
//         emp[i] = new Employee();
//      }
      
      System.out.println("======사원들의 정보를 입력하세요=====");

      Scanner in = new Scanner(System.in);
      int cnt=0;
      while (true) {
    	 emp[cnt] = new Employee();
         System.out.print("이름: ");
         String myName = in.nextLine();
         emp[cnt].setName(myName);
         System.out.print("나이: ");
         emp[cnt].setAge(in.nextInt());
         in.nextLine();
         System.out.print("신장: ");
         emp[cnt].setHeight(in.nextDouble());
         in.nextLine();
         System.out.print("몸무게: ");
         emp[cnt].setWeight(in.nextDouble());
         in.nextLine();
         System.out.print("급여: ");
         emp[cnt].setSalary(in.nextInt());
         in.nextLine();
         System.out.print("부처: ");
         emp[cnt].setDept(in.nextLine());
         System.out.print("계속 정보를 추가하시겠습니까? Y/N으로 대답해주세요: ");
         cnt++;
         
         String str  = in.next();
         //= in.next().toUpperCase(); //반환 값이 대문자로 됨
        
         if(str.equalsIgnoreCase("N")) { // 대소문자를 구분하지 않고 두 문자열이 같으면 참, 아니면 거잣
        	break;
         }
         
        
         
      }

      System.out.println("======사원들의 정보 출력======");

      for( Employee i: emp) {
    	  // 0번째부터 1번째는 제대로 출력되나 2번째 인덱스 부터는 NullPointException이 발생한다.
    	  // null에는 information이라는 메서드가 없다!!
    	  // 따라서 이 조건을 추가한다.   	  
    	  if(i==null) {
    		  break;
    	  }
    	  System.out.println(i.information());
      }

    
      


   }
   
}
