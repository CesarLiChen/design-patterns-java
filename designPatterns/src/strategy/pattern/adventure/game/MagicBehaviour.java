package strategy.pattern.adventure.game;

public class MagicBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("'magic sounds'");
	}
}
