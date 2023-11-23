package cls;

public class Child extends Parent{
	
	public void func() {
//		number = 1; 
		//private 변수는 자식에게 물려주지 않는다 본 클래스에서만 사용가능
		setNumber(1);
		name = "홍길동";
		height = 171.2;
		//public의 경우에는 모든곳에서 사용할 수 있기 때문에 자식클래스도 사용가능
	}
}
