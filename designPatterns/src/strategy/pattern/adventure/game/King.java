package strategy.pattern.adventure.game;

public class King extends Character {
	
	public King() {
		weapon = new AxeBehaviour();
	}
	
	@Override
	public void display() {
		System.out.println("I'm the KING!");
	}

	@Override
	public void fight() {
		System.out.println("I attack with the King's AXE");
	}
}
