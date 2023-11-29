package main;

public class MainClass {
	public static void main(String[] args) {
	 /*
	   	local variable : 지역변수 -> stack
	   	parameter variable : (지역변수) -> stack
	   	member variable : 멤버변수 -> heap
	   	
	   	static variable : global variable 정적변수 -> static
	   	static function : 정적함수 객체를 생성안하고 사용할 수 있는것이 장점
	   					여기서는 this 같은것을 사용할 수 없다
	   	
	 */

		int number = 1; // local(지역, 자동) 변수 -> stack
		
		{
			int num = 2; // local 변수 -> stack
		}
		
		System.out.println(MyClass.counting);
		
		MyClass cls = new MyClass();
		cls.func();
		cls.func();
		cls.func();
		
		MyClass cls1 = new MyClass();
		cls1.func();
		cls1.func();
		
		MyClass.staticMethod();
	}
	
	public static void func() {
		String str = "hello"; // local 변수 -> stack
	}
	
	public static void method(int n) { // parameter
		n = 1;		
	}
}

class MyClass{
	private String name; // class member 변수 -> heap
	
	int number = 0;
	static int counting = 0; // 정적변수
	
	public static void staticMethod() { // class method
		System.out.println("MyClass staticMethod()");
		
	}
	
	public void func() { // instance method
		int num = 0; // 지역변수
		num = num + 1;
		System.out.println("지역변수: num = " + num);
		
		number = number + 1;
		System.out.println("멤버변수: number = " + number);
		
		counting = counting + 1;
		System.out.println("정적변수: counting = " + counting);
	}
}
