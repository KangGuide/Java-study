package factory;

import bomb.Bomb;
import item.item;
import weapon.Weapon;

public class Person {
	
	public Weapon m_weapon;
	public Bomb m_bomb;
	
	public void create(item item) {
		m_weapon = item.createWeapon();
		m_bomb  = item.createBomb(); 
	}

}
