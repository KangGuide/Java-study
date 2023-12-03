package main;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.Cat;
import animal.Cow;
import animal.Dog;
import factory.AnimalFactory;

public class MainClass {
	public static void main(String[] args) {
		/*
		 	Singleton Pattern
		 		중심(접근)이 되는 데이터나 클래스로써
		 		모든 클래스에서 접근이 용의하게 하기 위한 패턴
		 	
		 	Factory Pattern
		 		원하는 클래스의 형태를 생성하기 위한 패턴
		*/
		
		Animal animal1 = AnimalFactory.create("멍멍이");
		Animal animal2 = AnimalFactory.create("야옹이");
		Animal animal3 = AnimalFactory.create("황소");
		
		animal1.printDescript();
		animal2.printDescript();
		animal3.printDescript();
		
		Dog d = (Dog)animal1;
		d.dogMethod();
		
		((Cat)animal2).catMethod();
		
		List<Animal> animalList = new ArrayList<Animal>();
		
//		Animal a = null;
		
		String animalName[] = { "황소", "황소", "야옹이", "멍멍이", "멍멍이", "멍멍이"};
		
		for (int i = 0; i < animalName.length; i++) {
			Animal a = AnimalFactory.create(animalName[i]);
			animalList.add(a);
		}
		
		for (int i = 0; i < animalList.size(); i++) {
			Animal a = animalList.get(i);
			
			a.printDescript();
			
			if(a instanceof Cat) {
				Cat cat = (Cat)a;
				cat.catMethod();
			}
			else if (a instanceof Dog) {
				Dog dog = (Dog)a;
				dog.dogMethod();
			}
			else if (a instanceof Cow) {
				Cow cow = (Cow)a;
				cow.cowMethod();
			}		
		}		
	}
}

