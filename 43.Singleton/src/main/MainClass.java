package main;

import cls.Animal;
import cls.Human;
import cls.Woman;
import single.SingletonClass;

public class MainClass {

	public static void main(String[] args) {
		
		Human h = new Human();
		Animal a = new Animal();
		Woman w = new Woman();

		/*
		String name = h.getName();
		a.setName(name);		
		System.out.println(a.toString());
		*/
		
		h.func();
		a.method();
		w.proc();
		System.out.println(a.toString()+"\n");
		System.out.println(w.toString()+"\n");
		
		w.gad();
		h.sad();
		System.out.println(h.toString()+"\n");
		
	}

}
