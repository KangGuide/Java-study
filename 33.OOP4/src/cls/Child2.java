package cls;

public class Child2 extends Parent2 {

	private int number;
	
	public Child2() {
//		super();
		System.out.println("Child2 Child2()");
	}
	
	// 생성자에서는 this 와 super를 같이 사용할 수 없다
	public Child2(String name) {
		super(name);
		
	}
	// 일반 메소드 및 함수에서는 this/super 같이 사용가능하다
	// Over Ride  (상속받은 클래스에서 고쳐기입)
	public void method() {
		this.number = 123;
		super.method();
		System.out.println("Child2 method()");
	}
	
	
	
	
}
