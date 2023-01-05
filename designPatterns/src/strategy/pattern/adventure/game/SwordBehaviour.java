package strategy.pattern.adventure.game;

public class SwordBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("'sword sounds'");
	}
}
