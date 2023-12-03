package main;

import dto.Human;
import observer.ObserverOne;

public class MainClass {
	public static void main(String[] args) {
		/*
		  	Observer : 정찰, 감시
		  			   감시자 패턴
		  			   user class <- Observer 삽입
		 
		*/
		
		Human human = new Human();
		
		// 감시자를 추가
		human.addObserver(new ObserverOne());
		
		human.setId("abc123");
		human.setPassword("aabbcc123");
		
		human.notifyObservers(human.getPassword());
		
		

	}
}
