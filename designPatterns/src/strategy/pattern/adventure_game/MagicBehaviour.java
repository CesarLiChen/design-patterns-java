package strategy.pattern.adventure_game;

public class MagicBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("'magic sounds'");
	}
}
