package strategy.pattern.adventure.game;

public class Knight extends Character{
	
	public Knight() {
		weapon = new SwordBehaviour();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a noble knight!");
	}

	@Override
	public void fight() {
		System.out.println("I attack with my sword");
	}
}
