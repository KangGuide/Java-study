package cls;

public class Child3 extends Parent3 {
	
	
	public void func() {
		System.out.println("Child func()");
	}

	@Override // <- namespace 주석(제시어)문
	public void method() {
		System.out.println("Child method()");
	}
	
	
	

}
