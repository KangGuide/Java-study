package main;

import animal.Animal;
import animal.Cat;
import animal.Cow;
import animal.Dog;
import cls.Child;
import cls.Child2;
import cls.Child3;
import cls.Parent3;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	은닉성(캡슐화) : 	외부로부터의 접근을 설정
		 					차단/허용 private/public
		 	
		 	상속성 inheritance : 부모클래스로부터 기능을 상속
		 					variable(변수) method(함수) -> 물려받는 것
		 	
		 	다형성 polymorphism : 상속 후에 여러가지 형태의 자식 클래스가 구성되는 것
		 	
		 	super : 부모 클래스의 instance(객체)를 가르키는 주소
		 	
		 	형식:
		 	
		 	class 부모클래스 {
		 		부모변수
		 		부모메소드
		 	}
		 	
		 	class 자식클래스 extends 부모클래스 {
		 		(부모변수) 
		 		(부모메소드)
		 		// 괄호를 한 이유는 우리눈에는 보이지 않기 때문
		 	}
		 	
		 	protected : 외부접근차단. 자식클래스만은 접근 허용
		 	
		*/
		/*
		Child ch = new Child();
		ch.Parent_method();
		ch.name = "성춘향";
//		ch.height = 180.2;
		// height는 protected 이기 때문에 자식클래스에서만 사용가능
		*/
		
		/*
		Child2 ch1 = new Child2();
		ch1.method();			
		Child2 ch = new Child2("홍길동");
		
		Parent3 p = new Parent3();
		p.method();
//		p.func();
		
		Child3 c = new Child3();
		c.parent_method();
		c.method();
		
		Parent3 p = new Child3();
		p.method();
		*/
		
		
		Cat cat[] = new Cat[10];
		Dog dog[] = new Dog[10];
		Cow cow[] = new Cow[10];
		cat[0] = new Cat();
		cat[1] = new Cat();
		dog[0] = new Dog();
		cow[0] = new Cow();
		
				
		Animal animal[] = new Animal[10];
		animal[0] = new Cat();
		animal[1] = new Cat();
		animal[2] = new Dog();
		animal[3] = new Cow();
		
		for (int i = 0; i < animal.length; i++) {
			if (animal[i] != null) {
				animal[i].speech();
				if(animal[i] instanceof Dog){
					Dog d = (Dog)animal[i];
					d.dog_method();
				}
				else if(animal[i] instanceof Cat){
					Cat c = (Cat)animal[i];
					c.cat_method();
				}
				else if(animal[i] instanceof Cow){
					Cow co = (Cow)animal[i];
					co.cow_method();
				}
			}
		}
		
		/*
		Animal ani = new Dog();
		ani.speech();
		
		// instanceOf : 어떤 자식클래스로 생성되었는지 산출하는 키워드
		if (ani instanceof Dog) {
			System.out.println("ani는 Dog클래스로 생성되었음");
		}
		
		// 자식클래스의 자료형으로 (cast)변환
		Dog d = (Dog)ani;
		d.dog_method();
		
		extends Object (자바 기본상속 항상 기본값)
		// 자바의 기본 최상위 클래스 객체 Object 이다
		*/
		
		Object obj = new MyClass();
		MyClass mycls = (MyClass)obj;
		mycls.myclass_method();
		
		Object yobj = new YouClass();

	}
	
}

class MyClass extends Object{
	public void myclass_method() {
		System.out.println("MyClass myclass_method()");
	}
}

class YouClass{
	
}