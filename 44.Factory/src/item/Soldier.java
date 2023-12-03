package item;

import bomb.Bomb;
import bomb.Dynamite;
import weapon.Gun;
import weapon.Weapon;

public class Soldier implements item {

	@Override
	public Weapon createWeapon() {
		return new Gun();
	}

	@Override
	public Bomb createBomb() {
		return new Dynamite();
	}

}
