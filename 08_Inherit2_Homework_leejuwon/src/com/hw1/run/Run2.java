package com.hw1.run;
import java.util.Scanner;
import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;
public class Run2 {

   public static void main(String[] args) {
      System.out.println("======학생들의 정보 출력======");
      
      
      Student std [] = new Student[3];
      std[0]= new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과") ;
      std[1]= new Student("김말똥",21,187.3,80.0,2,"경영학과") ;
      std[2]= new Student("이주원",23,167.0,45.0,4,"정보통신공학과") ;
      for(int i=0; i<std.length;i++) {
         System.out.println(std[i].information() );
      }

      System.out.println();

      System.out.println();
      Employee[] emp = new Employee[10];
      for(int i=0; i<emp.length; i++) {
         emp[i] = new Employee();
      }
      System.out.println("======사원들의 정보를 입력하세요=====");

      int cnt=0;
      Scanner in = new Scanner(System.in);
      while (true) {
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
         System.out.print("급여");
         emp[cnt].setAge(in.nextInt());
         in.nextLine();
         System.out.print("부처");
         emp[cnt].setName(in.nextLine());
         System.out.print("계속 정보를 추가하시겠습니까? Y/N으로 대답해주세요");
         cnt++;
         char answer = in.next().charAt(0);
         in.nextLine();
         if(answer != 'y' && answer != 'Y' ) {
            break;
         }
         
      }

      System.out.println("======사원들의 정보 출력======");

      for(int i=0; i<cnt; i++) {
          System.out.println(emp[i].information());
      }

   }
   
}
