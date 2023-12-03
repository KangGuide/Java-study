package main;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.Cat;
import animal.Cow;
import animal.Dog;
import factory.AnimalFactory;
import factory.Person;
import item.Soldier;
import item.item;

public class MainPerson {

	public static void main(String[] args) {
		
		Person personOne = new Person();
		personOne.create(new Soldier());
		
		personOne.m_weapon.DrawWeapon();
		personOne.m_bomb.DrawBomb();
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(personOne);
		
	
		
		
	}
}
