package strategy.pattern.adventure.game;

public class Troll extends Character {

	public void display() {
		System.out.println("** troll grunts **");
	}
	
	public void fight() {
		System.out.println("AAARGHHHH");
		System.out.println("** attacks with a trunk tree **");
	}
}
