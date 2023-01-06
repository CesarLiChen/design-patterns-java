package strategy.pattern.adventure_game;

public class AxeBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("'axe sounds'");
	}
}
