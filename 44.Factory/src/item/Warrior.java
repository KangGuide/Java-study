package item;

import bomb.Bomb;
import bomb.C4;
import weapon.Sword;
import weapon.Weapon;

public class Warrior implements item {

	@Override
	public Weapon createWeapon() {
		return new Sword();
	}

	@Override
	public Bomb createBomb() {
		return new C4();
	}

}
