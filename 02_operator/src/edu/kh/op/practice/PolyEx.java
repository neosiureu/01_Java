package edu.kh.op.practice;

class Parent {
    void show() {
        System.out.println("부모 클래스");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("자식 클래스");
    }
}


public class PolyEx {
    Parent obj1 = new Parent(); // 필드(멤버 변수)
    Parent obj2 = new Child();  
    Child obj3 = new Child();   

    // 메서드를 만들어서 실행 문장을 포함해야 함!
    public void execute() {
        obj1.show();  // "부모 클래스"
        obj2.show();  // "자식 클래스"
        obj3.show();  // "자식 클래스"
    }

     

	
}
