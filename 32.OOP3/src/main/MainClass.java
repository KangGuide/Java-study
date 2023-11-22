package main;

public class MainClass {
	public static void main(String[] args) {
		/*
		 	constructor : 생성자
		 				  메소드(함수)
		 				  class 명과 같은 명칭의 함수
		 				  return 값이 없다
		 				  객체 생성시에 자동 호출된다
		 				  다시 호출할 수 없다( != 초기화 )
		 				  기본 값을 설정하는 경우가 많다
		 				  overload가 가능하다
		 	
		 	destructor : 소멸자
		 				 현재는 사용 안함
		 	
		*/
//		int array[] = new int[5];
		int array[] = { 1, 2, 3, 4, 5};
		
//		MyClass cls = {1, "홍길동", 181.2}; // 자바에서는 이렇게 사용불가		
		MyClass cls1 = new MyClass(111);
		MyClass cls2 = new MyClass(1, "홍길동", 181.2);
		
		String str = new String("hello");
		/*
		 	this 키워드(포인터)
		 	각 함수의 0번째 매개변수로 생성된 자기자신의 주소이다
		*/
		MyClass cls = new MyClass();
		System.out.println(cls);
		System.out.println(cls.getThis());
		
		MyClass my = new MyClass();
		System.out.println(my);
		System.out.println(my.getThis());
		
		YouClass ycls = new YouClass(1, "홍길동");
		
		
		
		
	}
}

class MyClass{
	int number;
	String name;
	double height;
	
	public MyClass() { // 기본 생성자
		number = 0;
		name = "";
		height = 0.0;
		System.out.println("MyClass MyClass()");
	}
	
	public MyClass(int num) {
		number = num;
		System.out.println("MyClass MyClass(int num)");
	}
	
	public MyClass(int num, String na, double he) {
		number = num;
		name = na;
		height = he;
		System.out.println("MyClass MyClass(int num, String na, double he)");
	}
	
	public MyClass getThis() {
		return this;
	}
	
}

//this
class YouClass {
	private int number;
	private String name;
	
	public YouClass() {
//		this(0, "");	// 위아래로 this 가 두개있으면 무한루프로 빠져버린다
		System.out.println("YouClass YouClass()");
	}
	public YouClass(int number, String name) {
		this(); // 기본 생성자 호출 (무조건 첫번째에 있어야 한다)
		this.number = number;
		this.name = name;
		System.out.println("YouClass YouClass(int number, String name)");
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	
	public void method() {
		int number = 123;	// 지역변수
		this.number = number;
	}
	
	
}