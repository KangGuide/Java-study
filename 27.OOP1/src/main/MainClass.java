package main;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	class : 객체지향의 설계도
		 	
		 	형식 :
		 	
		 	클래스 설계(선언)
		 	class 클래스명 {
		 		변수선언부
		 		
		 		함수(method)선언부 == 멤버함수 == 메소드
		 	}
		 	
		 	클래스 생성 // 자바에서는 필수로 생성
		 	클래스명 변수 = new 클래스명();
		*/
	//	같은 자료형의 변수의 묶음 == 배열
	//	다른 자료형의 변수의 묶음 == class
		
	//	(객체)자료형
		MyClass cls = new MyClass();
	//	cls : (클래스)변수 == 객체, instance(주체)
	//			stack		heap
		
		cls.number = 1000;
		cls.name = "홍길동";
		cls.height = 182.4;
		
		cls.method();
		
		// TV
		String name[] = new String[3];
		int channel[] = new int[3];
		boolean power[] = new boolean[3];
		
		name[0] = "samsung";
		channel[0] = 11;
		power[0] = true;

		name[1] = "LG";
		channel[1] = 23;
		power[1] = false;
		
		name[2] = "samsung";
		channel[2] = 25;
		power[2] = true;		
		
		/*
		TV tv = new TV(); 		// 객체를 할당
		tv.name = "LG";
		tv.channel = 22;
		tv.power = true;
		*/
		
		TV tv[] = new TV[3];	//객체배열만 선언
		tv[0] = new TV();		//실제 객체를 잡아야한다
		tv[0].name = "LG";
		tv[0].channel = 22;
		tv[0].power = true;
		
		//주사위(dice)
		int number[] = new int[2];
		String color[] = new String[2];
		
		number[0] = (int)(Math.random() * 6) + 1;
		number[1] = (int)(Math.random() * 6) + 1;
		
		System.out.println(number[0] + number[1]);
		
		Dice dice1 = new Dice();
		int num1 = dice1.getNumber();
		
		Dice dice2 = new Dice();
		int num2 = dice1.getNumber();
		
		System.out.println(num1 + num2);
		
	}
}

class MyClass{
	// (멤버)변수 선언부 field
	int number;
	String name;
	double height;
	
	// 메소드(멤버함수) 선언부 method
	void method() {
		System.out.println("MyClass method()");
	}
}

class TV{
	String name;
	int channel;
	boolean power;
}

class Dice{
	int number;
	String color;
	
	int getNumber() {
		number = (int)(Math.random() * 6) + 1;
		return number;
	}
}