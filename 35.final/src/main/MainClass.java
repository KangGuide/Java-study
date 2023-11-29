package main;

public class MainClass {
 public static void main(String[] arge) {
	 /*
	  	final : 제약
	  	변수, 메소드, 클래스
	  
	 */
	 
	 final int number = 10; // 변수 -> 상수
//	 number = 20;
	 
	 int num = number; 		// 초기값
	 
	 final int MAX = 100;
	 final int MIN = 10;
	 int count = 25;
	 
	 if (count > MIN && count <= MAX) {
		
	}
	 
	 
	 
	 
	 
		 
 }
}

class Parent{
	
	public void method() { //virtual function
		
	}
}
/*
//위 클래스 원본
abstract class Parent{
	
	// OverRide 금지!
	public abstract void method() { //virtual function
		
	}
}
//상속금지!
final class Parent{
	
	// OverRide 금지!
	public final void method() { //virtual function
		
	}
}
*/

class Child extends Parent{
	
	public void method() { //OverRide
		
	}
}