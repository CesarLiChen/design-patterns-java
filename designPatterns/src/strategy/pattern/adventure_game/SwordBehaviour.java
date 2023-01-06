package strategy.pattern.adventure_game;

public class SwordBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("'sword sounds'");
	}
}
