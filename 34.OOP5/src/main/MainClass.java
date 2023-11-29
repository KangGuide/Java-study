package main;

import Inter.HeClass;
import Inter.MyInterface;

public class MainClass {
	public static void main(String[] args) {
	/*
	   abstract class : 추(정해서)상(상한다) 클래스
	   				추상 메소드를 하나이상 포함하고 있는 클래스
	   abstract method : 추상 함수
	   				내용은 없고 선언만 되어 있는 함수
	   일반함수(메소드)
	   public void method(int i){
	   	내용
	   }
	   
	   추상함수(메소드)
	   public void method(int i); <- 함수의 사양(prototype)
	   상속후에 (customizing)클래스에 원하는대로 구현하는것
	   			사용자 지정
	   
	*/
	
	/*
	 	abstract class : abstract method + method + variable
	 					다중 상속이 불가능
	 					
	 	interface : abstract method로만 구성되어 있는 (class)
	 				(선언되어 있는 메소드로만 구성)
	 				다중 상속이 가능
	 				빠르게 클래스 설계 또는 구성을 파악이 가능
	 				확장성에서 우수
	 
	 
	*/
	
	MyInterface myInter = new MyInterface() {	
		@Override
		public void abMethod() {
			System.out.println("MyInterface abstractMethod()");			
		}
	};
	
	myInter.abMethod();
	
	MyClass mycls = new MyClass();
	mycls.abstractMethod();
	
	HeClass hc = new HeClass();
	hc.abMethod();
	hc.func();
		
		
		
	/*
	  다중 상속이 불가능
	 class ParentOne{
	 }
	 class ParentTwo{
	 }
	 class Child extends ParentOne, ParentTwo{
	 }
	*/
	/*
//		1.
		MyClass cls = new MyClass();
		cls.method();
		cls.abstractMethod();
		
//		2.
		AbstractClass ac = new AbstractClass() {
			@Override
			public void abstractMethod() {
				System.out.println("AbstractClass abstractMethod()");		
			}
		};
		ac.method();
		ac.abstractMethod();
		
		
//		3.
		AbstractClass ac = new  MyClass();
		ac.method();
		ac.abstractMethod();
		*/
	}
}
// 추상클래스
abstract class AbstractClass{
	
	private String name;
	
	// 추상메소드
	public abstract void abstractMethod();
	
	public void method() {
		System.out.println("AbstractClass method()");
	}
}

class MyClass extends AbstractClass{

	@Override
	public void abstractMethod() {
		System.out.println("MyClass abstractMethod()");
	}
	
}


