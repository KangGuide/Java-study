package cls;

import java.security.PublicKey;

public class MyClass {
	
	//멤버변수 대부분 private
	private int number;
	public String name; // <- oop 규칙에 위배
	
	protected double height;
	
	// 멤버 메소드는 거의 public인 경우가 많다
	
	// getter, setter 함수
	public void setNumber(int num) {	// setter
		number = num; // 외부에서 값을 넘겨받아서 세팅
		
	} 
	public int getNumber() {	// getter
		return number;
		
	}
	
}
