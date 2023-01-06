package strategy.pattern.adventure_game;

public abstract class Character {

	WeaponBehaviour weapon;

	public Character() {}

	public void setWeaponBehaviour(WeaponBehaviour wb) {
		this.weapon = wb;
	}

	public abstract void display();
	public abstract void fight();

	public void performAttack() {
		weapon.useWeapon();
	}
}
