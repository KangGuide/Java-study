package main;

public class Study {

	public static void main(String[] args) {
		/*
		  	절차지향 -> 객체지향
		  	순서
		  	(1->2->3)	(1, 2, 3) -> (1->2->3)
		  	
		  	Object Oriented Programming 
		 	class -> object
		 	(멤버)variable
		 	(멤버)method
		*/
		
		//	stack			heap
		MyClass my = new MyClass();
		// (클래스)변수 = 객체(object), instance(주체)
		System.out.println(my);
		
		my.name = "홍길동";
		my.setNumber(1024);
		int num = my.getNumber();
		System.out.println(num);
		
	}
}

class MyClass{
	// (멤버)변수의 선언
	private int number; 	// <- 클래스 내부 접근 허용
	public String name;		// <- 어디서나 접근 허용
	protected double height;
	
	// setter, getter
	public void setNumber(int num) {	 
		number = num; // 보통 변수는 private로 하기 때문에 이렇게 외부에서 받아올 수 있다
	}
	public int getNumber() {
		return number;
	}
	
	
	// (멤버)함수의 선언
	public void method() {
		
	}
	
	public void func() {
		
	}
}