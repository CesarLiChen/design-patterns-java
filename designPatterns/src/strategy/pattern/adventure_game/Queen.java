package strategy.pattern.adventure_game;

public class Queen extends Character {

	public Queen() {
		weapon = new MagicBehaviour();
	}

	@Override
	public void display() {
		System.out.println("I'm the QUEEN!");
	}

	@Override
	public void fight() {
		System.out.println("I attack with my magic granted to Queens");
	}
}
