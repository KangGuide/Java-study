package item;

import bomb.Bomb;
import weapon.Weapon;

public interface item {

	Weapon createWeapon();
	Bomb createBomb();
}
