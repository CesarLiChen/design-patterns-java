package strategy.pattern.adventure.game;

public abstract class Character {
	
	WeaponBehaviour weapon;
	
	public void setWeaponBehaviour(WeaponBehaviour wb) {
		this.weapon = wb;
	}
	
	public abstract void display();
	public abstract void fight();
}
